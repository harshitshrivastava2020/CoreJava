package in.co.rays.Interface;

public class TestBusinessMan {
	public static void main(String[] args) {
		Richman r = new BusinessMan();
		r.earnmoney();
		r.donation();
		r.party();

		SocialWorker s = new BusinessMan();
		s.helpToOthers();

		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		BusinessMan bm = new BusinessMan();
		bm.earnmoney();
		bm.donation();
		bm.helpToOthers();
		bm.party();
	}
}
