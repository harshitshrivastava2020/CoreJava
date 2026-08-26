package in.co.rays.basic.Array;

public class ArrayFindingNumber {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 10) {
				System.out.println("only condition satisfy will appaer:"+a[i]);
			}
//			System.out.println(a[i]);
		}
	}

}
