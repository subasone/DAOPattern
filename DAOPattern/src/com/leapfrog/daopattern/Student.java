/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.daopattern;

/**
 *
 * @author onesoft
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean status;
    
    public Student(){
        
    }

    public Student(int id, String fisrtName, String lastName, String email, boolean status) {
        this.id = id;
        this.firstName = fisrtName;
        this.lastName = lastName;
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFisrtName() {
        return firstName;
    }

    public void setFisrtName(String fisrtName) {
        this.firstName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
     public String getFullName(){
         return firstName + " " + lastName;
     }
   
    
    
}
