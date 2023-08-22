
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentManagement {
	private List<Student> students;

	public StudentManagement() {
		super();
		students = new ArrayList<>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student findById(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;

	}

	public List<Student> sortbyName() {
		Comparator<Student> byName = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(students, byName);
		return students;
	}

	public List<Student> sortbyYear() {
		// TODO Auto-generated method stub
		Comparator<Student> byYear = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getbYear() - o2.getbYear();
			}
		};
		Collections.sort(students, byYear);
		return students;
	}

	public void addStudent(int id, String name, int bYear, double point) {
		// TODO Auto-generated method stub
		Student st = findById(id);
		if (st == null) {
			students.add(new Student(id, name, bYear, point));
		} else {
			JOptionPane.showConfirmDialog(null, "Sinh viên đã được thêm", "Sinh viên đã được thêm",
					JOptionPane.OK_OPTION);
		}

	}

}
