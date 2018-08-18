package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewEditor {

	public NewEditor() {
		// TODO Auto-generated constructor stub
	}

// метод для ввода текст и сохранения его в файл
	public static void toFile(String pathToFile) {

		System.out.println("Введи текст. Для завершения набери exit");

		try {
			File file = new File(pathToFile);
			// поток для считывания с консоли
			InputStreamReader inputStreamReader = new InputStreamReader(System.in);
			// присоединяем поток к буферу чтения
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			// поток для работы работы с файлом
			FileWriter fileReader = new FileWriter(file);
			// присоединяем к буферу записи
			BufferedWriter bufferedWriter = new BufferedWriter(fileReader);

			String consolText;
			while (!(consolText = bufferedReader.readLine()).equals("exit")) {
				bufferedWriter.write(consolText);
			}

			bufferedReader.close(); // закрываем поток
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fromFileToDisplay(String pathToFile) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(pathToFile));
			String temp = "";
			while ((temp = bufferedReader.readLine()) != null) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		toFile("C:\\Papka\\Text.txt");
		System.out.println("Введенный текст: ");
		fromFileToDisplay("C:\\Papka\\Text.txt");
	}
}
