package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {
	public static void main(String[] args) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader("D://IO//Hello.java"));
		String h = file.readLine();
		while (h != null) {
			System.out.println(h);
			h = file.readLine();
		}
		file.close();
	}

}
