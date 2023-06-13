import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-config.json' assert { type: 'json' };
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';


const styleDictionary = StyleDictionary.extend(config);

styleDictionary.registerTransform({
    name: 'name/globalSofiaComposeColorName',
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
    name: 'name/sofiaColorReference',
    type: 'value',
    matcher: function(prop) {
       return prop.attributes.type === 'color';
    },
    transformer: function(prop) {
      return `SofiaPalette.${prop}`;
    }
});


styleDictionary.registerTransform({
                 name: 'my/size/px',
                 type: 'value',
                 transitive: true,
                 matcher: token => ['spacing'].includes(token.type),
                 transformer: token => transformDimension(token.value),
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

styleDictionary.buildAllPlatforms();



import fs from 'fs';

function addRoundedCornerShapeImport(filePath, searchString, lineToAdd) {
  const fileContent = fs.readFileSync(filePath, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePath, updatedContent);
}

// Usage example
const filePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/sofia/SofiaBorders.kt';
const searchString = 'object';
const lineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

addRoundedCornerShapeImport(filePath, searchString, lineToAdd);