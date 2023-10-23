package com.mhef.library.documents.dao.file.write;

import com.mhef.library.documents.AppTest;
import com.mhef.library.documents.dao.content.ContentReadPdf;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileWriteDataTest {
	@BeforeAll
	static void setupListLoadValues() {
		AppTest.loadDocumentValues();
	}

	// @todo Must implement more features
	@Test
	void writeDataIntoFile() {
		// Load data from document file
		String dataDocumentFromPdfToHtml = ContentReadPdf.getDataHtml(AppTest.getPathFileInputDocumentPdf());
		String dataDocumentFromPdfToRaw = ContentReadPdf.getDataHtml(AppTest.getPathFileInputDocumentPdf());

		// Write data into external file
		FileWriteData.writeDataIntoFile(dataDocumentFromPdfToHtml, AppTest.getPathFileOutputDocumentHtml() + "_from_pdf");
		FileWriteData.writeDataIntoFile(dataDocumentFromPdfToRaw, AppTest.getPathFileOutputDocumentTxt() + "_from_pdf");
	}
}