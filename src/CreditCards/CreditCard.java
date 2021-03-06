/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCards;

import Customers.Calculations;

/**
 *
 * @author jtdollarsign
 */
public abstract class CreditCard {
    
    // fields
    private float interestRate;
    private float balance;
    private String name;

    // constructor
    public CreditCard(float interestRate, float balance, String name) {
        this.interestRate = interestRate;
        this.balance = balance;
        this.name = name;
    }

    public float calcInterest(){
        return this.interestRate * this.balance;
    }
    
    public float calcTotalBalance(){
        return this.calcInterest() + this.balance;
    }
    
    // getters and setters
    public float getInterestRate() {
        return interestRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
