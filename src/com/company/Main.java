package com.company;

import javax.security.auth.Subject;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);
        School school = new School();

        System.out.print("Are you Student or Teacher ?");
        boolean quit = false;
        while (!quit) {
            System.out.println("\nPress \n 0-options \n1-Student \n2-Teacher \n3-Administrator \n4-Quit");
            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Student Page");
                    System.out.print("Enter Your Name: ");
                    String studentName = keyboard.nextLine();
                    System.out.print("Enter Your Year: ");
                    int studentYear = keyboard.nextInt();
                    Student student = new Student(studentName, studentYear);
                    school.addStudent(student);
                    //  System.out.println(student.toString());
                    System.out.println("Available Options: " +
                            "\n 1-Get Available Options " +
                            "\n 2-Get Your ID" +
                            "\n 3-Enrol" +
                            "\n 4-Get enrolled subjects" +
                            "\n 5-Get total fees" +
                            "\n 6-Pay Fees" +
                            "\n 7-Get Total Fees Payed" +
                            "\n 8-Quit");
                    boolean loop = true;
                    while (loop) {
                        int option = keyboard.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Available Options: " +
                                        "\n 1-Get Available Options " +
                                        "\n 2-Get Your ID" +
                                        "\n 3-Enrol" +
                                        "\n 4-Get enrolled subjects" +
                                        "\n 5-Get total fees" +
                                        "\n 6-Pay Fees" +
                                        "\n 7-Get Total Fees Payed" +
                                        "\n 8-Quit");
                                break;
                            case 2:
                                System.out.println("Your Student Id: " + student.getStudentId());
                                break;
                            case 3:
                                System.out.println("Which subject would you like to enrol in?");
                                keyboard.nextLine();
                                String subject = keyboard.nextLine();
                                student.enrol(subject);
                                break;
                            case 4:
                                student.getEnrolledSubject();
                                break;
                            case 5:
                                System.out.println("fees left to be payed " + student.getTotalFees());
                                break;
                            case 6:
                                System.out.println("How much do you want to pay?");
                                double amount = keyboard.nextDouble();
                                student.payFee(amount);
                                break;
                            case 7:
                                System.out.println("Total fees payed " + student.getTotalFeesPayed());
                                break;
                            case 8:
                                loop = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter your 5 digit id: ");
                    String teacherId = keyboard.nextLine();
                    System.out.print("Enter your name: ");
                    String teacherName = keyboard.nextLine();
                    System.out.println("Enter total class you'll teach: ");
                    int classTaught = keyboard.nextInt();
                    Teacher teacher = new Teacher(teacherId, teacherName, classTaught);
                    school.addTeacher(teacher);
                    System.out.println("Available option: " +
                            "\n 1-Get available options" +
                            "\n 2-Get id" +
                            "\n 3-Get name" +
                            "\n 4-Get Salary" +
                            "\n 5-Quit");
                    boolean quiting = false;
                    while (!quiting) {
                        int option = keyboard.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("Available option: " +
                                        "\n 1-Get available options" +
                                        "\n 2-Get id" +
                                        "\n 3-Get name" +
                                        "\n 4-Get Salary" +
                                        "\n 5-Quit");
                                break;
                            case 2:
                                System.out.println("Id: " + teacher.getId());
                                break;
                            case 3:
                                System.out.println("Name: " + teacher.getName());
                                break;
                            case 4:
                                System.out.println("Salary: " + teacher.getSalary());
                                break;
                            case 5:
                                quiting = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Options: " +
                            "\n 1-Total Money Earned" +
                            "\n 2-Total Money Spent" +
                            "\n 3-Get all students" +
                            "\n 4-Get all teacher" +
                            "\n 5- Available options" +
                            "\n 6-Quit");
                    boolean o = true;
                    while (o){
                        int number = keyboard.nextInt();
                        switch (number){
                            case 1:
                                school.moneyEarned();
                                break;
                            case 2:
                                school.moneySpent();
                                break;
                            case 3:
                                school.getAllStudents();
                                break;
                            case 4:
                                school.getAllTeacher();
                                break;
                            case 5:
                                System.out.println("Options: " +
                                        "\n 1-Total Money Earned" +
                                        "\n 2-Total Money Spent" +
                                        "\n 3-Get all students" +
                                        "\n 4-Get all teacher" +
                                        "\n 5- Available options" +
                                        "\n 6-Quit");
                                break;
                            case 6:
                                o = false;
                                break;
                        }
                    }
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }
}
