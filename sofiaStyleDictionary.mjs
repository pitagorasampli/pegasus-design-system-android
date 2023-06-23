import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-sofia-config.json' assert { type: 'json' };
import { registerTransforms } from '@tokens-studio/sd-transforms';
import { transformDimension  } from '@tokens-studio/sd-transforms';
import * as composeFileUtils from './composeFileUtils.mjs';

import { composeTransformUtils } from './composeTransformUtils.mjs'
import * as fixBorderToken from './fixBorderTokenFile.mjs'

const styleDictionary = StyleDictionary.extend(config);

const brandName = "Sofia"
composeTransformUtils(brandName, styleDictionary)
styleDictionary.buildAllPlatforms();

fixBorderToken.fixBorderTokenFile(brandName)

const baseFolderPath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/brandFolder/tokens/'
const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

const objectString = 'object';
/*


const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

//Border
const baseFolderPath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/brandFolder/tokens/'
const borderFileName = 'brandNameBorderTokens.kt';
const objectString = 'object';
const borderLineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + borderFileName, objectString, borderLineToAdd)
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + borderFileName, "import androidx.compose.ui.graphics.Color")
 */

//Font Weight

const fontWeightFileName= 'brandNameFontWeightTokens.kt';
const fontWeightLineToAdd = 'import androidx.compose.ui.text.font.FontWeight\n';

composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontWeightFileName, objectString, fontWeightLineToAdd)
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontWeightFileName,  removeUnitStringImport )
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontWeightFileName,  removeColorStringImport )

//Font Family
const fontFamilyFilePath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/sofia/tokens/SofiaFontFamilyTokens.kt';
const fontFamilyFileName = 'brandNameFontFamilyTokens.kt';

const fontFamilyImportR = 'import br.com.cogna.pegasusdesignsystemandroid.R'
const fontFamilyFontFamilyImport = 'import androidx.compose.ui.text.font.FontFamily'
const fontFamilyFontImport = 'import androidx.compose.ui.text.font.Font\n'

composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontFamilyFileName,  removeColorStringImport )
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontFamilyFileName,  removeUnitStringImport )

composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyFontFamilyImport )
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyFontImport )


//Typography
const typographyFileName = 'brandNameTypographyTokens.kt';

composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyFontFamilyImport)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyFontImport )