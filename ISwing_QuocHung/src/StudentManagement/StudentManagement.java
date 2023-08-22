package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

	private List<Student> listStudent;

	public StudentManagement() {
		this.listStudent = new ArrayList<Student>();

		Student s1 = new Student("11", "Nguyen Van A");
		Student s2 = new Student("12", "Nguyen Van B");
		Student s3 = new Student("13", "Nguyen Van C");
		Student s4 = new Student("14", "Nguyen Van D");

		List<Subject> listsub1 = new ArrayList<Subject>();
		Subject sub11 = new Subject(2222, "Lý thuyết đồ thị");
		Subject sub12 = new Subject(3333, "Lập trình căn bản");
		listsub1.add(sub11);
		listsub1.add(sub12);

		List<Subject> listsub2 = new ArrayList<Subject>();
		Subject sub21 = new Subject(2222, "Lý thuyết đồ thị");
		Subject sub22 = new Subject(3333, "Lập trình căn bản");
		Subject sub23 = new Subject(1111, "Lập trình nâng cao");
		listsub2.add(sub21);
		listsub2.add(sub22);
		listsub2.add(sub23);

		List<Subject> listsub3 = new ArrayList<Subject>();
		Subject sub31 = new Subject(1, "Thiết kế hướng đối tượng");
		listsub3.add(sub31);

		List<Subject> listsub4 = new ArrayList<Subject>();
		Subject sub41 = new Subject(1, "Lý thuyết đồ thị");
		listsub4.add(sub41);

		s1.setLitSubject(listsub1);
		s2.setLitSubject(listsub2);
		s3.setLitSubject(listsub3);
		s4.setLitSubject(listsub4);

		this.listStudent.add(s1);
		this.listStudent.add(s2);
		this.listStudent.add(s3);
		this.listStudent.add(s4);
	}

	public void addStudent(Student stu) {
		this.listStudent.add(stu);
	}

	public Student findStudent(String mssv) {
		for (Student s : listStudent) {
			if (s.getId().equalsIgnoreCase(mssv)) {
				return s;
			}
		}
		return null;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

}
