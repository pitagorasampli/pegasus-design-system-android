/* eslint-disable import/no-extraneous-dependencies */
import styleDictionary from 'style-dictionary';

import Color from 'tinycolor2';

const executeStyleDictionary = (fileName) => {
 
  const StyleDictionary = styleDictionary.registerTransform({
    name: 'name/composeColorName',
    type: 'value',
    matcher: function(prop) {
       return prop.attributes.category === 'sofia';
    },
    transformer: function(prop) {
      const hex8 = Color(prop.value).toHex8();
      return `Color(0x${hex8})`;
    }
  }).extend({
    source: [fileName],
    platforms: {
      android: {
        "transforms": [
          "attribute/cti",
          "name/cti/snake",
          "color/hex8android",
          "size/sp",
          "size/dp"
        ],
        transformGroup: 'android',
        buildPath: 'app/src/main/res/values/',
        files: [{
          destination: 'sofia_tokens_dimens.xml',
          format: "android/fontDimens"
        }, {
          destination: "sofia_tokens_colors.xml",
          format: "android/colors"
        }]
      },
      compose: { 
        transforms: ['attribute/cti', 
        'name/cti/snake', 
        'name/composeColorName'],
        transformGroup: 'compose',
        buildPath: "app/src/main/java/br/com/cogna/pegasusdesignsystemandroid/sofia/",
        files: [{
          destination: "SofiaColors.kt",
          format: "compose/object",
          className: "SofiaColors",
          packageName: "br.com.cogna.pegasusdesignsystemandroid.sofia",
          options: {
            outputReferences: true
          },
          filter: {
            attributes: {
              category: "sofia",
            }
          }
        }, {
          destination: "SofiaSizes.kt",
          format: "compose/object",
          className: "SofiaSizes",
          packageName: "SofiaSizes",
          type: "float",
          filter: {
            attributes: {
              category: "size"
            }
          }
        }]
      }
    }
  });

  StyleDictionary.buildAllPlatforms();
};
export default executeStyleDictionary;
