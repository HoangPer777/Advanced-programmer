import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentManagement {
	private List<STUDENT> students;
	
	public StudentManagement() {
		students = new ArrayList<>();
	}

	public List<STUDENT> getStudent() {
		return students;
	}
	public STUDENT findById(int id) {
		for (STUDENT st : students) {
			if (st.getId() == id) {
				return st;
			}
		}
		return null;
	}
	public void addStudent(int id, String name, int bYear, double grade) {
		STUDENT st = findById(id);
		if (st == null) {
			students.add(new STUDENT(id, name, bYear, grade));
		}else {
			// báo lỗi
		}
	}
//	public List<STUDENT> sortByName() {
//		Comparator<Student> byYear = new Comparator<Student>() {
//
//			@Override
//			public int compare(STUDENT o1, STUDENT o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo( o2.getName());
//			}
//			
//		};
//		Collections.sort(students, byYear);
//		return students;
//	}
	public List<STUDENT> sortByName() {
		Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return students;
	}
	
	public List<STUDENT> sortByYear() {
		Collections.sort(students, (o1, o2) -> o1.getbYear() - o2.getbYear());
		return students;
	}
	
//	public List<STUDENT> sortByYear() {
//		Comparator<Student> byYear = new Comparator<Student>() {
//
//			@Override
//			public int compare(STUDENT o1, STUDENT o2) {
//				// TODO Auto-generated method stub
//				return o1.getbYear() - o2.getbYear();
//			}
//			
//		};
//		Collections.sort(students, byYear);
//		return students;
//	}
	
}
