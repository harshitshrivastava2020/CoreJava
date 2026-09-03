package in.co.rays.Interface;

public class BusinessMan extends Person implements Richman, SocialWorker {

	@Override
	public void helpToOthers() {
		System.out.println("help to others");

	}

	@Override
	public void earnmoney() {
		System.out.println("earn money");

	}

	@Override
	public void donation() {
		System.out.println("donation....");

	}

	@Override
	public void party() {
		System.out.println("party....");

	}

}
