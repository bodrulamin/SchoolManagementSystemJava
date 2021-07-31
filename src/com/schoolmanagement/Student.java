package com.schoolmanagement;

public class Student {
    private int id;
    private String name;
    private int className;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
        feesTotal += feesPaid;
        School.totalMoneyEarned += feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
        this.feesTotal = feesTotal;
    }
}