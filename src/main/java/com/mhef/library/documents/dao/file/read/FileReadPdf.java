package com.mhef.library.documents.dao.file.read;

import com.mhef.library.documents.dao.content.ContentDisplay;
import com.mhef.library.documents.dao.content.ContentReadPdf;

/**
 * @author Henrik Beck
 * @version 0.0.1
 */
public class FileReadPdf {
	/**
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document content data with the structure through the utilization of HTML tags.
	 */
	public static String getDataHtml(String pathFile) {
		return ContentReadPdf.getDataHtml(pathFile);
	}

	/**
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document content data without the structure through the utilization of HTML tags.
	 */
	public static String getDataRaw(String pathFile) {
		return ContentReadPdf.getDataRaw(pathFile);
	}

	/**
	 * @param pathFile The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @param isFormatted A boolean value key to display the file content with the structure through the utilization of HTML tags or not (as a raw data).
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