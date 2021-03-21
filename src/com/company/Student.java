package com.company;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private int year;
    private double fees;
    private double totalFeesPayed;
    private static int ID = 1000;
    private static double COST_PER_SUBJECT = 800.00;

    private ArrayList<String> subjectEnrolled;

    public Student(String name, int year) {
        this.fees = 0.0;
        this.totalFeesPayed = 0.0;
        this.name = name;
        this.year = year;
        this.studentId = setUniqueID();
        subjectEnrolled = new ArrayList<>();
    }

    /**
     * This creates unique id
     * here, first letter will be grade level
     */
    public String setUniqueID(){
        ID++;
        return (this.year + "" + ID);
    }

    public String getStudentId() {
        return studentId;
    }

    public boolean enrol(String subName){
        if (subjectEnrolled.contains(subName)){
            System.out.println("Subject " + subName + " already enrolled");
            return false;
        }
        System.out.println("Enrolled in " + subName);
        subjectEnrolled.add(subName);
        fees += COST_PER_SUBJECT;
        return true;
    }
    public void getEnrolledSubject(){
        for (String s: this.subjectEnrolled){
            System.out.println(s);
        }
    }

    public double getTotalFees(){
        return fees;
    }

    public void payFee(double fee){
        System.out.println(fee + " payed");
        fees -= fee;
        totalFeesPayed += fee;
        System.out.println("Remaining " + fees + " left");
    }

    public double getTotalFeesPayed() {
        return totalFeesPayed;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", year=" + year +
                ", fees=" + fees +
                ", totalFeesPayed=" + totalFeesPayed +
                '}';
    }
}

