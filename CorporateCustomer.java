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
 *	File: CorporateCustomer.java
 *	Description: CorporateCustomer clas
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;

public class CorporateCustomer extends Corporate {
    
    private int consultation;
    
    public CorporateCustomer(int compID, String compName, String compAdd, int compPIN, long compPhone, int consultation) {
        this.compID = compID;
        this.compName = compName;
        this.compAdd = compAdd;
        this.compPIN = compPIN;
        this.compPhone = compPhone;
        this.consultation = consultation;
        super.setCustType('C');
    }
    
    
    

    @Override
    public void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
}
