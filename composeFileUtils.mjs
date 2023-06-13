import fs from 'fs';


export function addRoundedCornerShapeImport(filePath, searchString, lineToAdd) {
  const fileContent = fs.readFileSync(filePath, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePath, updatedContent);
}

export function addFontWeightImport(filePath, searchString, lineToAdd) {
  const fileContent = fs.readFileSync(filePath, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePath, updatedContent);
}
