package com.math.library.dao.content;

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