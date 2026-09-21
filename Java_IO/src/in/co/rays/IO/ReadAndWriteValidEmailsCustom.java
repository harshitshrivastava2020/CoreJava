package in.co.rays.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteValidEmailsCustom {
	public static void main(String[] args) throws Exception {

		FileReader source = new FileReader("D://IO//Email.txt");
		BufferedReader br = new BufferedReader(source);

		BufferedWriter gmailWriter = new BufferedWriter(new FileWriter("D://IO//ValidGmail.txt"));
		BufferedWriter outlookWriter = new BufferedWriter(new FileWriter("D://IO//ValidOutlook.txt"));
		BufferedWriter icloudWriter = new BufferedWriter(new FileWriter("D://IO//ValidIcloud.txt"));

		String email = br.readLine();
		while (email != null) {
			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				gmailWriter.write(email);
				gmailWriter.newLine();

			} else if (email.endsWith("@outlook.com")) {
				System.out.println(email);
				outlookWriter.write(email);
				outlookWriter.newLine();
			} else if (email.endsWith("@icloud.com")) {
				System.out.println(email);
				icloudWriter.write(email);
				icloudWriter.newLine();

			}
			email = br.readLine();
		}
		br.close();
		gmailWriter.close();
		outlookWriter.close();
		icloudWriter.close();

	}
}
