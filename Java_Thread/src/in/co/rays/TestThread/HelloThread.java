package in.co.rays.TestThread;

// there are two type to use thread 1) is inherit thread class means extends thread class
public class HelloThread extends Thread {
	private String name;

	public HelloThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int h = 1; h <= 10; h++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(h + " = " + name);
		}
	}
}
