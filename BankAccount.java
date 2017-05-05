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
 *	File: BankAccount.java
 *	Description: BankAccount class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;


public class BankAccount {
    
    private long acctNo;
    private String acctName;
    private String acctExp;

    public BankAccount() {
    }

    public BankAccount(long acctNo, String acctName, String acctExp) {
        this.acctNo = acctNo;
        this.acctName = acctName;
        this.acctExp = acctExp;
    }

    public long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(long acctNo) {
        this.acctNo = acctNo;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctExp() {
        return acctExp;
    }

    public void setAcctExp(String acctExp) {
        this.acctExp = acctExp;
    }
    
    public static void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
    
}
