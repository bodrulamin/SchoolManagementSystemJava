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


    void printSchoolDetails(){
        System.out.println("Shool Details");
    }


}
