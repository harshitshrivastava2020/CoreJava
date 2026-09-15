package in.co.rays.Collection.Sorting;

public class Marksheet implements Comparable<Marksheet> {
	protected String rollNumber;
	protected String name;
	protected int physicsMarks;

	public Marksheet(String rollNumber, String name, int physicsMarks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.physicsMarks = physicsMarks;
	}

	@Override
	public int compareTo(Marksheet obj) {
		if (this.name.equals(obj.name)) {
			return this.physicsMarks - obj.physicsMarks;
		} else if (this.physicsMarks == obj.physicsMarks) {
			return this.rollNumber.compareTo(obj.rollNumber);
		} else {
			return this.rollNumber.compareTo(obj.rollNumber);
		}
	}

	@Override
	public String toString() {
		return "rollNumber: " + rollNumber + " name: " + name + " physicsMarks: " + physicsMarks;

	}

}
