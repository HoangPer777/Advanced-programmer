package Bai16;

public class Subject {
    private String subjName;
    private int courseCode;
    private double course;

    public Subject(String subjName, int courseCode, double course) {
        this.subjName = subjName;
        this.courseCode = courseCode;
        this.course = course;
    }

    public String getSubjName() {
        return subjName;
    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public double getCourse() {
        return course;
    }

    public boolean setCourse(double course) throws Exception {
        if (course < 0 || course > 0) {
            throw new Exception(" out of bounds !");
        } else {
            this.course = course;
            return true;
        }
    }

    @Override
    public String toString() {
        return "subjName= " + subjName + ", courseCode= " + courseCode + ", course= " + course;
    }
}
