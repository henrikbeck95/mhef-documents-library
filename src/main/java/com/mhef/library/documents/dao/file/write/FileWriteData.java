package com.mhef.library.documents.dao.file.write;

import com.mhef.library.validation.utils.MessageDisplay;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Henrik Beck
 * @version 0.0.1
 *
 * @todo Test this class.
 */
public class FileWriteData {
	/**
	 * @param data The document file content data.
	 * @param pathFile The path to a document file to be written data content. In example, an .html .txt file are able to be used.
	 */
	protected void writeDataToFileMain(String data, String pathFile) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
			writer.write(data);
//			writer.close();

			MessageDisplay.displayMessageFileWriteSuccess(pathFile);
		} catch (IOException e) {
			MessageDisplay.displayMessageFileWriteError(pathFile, e);
		}
	}

	/**
	 * @param data The document file content data.
	 * @param pathFile The path to a document file to be written data content. In example, an .html .txt file are able to be used.
	 */
	public static void writeDataIntoFile(String data, String pathFile) {
		FileWriteData fileWriter = new FileWriteData();
		fileWriter.writeDataToFileMain(data, pathFile);
	}
}