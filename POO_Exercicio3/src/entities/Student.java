package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String pass() {
		return "PASS";
	}

	public String failed() {
		return "FAILED";
	}

	public String missingPoints() {
		return "MISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS";
	}

}
