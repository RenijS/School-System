package com.company;

public class Teacher {
    private String id;
    private String name;
    private double salary;
    private static double SALARY_PER_CLASS = 600;
    private int classTaught;



    public Teacher(String id, String name, int classTaught) {
        this.id = id;
        this.name = name;
        this.classTaught = classTaught;
        this.salary = classTaught * SALARY_PER_CLASS;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = this.classTaught * SALARY_PER_CLASS;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", classTaught=" + classTaught +
                '}';
    }
}
