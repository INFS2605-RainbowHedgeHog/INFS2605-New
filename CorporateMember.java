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
 *	File CorporateMember.java
 *	Description: CorporateMember class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 * 
 */
package Classes;

import java.sql.Connection;

public class CorporateMember extends Corporate {
    
    public CorporateMember(int compID, String compName, String compAdd, int compPIN, long compPhone) {
        this.compID = compID;
        this.compName = compName;
        this.compAdd = compAdd;
        this.compPIN = compPIN;
        this.compPhone = compPhone;
        super.setCustType('M');
    }

    @Override
    public void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
    
}
