/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.studentDAOImpl;
import com.leapfrog.daopattern.Student;
import com.leapfrog.daopattern.studentDAO.StudentDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author onesoft
 */
public class StudentDAOImpl implements StudentDAO {
      List<Student> students;    
      
      public StudentDAOImpl(){
          students = new ArrayList<Student>();
          Student student1 = new Student("Ram",0);
          Student student2 = new Student("Krishna",1);
          students.add(student1);
          students.add(student2);
      }
      @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   //retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
      
}
