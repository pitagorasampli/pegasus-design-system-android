import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-sofia-config.json' assert { type: 'json' };
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';
import * as composeFileUtils from './composeFileUtils.mjs';

import { composeTransformUtils } from './composeTransformUtils.mjs'

const styleDictionary = StyleDictionary.extend(config);

const brandName = "Sofia"
composeTransformUtils(brandName, styleDictionary)
styleDictionary.buildAllPlatforms();

const borderFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/tokens/SofiaBorderTokens.kt';
const borderSearchString = 'object';
const borderLineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

composeFileUtils.addLineBeforeStringOnFile(borderFilePath, borderSearchString, borderLineToAdd)


const fontWeightFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/tokens/SofiaFontWeightTokens.kt';
const fontWeightSearchString = 'object';
const fontWeightLineToAdd = 'import androidx.compose.ui.text.font.FontWeight\n';

composeFileUtils.addLineBeforeStringOnFile(fontWeightFilePath, fontWeightSearchString, fontWeightLineToAdd)

const fontFamilyFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/tokens/SofiaFontFamilyTokens.kt';
const fontFamilySearchString = 'object';
const fontFamilyImportR = 'import br.com.cogna.pegasusdesignsystemandroid.R'
const fontFamilyFontFamilyImport = 'import androidx.compose.ui.text.font.FontFamily'
const fontFamilyFontImport = 'import androidx.compose.ui.text.font.Font\n'

composeFileUtils.addLineBeforeStringOnFile(fontFamilyFilePath, fontFamilySearchString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile(fontFamilyFilePath, fontFamilySearchString, fontFamilyFontFamilyImport )
composeFileUtils.addLineBeforeStringOnFile(fontFamilyFilePath, fontFamilySearchString, fontFamilyFontImport )


const typographyFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/tokens/SofiaTypographyTokens.kt';

composeFileUtils.addLineBeforeStringOnFile(typographyFilePath, fontFamilySearchString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile(typographyFilePath, fontFamilySearchString, fontFamilyFontFamilyImport )
composeFileUtils.addLineBeforeStringOnFile(typographyFilePath, fontFamilySearchString, fontFamilyFontImport )