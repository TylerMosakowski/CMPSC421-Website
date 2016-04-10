package org.apache.jsp;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BXB5236
 */
public class Student implements Serializable {
    private String Fname;
    private String Lname;
    private int team;
    private String ID;
    
    public Student()
    {
    }
    public void setFName(String name)
    {
        this.Fname = name;
    }
    public String getFName()
    {
        return Fname;
    }
    public void setLName(String name)
    {
        this.Lname = name;
    }
    public String getLName()
    {
        return Lname;
    }
    
    public void setTeam(int t)
    {
        this.team = t;
    }
    public int getTeam()
    {
        return team;
    }
    
    public void setID(String  ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return ID;
    }
    
    
}
