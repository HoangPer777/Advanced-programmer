
public class STUDENT  {
	private int id;
	private String name;
	private int bYear;
	private double grade;
	public STUDENT(int id, String name, int bYear, double grade) {
		super();
		this.id = id;
		this.name = name;
		this.bYear = bYear;
		this.grade = grade;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the bYear
	 */
	public int getbYear() {
		return bYear;
	}
	/**
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}
	

}
