package in.co.rays.TestThread;

public class TestHelloRunnable {
public static void main(String[] args) {
	
	Thread thrd1 = new Thread(new HelloRunnable("Harshit"));
	Thread thrd2 = new Thread(new HelloRunnable("Chinmay"));
	
	// another way to do it
	HelloRunnable h =new HelloRunnable("jjjjj");
	Thread df = new Thread(h);
	
	thrd1.start();
	thrd2.start();
	
	df.start();
}
}
