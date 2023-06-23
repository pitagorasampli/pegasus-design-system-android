import Color from 'tinycolor2';

import * as composeFileUtils from './composeFileUtils.mjs';

const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

 const objectString = 'object';

const fontWeightFileName= 'brandNameFontWeightTokens.kt';
const fontWeightLineToAdd = 'import androidx.compose.ui.text.font.FontWeight\n';

export function adjustFontWeightTokenFile(brandName, baseFolderPath){
    composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + fontWeightFileName, objectString, fontWeightLineToAdd)
    composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontWeightFileName,  removeUnitStringImport )
    composeFileUtils.removeLineFromFile(brandName, baseFolderPath + fontWeightFileName,  removeColorStringImport )
}