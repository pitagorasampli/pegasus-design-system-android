import fs from 'fs';


export function addLineBeforeStringOnFile(filePath, searchString, lineToAdd) {
  const fileContent = fs.readFileSync(filePath, 'utf8');
  const updatedContent = fileContent.replace(searchString, lineToAdd + '\n' + searchString);
  fs.writeFileSync(filePath, updatedContent);
}
