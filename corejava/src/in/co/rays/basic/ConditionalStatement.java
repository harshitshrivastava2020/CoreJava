package in.co.rays.basic;

public class ConditionalStatement {
	public static void main(String[] args) {
		int num;
		int count =0;
		for (num = 14; num > 0;) {
			if (num % 2 == 0) {
				num = num / 2;
				count++;
				System.out.println("even" + " " + num + " " + "count" + " " + count);

			} else {
				num = num - 1;
				count++;
				System.out.println("odd" + " " + num + " " + "count" + " " + count);


			}
		}
	}
}
