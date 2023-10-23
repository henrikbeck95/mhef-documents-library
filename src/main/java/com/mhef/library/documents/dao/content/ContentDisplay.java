package com.mhef.library.documents.dao.content;

public class ContentDisplay {
	/**
	 * Display the content of the file data as if it were an HTML file and maintain the structure through the utilization of HTML tags.
	 *
	 * @todo Highlight the html tags with colors.
	 *
	 * @param data The document file content data.
	 */
	public static void printFormatted(String data) {
		System.out.println(data);
	}

	/**
	 * Display the content of the file data as if it were a TXT file without maintaining the structure through the utilization of HTML tags.
	 *
	 * @param data The document file content data.
	 */
	public static void printNotFormatted(String data) {
		System.out.println(data);
	}
}