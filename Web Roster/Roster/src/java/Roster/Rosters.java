/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roster;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.beans.XMLEncoder; // simple and effective
import javax.servlet.ServletContext;
import org.json.JSONObject;
import org.json.XML;


/**
 *
 * @author bmk5282
 */
public class Rosters {
    private int n = 33;
    private Student[ ] students;
    private ServletContext sctx;

    public Rosters() { }

    // The ServletContext is required to read the data from
    // a text file packaged inside the WAR file
    public void setServletContext(ServletContext sctx) {
	this.sctx = sctx;
    }
    public ServletContext getServletContext() { return this.sctx; }

    // getPredictions returns an XML representation of
    // the Predictions array
    public void setRosters(String ps) { } // no-op
    public JSONObject getRosters() {
	// Has the ServletContext been set?
	if (getServletContext() == null) 
	    return null;      

	// Have the data been read already?
	if (students == null) 
	    populate(); 

	// Convert the Predictions array into an XML document
	return toXML();
    }

    //** utilities
    private void populate() {
	String filename = "/WEB-INF/data/Roster.txt";
	InputStream in = sctx.getResourceAsStream(filename);

	// Read the data into the array of Predictions. 
	if (in != null) {
	    try {
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(isr);

		students = new Student[n];
		int i = 0;
		String record = null;
		while ((record = reader.readLine()) != null) {
		    String[] parts = record.split("!");
		    Student s = new Student();
		    s.setLName(parts[0]);
		    s.setFName(parts[1]);
                    s.setID(parts[2]);
                    s.setTeam(parts[3]);
                    
		    students[i++] = s;
		}
	    }
	    catch (IOException e) { }
	}
    }

    private JSONObject toXML() {
	String xml = null;
	try {
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    XMLEncoder encoder = new XMLEncoder(out);
	    encoder.writeObject(students); // serialize to XML
	    encoder.close();
	    xml = out.toString(); // stringify
	}
	catch(Exception e) { }
        //System.out.println(xml.trim());
        
        JSONObject jobt = XML.toJSONObject(xml);
        //System.out.println(jobt);
        
	return jobt;
    }
}
