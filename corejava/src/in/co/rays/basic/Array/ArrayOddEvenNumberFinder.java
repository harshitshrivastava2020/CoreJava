package in.co.rays.basic.Array;

public class ArrayOddEvenNumberFinder {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				a[i] = a[i] / 2;
				System.out.println("even" + a[i]);

			} else {
				a[i] = a[i] - 1;
				System.out.println("odd" + a[i]);
			}
		}
	}

}
