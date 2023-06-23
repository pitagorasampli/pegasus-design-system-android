import Color from 'tinycolor2';

import * as composeFileUtils from './composeFileUtils.mjs';

const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

const objectString = 'object';


//Font Family
const fontFamilyFileName = 'brandNameFontFamilyTokens.kt';

const fontFamilyImportR = 'import br.com.cogna.pegasusdesignsystemandroid.R'
const fontFamilyFontFamilyImport = 'import androidx.compose.ui.text.font.FontFamily'
const fontFamilyFontImport = 'import androidx.compose.ui.text.font.Font\n'

export function adjustFontFamilyTokenFile(brandName, baseFolderPath){
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontFamilyFileName,  removeColorStringImport )
composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontFamilyFileName,  removeUnitStringImport )

composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyImportR)
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyFontFamilyImport )
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontFamilyFileName, objectString, fontFamilyFontImport )
}