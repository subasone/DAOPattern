/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern;

import com.leapfrog.daopattern.studentDAO.StudentDAO;
import com.leapfrog.daopattern.studentDAOImpl.StudentDAOImpl;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

      //print all students
      for (Student student : studentDAO.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentDAO.getAllStudents().get(0);
      student.setName("Hari");
      studentDAO.updateStudent(student);

      //get the student
      studentDAO.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");	
    }
    
}
