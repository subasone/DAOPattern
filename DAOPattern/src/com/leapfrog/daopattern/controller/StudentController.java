/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.controller;

import com.leapfrog.daopattern.Student;
import com.leapfrog.daopattern.studentDAO.StudentDAO;
import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class StudentController {

    private Scanner input;
    private StudentDAO studentDAO;

    public StudentController(Scanner input, StudentDAO studentDAO) {
        this.input = input;
        this.studentDAO = studentDAO;
    }

    private void menu() {
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search by ID");
        System.out.println("4. Show All");
        System.out.println("5. Exit");

        System.out.println("Enter your choice[1-5]");
    }

    private void add() {
        while (true) {
            Student std = new Student();
            //System.out.println("Enter Id: ");
            std.setId(studentDAO.count() + 1);
            System.out.println("Enter First Name : ");
            std.setFisrtName(input.next());
            System.out.println("Enter Last Name: ");
            std.setLastName(input.next());
            System.out.println("Enter Email: ");
            std.setEmail(input.next());
            System.out.println("Enter Status: ");
            std.setStatus(input.nextBoolean());
            studentDAO.insert(std);
            System.out.println("Do you really want to add more?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void delete() {
        while (true) {
            System.out.println("Enter ID to delete: ");
            int ID = input.nextInt();
            studentDAO.delete(ID);
            System.out.println("Do you really want to delete other?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    private void searchById() {
        while (true) {
            System.out.println("Enter ID to search: ");
            Student student = studentDAO.getById(input.nextInt());
            if (student != null) {
                System.out.println("ID: " + student.getId());
                System.out.println("Name : " + student.getFullName());
            } else {
                System.out.println("ID not found");
            }
            System.out.println("Do you really want to search again?[y/n]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private void showAll() {
        for (Student s : studentDAO.getAll()) {
            System.out.println("ID: " + s.getId());
            System.out.println("Name : " + s.getFullName());
        }
        System.out.println("Press Any Key to Menu.....");
        input.next();
    }

    public void process() {
        menu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                searchById();
                break;
            case 4:
                showAll();
                break;
            case 5:
                System.out.println("Do you really want to exit?[y/n]");
                if (input.next().equalsIgnoreCase("y")) {
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

}
