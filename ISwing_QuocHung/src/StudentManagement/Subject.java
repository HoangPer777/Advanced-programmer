package StudentManagement;

public class Subject {
	private int id;
	private String name;
	private double averagePoint;

	public Subject(int id, String name) {
		this.id = id;
		this.name = name;
		this.averagePoint = 0;
	}

	public Subject(int id, String name, double averagePoint) {
		this.id = id;
		this.name = name;
		this.averagePoint = averagePoint;
	}

	public void addAveragepoint(double p) {
		this.averagePoint = p;
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

	public double getAveragePoint() {
		return averagePoint;
	}

	public void setAveragePoint(double averagePoint) {
		this.averagePoint = averagePoint;
	}

}
