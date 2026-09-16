package in.co.rays.IO;

import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		// read single character only as int
		// It reads through the file character by character.

		FileReader file = new FileReader("D://IO//harshit.txt");

		int i = file.read();

		while (i != -1) {
			System.out.println((char)i + "=" + i);
			i = file.read();
		}
		file.close();

	}

}
