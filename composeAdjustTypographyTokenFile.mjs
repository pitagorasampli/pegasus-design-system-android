import Color from 'tinycolor2';

import * as composeFileUtils from './composeFileUtils.mjs';

const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

const objectString = 'object';

const typographyFileName = 'brandNameTypographyTokens.kt';

const fontFamilyImportR = 'import br.com.cogna.pegasusdesignsystemandroid.R'
const fontFamilyFontFamilyImport = 'import androidx.compose.ui.text.font.FontFamily'
const fontFamilyFontImport = 'import androidx.compose.ui.text.font.Font\n'

export function adjustTypographyTokenFile(brandName, baseFolderPath){
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyFontFamilyImport)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, fontFamilyFontImport )
}