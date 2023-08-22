package stm_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentManagement {
//	private List<Student> students;
	List<Student> students = new ArrayList<>();

	public StudentManagement() {
		students = new ArrayList<>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public Student findById(int id) {
		for (Student st : students) {
			if (st.getId() == id)
				return st;
		}
		return null;
	}

	public void addStudent(int id, String name, int bYear, double grade) {
		Student st = findById(id);
		if (st == null) {
			students.add(new Student(id, name, bYear, grade));
		} else {
			// thông báo lỗi
			JOptionPane.showConfirmDialog(null, "Sinh viên đã được thêm", "Sinh viên đã được thêm",
					JOptionPane.OK_OPTION);
		}
	}

	//cách của thầy
//	public List<Student> sortByYear(){
//		Comparator<Student> byYear = new Comparator<Student>() {	
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getbYear() - o2.getbYear();
//			}
//		};
//		Collections.sort(students, byYear);
//		return students;
//	}
	
	//dẫy code hơn
	public List<Student> sortByYear() {
	Collections.sort(students, new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getbYear() - o2.getbYear();
		}
	});
	return students;
}
	//cách ngắn gọn
//	public List<Student> sortByYear() {
//		Collections.sort(students, (o1, o2) -> o1.getbYear() - o2.getbYear());
//		return students;
//	}
	



//	public List<Student> sortByName() {
//		Comparator<Student> byName = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
//		Collections.sort(students, byName);
//		return students;
//	}
	public List<Student> sortByName() {
		Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return students;
	}

	
}
