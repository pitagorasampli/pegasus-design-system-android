 import Color from 'tinycolor2';

 import StyleDictionary from 'style-dictionary';
 import config from './style-dictionary-saraiva-config.json' assert { type: 'json' };
 import { registerTransforms } from '@tokens-studio/sd-transforms';
 import { transformDimension  } from '@tokens-studio/sd-transforms';
 import * as composeFileUtils from './composeFileUtils.mjs';

 import { composeTransformUtils } from './composeTransformUtils.mjs'
 import * as adjustBorderToken from './composeAdjustBorderTokenFile.mjs'
 import * as adjustFontWeightToken from './composeAdjustFontWeightTokenFile.mjs'
 import * as adjustFontFamilyToken from './composeAdjustFontFamilyTokenFile.mjs'
 import * as adjustTypographyToken from './composeAdjustTypographyTokenFile.mjs'

 const styleDictionary = StyleDictionary.extend(config);

 const brandName = "Saraiva"
 const baseFolderPath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/brandFolder/tokens/'

 composeTransformUtils(brandName, styleDictionary)
 styleDictionary.buildAllPlatforms();

 adjustBorderToken.adjustBorderTokenFile(brandName, baseFolderPath)
 adjustFontWeightToken.adjustFontWeightTokenFile(brandName, baseFolderPath)
 adjustFontFamilyToken.adjustFontFamilyTokenFile(brandName, baseFolderPath)
 adjustTypographyToken.adjustTypographyTokenFile(brandName, baseFolderPath)