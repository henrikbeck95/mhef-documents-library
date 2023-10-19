package com.math.library.dao.file.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteData {
	protected void writeDataToFileMain(String data, String pathFile) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
			writer.write(data);
			// writer.close();

//			MessageDisplay.displayMessageFileWriteSuccess(pathFile);
		} catch (IOException e) {
//			MessageDisplay.displayMessageFileWriteError(pathFile, e);
		}
	}

	public static void writeDataIntoFile(String data, String pathFile) {
		FileWriteData fileWriter = new FileWriteData();
		fileWriter.writeDataToFileMain(data, pathFile);
	}
}