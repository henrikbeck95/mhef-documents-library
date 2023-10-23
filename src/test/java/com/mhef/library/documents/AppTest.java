package com.mhef.library.documents;

import org.junit.jupiter.api.Test;

public class AppTest {
	private static String projectRootPath = "";
	private static final String pathFileInputDocumentDoc = "/assets/data/file-example-1MB.doc";
	private static final String pathFileInputDocumentDocx = "/assets/data/file-example-1MB.docx";
	private static final String pathFileInputDocumentPdf = "/assets/data/file-example-1MB.pdf";
	private static final String pathFileInputDocumentTxt = "/assets/data/file-example-2KB.txt";
	private static final String pathFileOutputDocumentDoc = "/assets/dist/output.doc";
	private static final String pathFileOutputDocumentDocx = "/assets/dist/output.docx";
	private static final String pathFileOutputDocumentHtml = "/assets/dist/output.html";
	private static final String pathFileOutputDocumentPdf = "/assets/dist/output.pdf";
	private static final String pathFileOutputDocumentTxt = "/assets/dist/output.txt";

	@Test
	public static void loadDocumentValues() {
		projectRootPath = System.getProperty("user.dir");
	}

	// Path file input

	public static String getPathFileInputDocumentDoc() {
		return projectRootPath + pathFileInputDocumentDoc;
	}

	public static String getPathFileInputDocumentDocx() {
		return projectRootPath + pathFileInputDocumentDocx;
	}

	public static String getPathFileInputDocumentPdf() {
		return projectRootPath + pathFileInputDocumentPdf;
	}

	public static String getPathFileInputDocumentTxt() {
		return projectRootPath + pathFileInputDocumentTxt;
	}

	// Path file output

	public static String getPathFileOutputDocumentDoc() {
		return projectRootPath + pathFileOutputDocumentDoc;
	}

	public static String getPathFileOutputDocumentDocx() {
		return projectRootPath + pathFileOutputDocumentDocx;
	}

	public static String getPathFileOutputDocumentHtml() {
		return projectRootPath + pathFileOutputDocumentHtml;
	}

	public static String getPathFileOutputDocumentPdf() {
		return projectRootPath + pathFileOutputDocumentPdf;
	}

	public static String getPathFileOutputDocumentTxt() {
		return projectRootPath + pathFileOutputDocumentTxt;
	}
}