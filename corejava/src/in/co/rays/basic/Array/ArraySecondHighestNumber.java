package in.co.rays.basic.Array;

public class ArraySecondHighestNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 30, 4, 5, 6, 7, 8, 9, 10 };

		int highest = a[0];
		int secondhighest = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest) {
				highest = a[i];
			}else if(a[i]>secondhighest) {
				secondhighest=a[i];
				
			}
			

		}
		System.out.println(highest);
		System.out.println("second highest"+secondhighest);
	}
}
