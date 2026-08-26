package in.co.rays.basic.Array;

public class TestDecimalArray {
	public static void main(String[] args) {
		float sum = 0;
		float[] a = {1.0f, 2.3f, 4.0f, 5.5f, 6.1f, 7.8f};
		
		for(int s =0;s<a.length;s++) {
			System.out.println(a[s]);
			sum=sum+a[s];
		}
		System.out.println("sum :"+sum);
	}

}
