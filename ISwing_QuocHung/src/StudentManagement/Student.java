package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String id;
	private String name;
	private List<Subject> listSubject;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.listSubject = new ArrayList<>();
	}

	public boolean addSubject(Subject sub) {
		for (Subject s : listSubject) {
			if (s.getName().equalsIgnoreCase(sub.getName())) {
				return false;
			}
		}
		this.listSubject.add(sub);
		return true;
	}

//	public Subject findSubject(int id) {
//		
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getLitSubject() {
		return listSubject;
	}

	public void setLitSubject(List<Subject> litSubject) {
		this.listSubject = litSubject;
	}

}
