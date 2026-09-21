package in.co.rays.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestRead_WriteBinaryData_FileInputStream_FileOutputStream {
	public static void main(String[] args) throws Exception {
		String source = "D://IO//Videos//sample.mkv";

		String target = "D://IO//Videos//sample-copy.mkv";
		// reads bytes data
		FileInputStream in = new FileInputStream(source); // read binary data

		// write bytes data
		FileOutputStream out = new FileOutputStream(target);// write binary data

		int i = in.read();

		while (i != -1) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		}
		in.close();
		out.close();
		System.out.println("sucessfully......");

	}
}
