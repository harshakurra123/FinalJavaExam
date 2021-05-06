/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;
import java.util.Objects;

/**
 *
 * @author Harshavardhan Kurra
 */
public class Bank {
    int receiptNo;  //initialize the variable receiptNo
    String bankName;  //initialize the bankName
    int amount;  //initialize the amount
    /*
    Bank constructor with inputs receiptNoIn, bankNameIn, amountIn
    */
    public Bank(int receiptNoIn, String bankNameIn, int amountIn){
        this.receiptNo = receiptNoIn;
        this.bankName = bankNameIn;
        this.amount = amountIn;
    }
    /*
    equals method is overriden and check the receiptNo of Bank class object equality.
    */
    @Override
    public boolean equals(Object obj){
        Bank bank=(Bank) obj;
        return this.receiptNo==bank.receiptNo;
    }
    /*
    hashcode method is overriden and generates the hashcode for each variable of Bank class.
    */
    @Override
    public int hashCode()
	{
                int hash = 4;
                hash = 56 * hash + Objects.hashCode(this.bankName);  //generates hashcode for bankName
                hash = 56 * hash + Objects.hashCode(this.receiptNo);  //generates hashcode for receiptNo
                hash = 56 * hash + Objects.hashCode(this.amount);  //generates hashcode for amount
                return hash;
	}
    
}
