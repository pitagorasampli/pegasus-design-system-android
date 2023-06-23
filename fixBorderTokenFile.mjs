import Color from 'tinycolor2';

import * as composeFileUtils from './composeFileUtils.mjs';

const removeColorStringImport = "import androidx.compose.ui.graphics.Color"
const removeUnitStringImport =  "import androidx.compose.ui.unit.*"

//Border
const baseFolderPath = 'pegasusdesignsystemandroid/src/main/java/br/com/cogna/pegasusdesignsystemandroid/brands/brandFolder/tokens/'
const borderFileName = 'brandNameBorderTokens.kt';
const objectString = 'object';
const borderLineToAdd = 'import androidx.compose.foundation.shape.RoundedCornerShape\n';

export function fixBorderTokenFile(brandName){
    composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath + borderFileName, objectString, borderLineToAdd)
    composeFileUtils.removeLineFromFile(brandName, baseFolderPath + borderFileName, removeColorStringImport)
}


