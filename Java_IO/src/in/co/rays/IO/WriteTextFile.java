package in.co.rays.IO;

import java.io.FileWriter;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {
		// FileWriter file = new FileWriter("D://IO//Sun.txt"(address in local pc));
		FileWriter file = new FileWriter("D://IO//harshit.txt", true);

		file.write("Hey Harshit,");
		file.write("how are you harshit");
		System.out.println("text data write successfully");
		file.close();

	}
}
