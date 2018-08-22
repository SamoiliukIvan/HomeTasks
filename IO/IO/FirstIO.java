package IO;

import java.io.File;
import java.io.FilenameFilter;

public class FirstIO {

	private static File[] getFileList(String dirPath, String typeOfFiles) {
// получаем директорию с файлами
		File dir = new File(dirPath);
// получаем тип искомых файлов
		String type = typeOfFiles;
// создаем и возвращаем массив с файлами, подходящийми под фильтры
		File[] fileList = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(type);
			}
		});

		System.out.println("Количество " + type.substring(1).toUpperCase() + " файлов: " + fileList.length + "\n");

		for (File file : fileList) {
			System.out.println(file.getName());
		}
		return fileList;
	}
	


	
	
	
	
	public static void main(String[] args) throws Exception {
		
		String typeOfFiles = ".pdf";
		File[] fileList = getFileList("E:\\Papka", ".pdf");
	}
}


