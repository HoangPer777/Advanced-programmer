package stm_example;

public class Student {
	private int id;
	private String name;
	private int bYear;
	private double grade;
	public Student(int id, String name, int bYear, double grade) {
		this.id = id;
		this.name = name;
		this.bYear = bYear;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getbYear() {
		return bYear;
	}
	public double getGrade() {
		return grade;
	}
	
	
}
