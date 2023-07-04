

import * as composeFileUtils from './composeFileUtils.mjs';


const objectString = 'object';

const typographyFileName = 'brandNameShadowTokens.kt';

const pegasusShadowImport = 'import br.com.cogna.pegasusdesignsystemandroid.components.shadow.PegasusShadowProperties\n'


export function adjustShadowTokenFile(brandName, baseFolderPath){
composeFileUtils.addLineBeforeStringOnFile2(brandName, baseFolderPath+ typographyFileName, objectString, pegasusShadowImport)
}