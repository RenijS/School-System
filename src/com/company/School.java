package com.company;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private double totalMoneyEarned;
    private double totalMoneySpent;


    public boolean addTeacher(Teacher teacher){
        for (Teacher t: teacherList){
            if (t.getId().equals(teacher.getId())) {
                System.out.println("Teacher already added");
                return false;
            }
        }
        teacherList.add(teacher);
        return true;
    }

    public boolean addStudent(Student student){
        for (Student s: studentList){
            if (s.getStudentId().equals(student.getStudentId())){
                System.out.println("Student already added");
                return false;
            }
        }
        studentList.add(student);
        return true;
    }

    public void moneyEarned(){
        if (studentList.size() == 0){
            totalMoneyEarned = 0;
        } else {
            for (Student s: studentList){
                totalMoneyEarned += s.getTotalFeesPayed();
            }
        }
        System.out.println("Money earned: $" + totalMoneyEarned);
    }

    public void moneySpent(){
        if (teacherList.size() == 0){
            totalMoneySpent = 0;
        } else {
            for (Teacher t: teacherList){
                totalMoneySpent += t.getSalary();
            }
        }
        System.out.println("Money spent: $" + totalMoneySpent);
    }

    public void getAllStudents(){
        for (Student s: studentList){
            System.out.println(s.toString());
        }
    }
    public void getAllTeacher(){
        for (Teacher t: teacherList){
            System.out.println(t.toString());
        }
    }
}
