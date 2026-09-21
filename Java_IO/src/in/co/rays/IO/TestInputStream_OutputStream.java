package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestInputStream_OutputStream {
	public static void main(String[] args) throws Exception {
		// Initialize streams directly because input stream is abstract base class for writing character streams
		// out stream is abstract base class representing a input stream of bytes   
		InputStream in = new FileInputStream("D://IO//source.txt");
		OutputStream out = new FileOutputStream("D://IO//destination.txt");

		int data;
		// 2. Read and write byte-by-byte
		while ((data = in.read()) != -1) {
			out.write(data);
		}
		// 3. Manually close the connections
		in.close();
		out.close();

		System.out.println("File copied successfully!");
	}
}
