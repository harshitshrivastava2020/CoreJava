package in.co.rays.IO;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("D://IO//Harshit.txt");
		File f1 = new File("D://IO//New Text Document.txt");

		if (file.exists()) {
			// file.renameTo(new File("D://IO//h.txt")); rename the file of given address
			f1.delete();// delete the file you want

			f1.deleteOnExit();// delete the file if file is exist

			System.out.println("file name: " + file.getName());
			System.out.println("file path: " + file.getAbsolutePath());

			System.out.println("Access permission");

			System.out.println("writable: " + file.canWrite());
			System.out.println("readable: " + file.canRead());

			System.out.println("check if it is a folder/directory or a file");

			System.out.println("is file: " + file.isFile()); // gives you a file type means it //checks it is file or
																// folder
			System.out.println("id folder/directory: " + file.isDirectory());

			System.out.println("Last modified date of file, folder/directory");

			Date lastModifiedDate = new Date(file.lastModified());// provides last modification of file through date and
																	// time
			System.out.println("lastModifiedDate: " + lastModifiedDate);
			System.out.println(file.length());

		}
	}

}
