import Color from 'tinycolor2';
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';

const composeTransformUtils = (styleDictionary) => {

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
      return `SofiaPalette.${prop}`;
    }
});



styleDictionary.registerTransform({
                 name: 'size/px_to_dp',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['spacing', 'borderRadius', 'borderWidth', 'fontSizes', 'lineHeights'].includes(token.type),
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
                 name: 'size/composeFontWeight',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['fontWeights'].includes(token.type),
                 transformer: function(token)  {
                 return "FontWeight.${token.value}";
                 }
});

//Todo: this font family
styleDictionary.registerTransform({
                 name: 'name/composeFontFamily',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['fontFamilies'].includes(token.type),
                 transformer: function(token)  {
                   return '"Teste"';
                 }
});

styleDictionary.registerTransform({
                 name: 'name/composeTypography',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['typography'].includes(token.type),
                 transformer: function(token)  {
                   const {value} = token
                       return `${value.fontWeight} ${value.fontSize}/${value.lineHeight} ${value.fontFamily}`;
                     }
});

styleDictionary.registerTransform({
                 name: 'name/composeElevation',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['boxShadow'].includes(token.type),
                 transformer: function(token)  {
                 /* const shadow = Object.values(token.value);
                 const [x, y, blur, spread, color] = shadow.map((s) => s.toString());
                 //TODO

                    // Allow both single and multi shadow tokens:
                  const shadows = Array.isArray(token.value) ? token.value : [token.value];

                  const transformedShadows = shadows.map((shadow) => {
                       const { x, y, blur, spread, color, type } = shadow;
                       const inset = type === "innerShadow" ? "inset " : "";
                       return `${inset}${x}px ${y}px ${blur}px ${spread}px ${color}`;
                     });

                     return transformedShadows.join(", "); */

                    return "1.dp";
                 }
});


}

export { composeTransformUtils };
