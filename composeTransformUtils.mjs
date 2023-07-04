import Color from 'tinycolor2';
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';

const composeTransformUtils = (brandName, styleDictionary) => {

styleDictionary.registerTransform({
    name: 'name/composeColorName',
    type: 'value',
    matcher: function(prop) {
       return prop.attributes.category === 'palette';
    },
    transformer: function(prop) {
      const hex = Color(prop.value).toHex();
      return `Color(0xFF${hex})`;
    }
});

styleDictionary.registerTransform({
    name: 'name/composeColorReference',
    type: 'value',
    matcher: function(prop) {
       return prop.attributes.type === 'color';
    },
    transformer: function(prop) {
      return `${brandName}Palette.${prop}`;
    }
});



styleDictionary.registerTransform({
                 name: 'size/px_to_dp',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['spacing', 'borderRadius', 'borderWidth'].includes(token.type),
                 transformer: function(token)  {
                    if (token.value.endsWith('px')) {
                      const dimen = transformDimension(token.value);
                      return `${dimen}.dp`.replace(/px/g, "");
                    } else if (token.value.endsWith('%')) {
                      const value = token.value.replace('%', '');
                      return `RoundedCornerShape(${value})`;
                    } else {
                      return token.value;
                  }
                 }
});


styleDictionary.registerTransform({
                 name: 'size/px_to_sp',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['fontSizes'].includes(token.type),
                 transformer: function(token)  {
                    if (token.value.endsWith('px')) {
                      const dimen = transformDimension(token.value);
                      return `${dimen}.sp`.replace(/px/g, "");
                    } else if (token.value.endsWith('%')) {
                      const value = token.value.replace('%', '');
                      return `RoundedCornerShape(${value})`;
                    } else {
                      return token.value;
                  }
                 }
});

styleDictionary.registerTransform({
                 name: 'size/composeLineHeight',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['lineHeights'].includes(token.type),
                 transformer: function(token)  {
                  // Return the float value
                  return token.value.replace("%", "") / 100;
                 }
});

styleDictionary.registerTransform({
                 name: 'name/composeFontWeight',
                 type: 'value',
                 transitive: true,
                   matcher: function(prop) {
                        return prop.attributes.category === 'fontWeight';
                     },
                 transformer: function(token)  {
                 return `FontWeight(${token.value})`;
                 }
});


styleDictionary.registerTransform({
                 name: 'name/composeFontFamily',
                 type: 'value',
                 transitive: true,
                   matcher: function(prop) {
                 return prop.attributes.category === 'fontFamily';
                 },
                 transformer: function(token)  {
                 const fontInLowerCase = token.value.toLowerCase()
                 const fontFamily = `FontFamily(Font(R.font.${fontInLowerCase}_regular))`
                 return fontFamily;
                 }
});


styleDictionary.registerFormat({
                   name: 'compose/typography',
                   formatter: function (dictionary, config) {
                     return `
package br.com.cogna.pegasusdesignsystemandroid.brands.${brandName.toLowerCase()}.tokens
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object ${brandName}TypographyTokens{
${dictionary.allProperties
  .map((prop) => {
   const  fontSizeValue =  String(prop.value.fontSize).replace("sp", "");
    const lineHeight = prop.value.lineHeight * fontSizeValue;
    const lineHeightRounded = Math.ceil(lineHeight)
    return `
val ${prop.name}  = TextStyle(
   fontFamily = ${prop.value.fontFamily},
   fontWeight = ${prop.value.fontWeight},
   fontSize = ${prop.value.fontSize},
   lineHeight = ${lineHeightRounded}.sp,
)`})
  .join('\n')}
}
`
  },
 })

styleDictionary.registerTransform({
                 name: 'shadow/compose',
               type: 'value',
               matcher: function(prop) {
                 return prop.attributes.category === 'shadow';
               },
                 transformer: function(prop) {
                   // destructure shadow values from original token value
                   const {
                     x,
                     y,
                     blur,
                     spread,
                     color,
                     alpha
                   } = prop.original.value

                   // convert hex code to rgba string
                   const shadowColor = Color(color)
                   const hex = shadowColor.toHex()

                   return `PegasusShadowProperties(offsetX = ${x}.dp, offsetY = ${y}.dp, blur = ${blur}.dp, Color(0xFF${hex}))`
                 }
             , })



//End composeTransformUtils
}

export { composeTransformUtils };
