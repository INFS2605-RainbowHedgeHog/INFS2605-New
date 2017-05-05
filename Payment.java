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
 *	File: Payment.java
 *	Description: Payment class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;


public abstract class Payment {
    
    protected int recieptNo;
    protected int amount;
    protected int userID;
    protected long fromAcctNo;
    protected long toAcctNo;
    protected String paymentMedia;
    private char paymentTypeFlag;
    
    
    public int getRecieptNo() {
        return recieptNo;
    }

    public void setRecieptNo(int recieptNo) {
        this.recieptNo = recieptNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public long getFromAcctNo() {
        return fromAcctNo;
    }

    public void setFromAcctNo(long fromAcctNo) {
        this.fromAcctNo = fromAcctNo;
    }

    public long getToAcctNo() {
        return toAcctNo;
    }

    public void setToAcctNo(long toAcctNo) {
        this.toAcctNo = toAcctNo;
    }

    public String getPaymentMedia() {
        return paymentMedia;
    }

    public void setPaymentMedia(String paymentMedia) {
        this.paymentMedia = paymentMedia;
    }

    public char getPaymentTypeFlag() {
        return paymentTypeFlag;
    }

    public void setPaymentTypeFlag(char paymentTypeFlag) {
        this.paymentTypeFlag = paymentTypeFlag;
    }
    
    public abstract void updateDatabase(Connection conn);
    
}
