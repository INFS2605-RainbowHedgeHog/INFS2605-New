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
 *	File: Corporate.java
 *	Description: Corporate class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;


public abstract class Corporate {
    
    protected int compID;
    protected String compName;
    protected String compAdd;
    protected int compPIN;
    protected long compPhone;
    private char custType;

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompAdd() {
        return compAdd;
    }

    public void setCompAdd(String compAdd) {
        this.compAdd = compAdd;
    }

    public int getCompPIN() {
        return compPIN;
    }

    public void setCompPIN(int compPIN) {
        this.compPIN = compPIN;
    }

    public long getCompPhone() {
        return compPhone;
    }

    public void setCompPhone(long compPhone) {
        this.compPhone = compPhone;
    }

    public char getCustType() {
        return custType;
    }

    public void setCustType(char custType) {
        this.custType = custType;
    }   
    
    public abstract void updateDatabase(Connection conn); 
}

