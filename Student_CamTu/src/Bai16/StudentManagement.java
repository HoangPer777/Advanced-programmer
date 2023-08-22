package Bai16;

import java.util.ArrayList;
import java.util.Date;

public class StudentManagement {
    private ArrayList<Student> StList = new ArrayList<>();

    public StudentManagement() {

        this.StList = new ArrayList<Student>();
    }

    //cau 1 them sv
    public boolean addStudent(Student student) {
        return this.StList.add(student);
    }

    //cau 2 them diem cho sv
    public Student findSt(int id) {
        for (Student st : StList) {
            if (st.getId() == (id)) {
                return st;
            }

        }
        return null;
    }
    public boolean addScoreSt(int idSt, int maMonHoc, double score) throws Exception{
        Student student= findSt(idSt);
        return student.addScore(idSt, score);
    }
    public static ArrayList<Student> sortByName(ArrayList<Student> StList) {
        for (int i = 0; i < StList.size()-1; i++) {
            for (int j = i+1; j < StList.size(); j++) {
                if (StList.get(i).getName().compareTo(StList.get(j).getName()) >= 0) {
                    Student stu =  StList.remove(j);
                    StList.add(i,stu);
                    if( StList.get(i).averageScore() < StList.get(j).averageScore()) {
                        Student stu1 = StList.remove(j);
                        StList.add(i,stu1);
                    }
                }
            }
        }
        return StList;
    }

    @Override
    public String toString() {
        for (Student stu : StList) {
            System.out.println(StList.toString() + "\n");
        }
        return "";
    }

    public static void main(String[] args) {
        ArrayList<Subject> dsMonHoc1 = new ArrayList<Subject>();
        Subject mon1 = new Subject("Toan", 01, 8);
        Subject mon2 = new Subject("li", 02, 7);
        Subject mon3 = new Subject("hoa", 03, 9);
        dsMonHoc1.add(mon1);
        dsMonHoc1.add(mon2);
        dsMonHoc1.add(mon3);

        ArrayList<Subject> dsMonHoc2 = new ArrayList<Subject>();
        Subject mon4 = new Subject("Toan", 01, 6);
        Subject mon5 = new Subject("li", 02, 8);
        Subject mon6 = new Subject("hoa", 03, 9);
        dsMonHoc2.add(mon4);
        dsMonHoc2.add(mon5);
        dsMonHoc2.add(mon6);

        ArrayList<Subject> dsMonHoc3 = new ArrayList<Subject>();
        Subject mon7 = new Subject("Toan", 01, 6);
        Subject mon8 = new Subject("li", 02, 2);
        Subject mon9 = new Subject("hoa", 03, 9);
        dsMonHoc3.add(mon7);
        dsMonHoc3.add(mon8);
        dsMonHoc3.add(mon9);

        ArrayList<Student> StList = new ArrayList<Student>();
        Student sv1 = new Student("Nguyen Van Huy", 01, new Date( 2001,1,2), dsMonHoc1);
        Student sv2 = new Student("Vo Thuy An", 02, new Date( 2001,3,20), dsMonHoc2);
        Student sv3 = new Student(" Tran Ngoc Anh", 03, new Date( 2001,1,22), dsMonHoc3);
        Student sv4 = new Student("Cao Thai Cuong", 04, new Date( 2001,1,23), dsMonHoc1);
        Student sv5 = new Student("Vu Ngoc Vy", 05, new Date( 2001,1,14), dsMonHoc3);
        Student sv6 = new Student("Phan Van Hoang", 06, new Date( 2001/1/14), dsMonHoc3);
        StList.add(sv2);
        StList.add(sv3);
        StList.add(sv1);
        StList.add(sv5);
        StList.add(sv4);
        StList.add(sv6);
        System.out.println(StudentManagement.sortByName(StList));
    }
}

