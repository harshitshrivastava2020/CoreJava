package in.co.rays.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws Exception {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://IO//Primitive.txt"));
		out.writeInt(1);
		out.writeFloat(25.66f);
		out.writeDouble(6.66);
		out.writeBoolean(true);
		out.writeChar('H');

		out.close();

		System.out.println("data added ......");

		DataInputStream in = new DataInputStream(new FileInputStream("D://IO//Primitive.txt"));

		System.out.println(in.readInt());
		System.out.println(in.readFloat());
		System.out.println(in.readDouble());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());

		in.close();

	}
}
