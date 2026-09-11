package in.co.rays.Collection.Sorting;

public class Marksheet implements Comparable<Marksheet> {
	private String rollNumber;
	private String name;
	private int physicsMarks;

	public Marksheet(String rollNumber, String name, int physicsMarks) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.physicsMarks = physicsMarks;
	}

	@Override
	public int compareTo(Marksheet o) {
		if (this.name.equals(o.name)) {
			return this.physicsMarks - o.physicsMarks;
		} else if (this.physicsMarks == o.physicsMarks) {
			return this.rollNumber.compareTo(o.rollNumber);
		} else {
			return this.rollNumber.compareTo(o.rollNumber);
		}
	}

	@Override
	public String toString() {
		return "rollNumber: " + rollNumber + " name: " + name + " physicsMarks: " + physicsMarks;

	}

}
