package quanLy2;

public class Student {
	int id;
	String name;
	int birthYear;
	double point;
	
	

	public Student(int id, String name, int birthYear, double point) {
		super();
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
		this.point = point;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBirthYear() {
		return birthYear;
	}



	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}



	public double getPoint() {
		return point;
	}



	public void setPoint(double point) {
		this.point = point;
	}
	



	
}
