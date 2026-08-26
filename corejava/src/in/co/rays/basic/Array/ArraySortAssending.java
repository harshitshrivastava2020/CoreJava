package in.co.rays.basic.Array;

public class ArraySortAssending {
public static void main(String[] args) {
	int[] a = { 1, 2, 30, 4, 5, 6, 7, 8, 9, 10 };
	
	for (int i = 0; i < a.length; i++) {
		for (int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
	}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
