import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-sofia-config.json' assert { type: 'json' };
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';
import * as composeFileUtils from './composeFileUtils.mjs';

import { composeTransformUtils } from './composeTransformUtils.mjs'

const styleDictionary = StyleDictionary.extend(config);

composeTransformUtils("Sofia", styleDictionary)
styleDictionary.buildAllPlatforms();

const borderFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/SofiaBorders.kt';
const borderSearchString = 'object';
const borderLineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

composeFileUtils.addLineBeforeStringOnFile(borderFilePath, borderSearchString, borderLineToAdd)


const fontWeightFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/SofiaFontWeight.kt';
const fontWeightSearchString = 'object';
const fontWeightLineToAdd = 'import androidx.compose.ui.text.font.FontWeight\n';

composeFileUtils.addLineBeforeStringOnFile(fontWeightFilePath, fontWeightSearchString, fontWeightLineToAdd)


