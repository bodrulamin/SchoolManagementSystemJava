package com.schoolmanagement;

import java.util.ArrayList;
import java.util.List;

public class School {
    static int totalMoneyEarned;
    static int totalMoneySpent;
    List<Student> studentList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();

    public static int remainingFund() {
        return totalMoneyEarned - totalMoneySpent;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
