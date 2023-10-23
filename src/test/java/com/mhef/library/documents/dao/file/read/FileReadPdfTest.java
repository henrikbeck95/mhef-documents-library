package com.mhef.library.documents.dao.file.read;

import com.mhef.library.documents.AppTest;
import com.mhef.library.documents.dao.content.ContentReadPdf;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileReadPdfTest {
	@BeforeAll
	static void setupListLoadValues() {
		AppTest.loadDocumentValues();
	}

	// @todo Must be implemented
	@Test
	void getDataHtml() {
		String dataDocumentFromPdf = ContentReadPdf.getDataHtml(AppTest.getPathFileInputDocumentPdf());
		System.out.println(dataDocumentFromPdf);
	}

	// @todo Must be implemented
	@Test
	void getDataRaw() {
		String dataDocumentFromPdf = ContentReadPdf.getDataRaw(AppTest.getPathFileInputDocumentPdf());
		System.out.println(dataDocumentFromPdf);
	}

	@Test
	void print() {
		// Display as HTML format.
		FileReadPdf.print(AppTest.getPathFileInputDocumentDoc(), true);
		FileReadPdf.print(AppTest.getPathFileInputDocumentDocx(), true);
		FileReadPdf.print(AppTest.getPathFileInputDocumentPdf(), true);
		FileReadPdf.print(AppTest.getPathFileInputDocumentTxt(), true);

		// Display as raw format.
		FileReadPdf.print(AppTest.getPathFileInputDocumentDoc(), false);
		FileReadPdf.print(AppTest.getPathFileInputDocumentDocx(), false);
		FileReadPdf.print(AppTest.getPathFileInputDocumentPdf(), false);
		FileReadPdf.print(AppTest.getPathFileInputDocumentTxt(), false);
	}
}