package com.schoolmanagement;

public class Main {

    public static void main(String[] args) {
        // write your code here
        School school = new School();
        Student maliha = new Student(10, "Maliha", 9);

        maliha.setFeesPaid(1000);
        maliha.setFeesPaid(10);

        school.studentList.add(maliha);



        Teacher mehedi = new Teacher(420, "Mehedi", 100);
        mehedi.setSalary(mehedi.getSalary());
        mehedi.setSalary(mehedi.getSalary());

        Teacher yakub = new Teacher(421, "Yakub", 200);
        yakub.setSalary(200);

        school.teacherList.add(mehedi);
        school.teacherList.add(yakub);


        school.teacherList.size();


        System.out.println("School Earned " + School.totalMoneyEarned);
        System.out.println("School spent " + School.totalMoneySpent);

        System.out.println("Fund Remaining " + (School.remainingFund()));

        System.out.println("===========Teachers list");
        for (int i = 0; i < school.teacherList.size(); i++) {
            System.out.println(school.teacherList.get(i).getName());

        }
        System.out.println("===============Student list");
        for (int i = 0; i < school.studentList.size(); i++) {
            System.out.println(school.studentList.get(i).getName());

        }
    }
}
