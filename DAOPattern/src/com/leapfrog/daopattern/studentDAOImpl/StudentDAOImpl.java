/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern.studentDAOImpl;
import com.leapfrog.daopattern.Student;
import com.leapfrog.daopattern.studentDAO.StudentDAO;
import java.util.ArrayList;



/**
 *
 * @author onesoft
 */
public class StudentDAOImpl implements StudentDAO {
      private ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public boolean insert(Student s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return studentList.add(s);
    }

    @Override
    public boolean delete(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Student s = getById(id);
        if(s != null){
            studentList.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public Student getById(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(Student s: studentList){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return studentList;
    }

    @Override
    public int count() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return studentList.size();
    }

  
      
}
