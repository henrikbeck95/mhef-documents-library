package com.mhef.library.documents.dao.file.read;

import com.mhef.library.validation.ValidationFile;

/**
 * @author Henrik Beck
 * @version 0.0.1
 */
public class FileReadMain {
	/**
	 * @todo Implement the .docx method.
	 * @todo Implement the .txt method.
	 * @todo Implement the JavaDoc correctly.
	 * @todo Implement the getContentData method.
	 *
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 */
	public static void displayTableData(String pathFile) {
		// Check if the file exists
		if (!ValidationFile.fileExists(pathFile)) {
			System.out.println("File " + pathFile + " does not exist.");
			System.exit(0);
		}

		// Declaring the variables
		String formatFile = ValidationFile.getFileExtension(pathFile);

		/*
		// Insert content into list
		if (formatFile.equals(".doc") || formatFile.equals(".docx")) {
			FileReadDocx.print(pathFile, true);
		} else if (formatFile.equals(".pdf")) {
			FileReadPdf.print(pathFile, true);
		} else if (formatFile.equals(".md") || formatFile.equals(".txt")) {
			FileReadTxt.print(pathFile, true);
		}
		 */
	}
}