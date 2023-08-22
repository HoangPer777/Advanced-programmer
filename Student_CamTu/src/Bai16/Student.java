package Bai16;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private int id;
    private Date date;
    ArrayList<Subject> subjectList;

    public Student(String name, int id, Date date, ArrayList subjectList) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    // tim mssv
    public Subject findSubjectByID(int subjectID) {
        for (Subject sub : subjectList) {
            if (sub.getCourseCode() == subjectID) {
                return sub;
            }
        }
        return null;
    }

    //them diem
    public boolean addScore(int subjName, double course) throws Exception {
        Subject sub = findSubjectByID(subjName);
        if (sub == null) {
            return false;
        }
        return sub.setCourse(course);
    }

    //diem trung binh
    public double averageScore() {
        double averageScore = 0;
        for (Subject subject : subjectList) {
            averageScore += subject.getCourse();
        }
        return averageScore / subjectList.size();
    }

    @Override
    public String toString() {
        double tmp = averageScore();
        return "name= " + name + ", id= " + id + ", date= " + date + ", subjectList= " + subjectList + "averageScore" + (int) (tmp * 100) / 100.0 + "\n";
    }
}
