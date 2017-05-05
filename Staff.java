/*
 *
 *	INFS2605 2017 Sem 1 - SuBer Assignment
 *	
 *	Authors: Jane Jihee Kim, Ilasha Prabhu, Elyse Ng and Manan Patel (J & Co.)
 *
 *	Version 0.1.0
 *
 *
 *
 *	File: Staff.java
 *	Description: Staff class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;

public class Staff {
    
    private int staffID;
    private String staffPW;

    public Staff() {
        
    }

    public Staff(int staffID, String staffPW) {
        this.staffID = staffID;
        this.staffPW = staffPW;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getStaffPW() {
        return staffPW;
    }

    public void setStaffPW(String staffPW) {
        this.staffPW = staffPW;
    }
       
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
        
}
