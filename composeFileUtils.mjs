import fs from 'fs';


export function addLineBeforeStringOnFile(filePath, searchString, lineToAdd) {
  const fileContent = fs.readFileSync(filePath, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePath, updatedContent);
}


export function addLineBeforeStringOnFile2(brandName, filePath, searchString, lineToAdd) {
  const filePathWithBrandName = filePath.replace("brandName", brandName)
  const filePathWithBrandFolder = filePathWithBrandName.replace("brandFolder", brandName.toLowerCase())
  const fileContent = fs.readFileSync(filePathWithBrandFolder, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePathWithBrandFolder, updatedContent);
}

export function removeLineFromFile(brandName, filePath, lineToRemove) {
  const filePathWithBrandName = filePath.replace("brandName", brandName)
  const filePathWithBrandFolder = filePathWithBrandName.replace("brandFolder", brandName.toLowerCase())
  const fileContent = fs.readFileSync(filePathWithBrandFolder, 'utf8');
  const updatedContent = fileContent.replace(lineToRemove, "");
  fs.writeFileSync(filePathWithBrandFolder, updatedContent);
}