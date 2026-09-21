package in.co.rays.IO;

import java.io.RandomAccessFile;

public class RandomAccessNoBuffer {
	public static void main(String[] args) throws Exception {

		// 1. Open file in Read-Write mode (creates file automatically)
		RandomAccessFile file = new RandomAccessFile("D://IO//random_data.txt", "rw");

		// 2. Write text data
		file.writeBytes("Hello World");

		// 3. Move the file pointer back to the beginning (index 0)
		file.seek(0);

		// 4. Read exactly 5 characters character-by-character without a byte array
		System.out.print("Read character-by-character: ");
		for (int i = 0; i < 5; i++) {
			char ch = (char) file.readByte(); // Reads 1 byte and converts it directly to a char
			System.out.print(ch); // Outputs: Hello
		}
		System.out.println(); // New line

		// 5. Jump to index 6 and change "World" to "Java!"
		file.seek(6);
		file.writeBytes("Java!");

		// 6. Go back to start and read the whole line using the built-in readLine()
		// method
		file.seek(0);
		System.out.println("Modified full line: " + file.readLine()); // Outputs: Hello Java!

		// 7. Manually close the file
		file.close();
	}
}
