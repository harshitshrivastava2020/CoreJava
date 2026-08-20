package in.co.rays.basic.Array;

public class TestArray {
	public static void main(String[] args) {
		int []a = {6,9,10,11,12,13,14};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println(sum);
	}

}
