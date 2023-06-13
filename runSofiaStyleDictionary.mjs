import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-sofia-config.json' assert { type: 'json' };
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';
import * as composeFileUtils from './composeFileUtils.mjs';

import { composeTransformUtils } from './composeTransformUtils.mjs'

const styleDictionary = StyleDictionary.extend(config);

composeTransformUtils(styleDictionary)
styleDictionary.buildAllPlatforms();

const borderFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/sofia/SofiaBorders.kt';
const borderSearchString = 'object';
const borderLineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

composeFileUtils.addRoundedCornerShapeImport(borderFilePath, borderSearchString, borderLineToAdd)


const fontWeightFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/sofia/SofiaFontWeight.kt';
const fontWeightSearchString = 'object';
const fontWeightLineToAdd = 'import androidx.compose.ui.text.font.FontWeight\n';

composeFileUtils.addRoundedCornerShapeImport(fontWeightFilePath, fontWeightSearchString, fontWeightLineToAdd)


