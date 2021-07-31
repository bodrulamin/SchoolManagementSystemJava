package com.schoolmanagement;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student maliha = new Student(10, "Maliha", 9);

        maliha.setFeesPaid(1000);
        maliha.setFeesPaid(10);

        Teacher mehedi = new Teacher(420, "Mehedi", 100);
        mehedi.setSalary(mehedi.getSalary());
        mehedi.setSalary(mehedi.getSalary());

        Teacher yakub = new Teacher(421,"Yakub",200);
        yakub.setSalary(200);


        System.out.println("School Earned " + School.totalMoneyEarned);
        System.out.println("School spent " +School.totalMoneySpent);

        System.out.println("Fund Remaining " + (School.remainingFund()));
    }
}
