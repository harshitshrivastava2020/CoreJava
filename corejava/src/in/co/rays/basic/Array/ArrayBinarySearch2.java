package in.co.rays.basic.Array;

public class ArrayBinarySearch2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int search = 9;
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int midValue = (low + high) / 2;

			if (a[midValue] == search) {
				System.out.println("searched element is on index : " + midValue);
				break;
			} else if (search > a[midValue]) {
				low = midValue + 1;
			} else {
				high = midValue - 1;
			}
		}
	}

}
