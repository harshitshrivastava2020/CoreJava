package in.co.rays.TestThread;

public class TestHelloThread {
	public static void main(String[] args) {

		// thread are born when create object using new keyword
		HelloThread thrd1 = new HelloThread("harshit");
		HelloThread thrd2 = new HelloThread("chinmay");
		HelloThread thrd3 = new HelloThread("karuna");

		// thread start when call start() method(start method call run method)
		thrd1.start();
		thrd2.start();
		thrd3.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + "Akbar");
		}
	}
}
