package com.mhef.library.documents.dao.content;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.tools.PDFText2HTML;

import java.io.File;
import java.io.IOException;

/**
 * @author Henrik Beck
 * @version 0.0.1
 */
public class ContentReadPdf {
	/**
	 * Obtain the content of the file data as if it were an HTML file and maintain the structure through the utilization of HTML tags.
	 *
	 * @param pathFileInputDocument The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document content data with the structure through the utilization of HTML tags.
	 */
	public static String getDataHtml(String pathFileInputDocument) {
		String result = "";

		try {
			// Load the PDF document
			PDDocument document = PDDocument.load(new File(pathFileInputDocument));

			// Create the PDFTextStripper
			PDFTextStripper stripper = new PDFText2HTML();

			// Set the output directory
			stripper.setStartPage(1); // Optional: Set the start page for conversion
			stripper.setEndPage(document.getNumberOfPages()); // Optional: Set the end page for conversion

			// Store the PDF content
			result = stripper.getText(document);

			// Close the PDF document
			document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Obtain the content of the file data as if it were a TXT file without maintain the structure through the utilization of HTML tags.
	 *
	 * @param pathFileInputDocument The path to a document file. In example, .doc, .docx, .pdf or .txt files are able to be used.
	 * @return The document content data without the structure through the utilization of HTML tags.
	 */
	public static String getDataRaw(String pathFileInputDocument) {
		String result = "";

		try {
			// Load the PDF document
			PDDocument document = PDDocument.load(new File(pathFileInputDocument));

			// Create the PDFTextStripper
			PDFTextStripper stripper = new PDFTextStripper();

			// Store the PDF content
			result = stripper.getText(document);

			// Close the PDF document
			document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}
}