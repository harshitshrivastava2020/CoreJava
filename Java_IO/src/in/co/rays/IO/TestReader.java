package in.co.rays.IO;

import java.io.Reader;
import java.io.StringReader;

public class TestReader {
	public static void main(String[] args) throws Exception {

		// 1. Create your text source
		String text = "Hello";

		// 2. Put it inside a Reader object 
		// reader is a abstract class so we use 
		Reader reader = new StringReader(text);

		// 3. Read characters one by one
		System.out.println((char) reader.read()); // Prints: H
		System.out.println((char) reader.read()); // Prints: e
		System.out.println((char) reader.read()); // Prints: l
		System.out.println((char) reader.read()); // Prints: l
		System.out.println((char) reader.read()); // Prints: o

		// 4. Close the stream when done
		reader.close();
	}

}
