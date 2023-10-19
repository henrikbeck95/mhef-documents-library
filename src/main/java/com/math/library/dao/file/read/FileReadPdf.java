package com.math.library.dao.file.read;

import com.math.library.dao.content.ContentDisplay;
import com.math.library.dao.content.ContentReadPdf;

/**
 * @author Henrik Beck
 * @version 0.0.1
 */
public class FileReadPdf {
	/**
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document file data with the full text data content formatted with the HTML file structure.
	 */
	public static String getDataHtml(String pathFile) {
		return ContentReadPdf.getDataHtml(pathFile);
	}

	/**
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document file data with the full text data content without being formatted.
	 */
	public static String getDataRaw(String pathFile) {
		return ContentReadPdf.getDataRaw(pathFile);
	}

	/**
	 * @param pathFile The path to a spreadsheet file. In example, .doc, .docx .pdf or .txt files are able to be used.
	 * @param isFormatted A boolean value key to display the table with colored NULL values instead of the table as raw data.
	 */
	public static void print(String pathFile, boolean isFormatted) {
		ContentDisplay printer = new ContentDisplay();
		String data = "";

		if (isFormatted == true) {
			data = ContentReadPdf.getDataHtml(pathFile);
			printer.printFormatted(data);
		} else {
			data = ContentReadPdf.getDataRaw(pathFile);
			printer.printNotFormatted(data);
		}
	}
}