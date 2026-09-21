package in.co.rays.IO;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class TestWriter {
	public static void main(String[] args) throws IOException {

		// 1. Create a Writer object to hold your text
		Writer writer = new StringWriter();

		// 2. Write characters or text fragments one by one
		writer.write('H');
		writer.write('e');
		writer.write('l');
		writer.write('l');
		writer.write('o');

		// 3. Convert the accumulated data inside the writer into a readable String
		String result = writer.toString();
		System.out.println(result); // Prints: Hello

		// 4. Close the stream when done
		writer.close();
	}
}
