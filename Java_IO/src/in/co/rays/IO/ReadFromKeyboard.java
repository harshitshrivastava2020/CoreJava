package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter(new FileWriter("D://IO//temp.txt", true));

		System.out.println("start writing your text here....");

		InputStreamReader inputStR = new InputStreamReader(System.in);

		BufferedReader file = new BufferedReader(inputStR);

		String a = file.readLine();

		while (!a.equals("exit")) {
			pw.println(a);// write line in the file
			a = file.readLine(); // read next line

		}

		pw.close();
		inputStR.close();
		file.close();

	}
}
