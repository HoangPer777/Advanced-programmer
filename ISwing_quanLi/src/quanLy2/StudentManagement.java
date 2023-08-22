package quanLy2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentManagement {
	List<Student> students;
//	List<Student> students = new ArrayList<>();

	public StudentManagement() {
		students = new ArrayList<>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student findById(int id) {
		// TODO Auto-generated method stub
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	public void addStudent(int id, String name, int birthYear, double point) {
		Student st = findById(id);
		if (st == null) {
			students.add(new Student(id, name, birthYear, point));
		} else {
			JOptionPane.showConfirmDialog(null, "Lỗi", "Sinh viên đã được thêm", JOptionPane.OK_OPTION);
		}
	}

	public List<Student> sortByYear() {
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getBirthYear() - o2.getBirthYear();
			}
		});
		return students;
	}
	
	

	public List<Student> sortByName() {
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}	
		});
		
		return students;
	}

}
