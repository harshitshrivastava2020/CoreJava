package in.co.rays.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBufferedInputAndOutputStream {
	public static void main(String[] args) throws Exception {

		String source = "D://IO//Images//sinchan.jpg";

		String target = "D://IO//Images//cartoon.jpg";

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));

		int count = in.read();
		System.out.println(count);

		while (count != -1) {
			out.write(count);
			count = in.read();

		}
		System.out.println("successfully");
		in.close();
		out.close();

	}
}
