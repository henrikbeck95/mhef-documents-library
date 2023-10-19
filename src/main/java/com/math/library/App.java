package com.math.library;

import com.math.library.dao.content.ContentReadPdf;
import com.math.library.dao.file.read.FileReadPdf;
import com.math.library.dao.file.write.FileWriteData;

/**
 * @author Henrik Beck
 * @version v0.0.1
 *
 * @todo This class should be replaced to unit tests in a near future.
 */
public class App {
    public static void main(String[] args) {
		String projectRootPath = System.getProperty("user.dir");
		// String fileName = "/assets/data/file-example-1MB.docx";
		// String fileName = "/assets/data/file-example-1MB.doc";
		String fileName = "/assets/data/file-example-1MB.pdf";
		String pathFileInputDocument = projectRootPath + fileName;

		// Display the file content
		FileReadPdf.print(pathFileInputDocument, true); // Display as raw format.
		FileReadPdf.print(pathFileInputDocument, false); // Display as HTML format.

		// Storing the results content
		String dataHtml = ContentReadPdf.getDataHtml(pathFileInputDocument);
		String dataRaw = ContentReadPdf.getDataRaw(pathFileInputDocument);

		// Display the data content
		System.out.println(dataHtml);
		System.out.println(dataRaw);

		// Write the data content into an external file
		FileWriteData.writeDataIntoFile(dataHtml, "./assets/dist/output.html");
		FileWriteData.writeDataIntoFile(dataRaw, "./assets/dist/output.txt");
	}
}