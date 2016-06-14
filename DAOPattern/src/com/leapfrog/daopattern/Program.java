/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern;

import com.leapfrog.daopattern.controller.StudentController;
import com.leapfrog.daopattern.studentDAO.StudentDAO;
import com.leapfrog.daopattern.studentDAOImpl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentController studentController = new StudentController(input, studentDAO);

        System.out.println("Welcome To Student Management System");
        while (true) {
             studentController.process();
        }
    }

}
