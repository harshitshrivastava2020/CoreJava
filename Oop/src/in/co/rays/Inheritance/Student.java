package in.co.rays.Inheritance;

public class Student extends Person {
	private String rollNo;
	private int marks;

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getRollno() {
		return rollNo;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

}
