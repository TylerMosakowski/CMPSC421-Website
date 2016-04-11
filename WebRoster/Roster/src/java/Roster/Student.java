/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roster;

/**
 *
 * @author bmk5282
 */
public class Student {
    private String Fname, Lname, team, ID;
    
    public Student() {}
    
    public void setFName(String name)
    {
        this.Fname = name;
    }
    public String getFName()
    {
        return this.Fname;
    }
    public void setLName(String name)
    {
        this.Lname = name;
    }
    public String getLName()
    {
        return this.Lname;
    }
    
    public void setTeam(String t)
    {
        this.team = t;
    }
    public String getTeam()
    {
        return this.team;
    }
    
    public void setID(String  ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return this.ID;
    }
}
