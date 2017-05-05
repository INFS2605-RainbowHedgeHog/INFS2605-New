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
 *	File: AgreementPayment.java
 *	Description: AgreementPayment class
 *	Date Last Modified: 05/05/17
 *	Fixes: Corrected data fields and data types. Added setter and getter methods
 *
 */
package Classes;

import java.sql.Connection;


public class AgreementPayment extends Payment {

    public AgreementPayment(int recieptNo, int amount, int userID, long fromAcctNo, long toAcctNo, String paymentMedia) {
        this.recieptNo = recieptNo;
        this.amount = amount;
        this.userID = userID;
        this.fromAcctNo = fromAcctNo;
        this.toAcctNo = toAcctNo;
        this.paymentMedia = paymentMedia;
        super.setPaymentTypeFlag('A');
    }
    
    @Override
    public void updateDatabase(Connection conn) {
        // sql statement that finds the user if already exists and replaces the
        // data, or creats a new entry with the data
    }
    
}
