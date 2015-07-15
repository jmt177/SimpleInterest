/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCards;

/**
 *
 * @author jtdollarsign
 */
public class MC extends CreditCard {
    
    // MC's only interest rate value
    private static final float INTERESTRATE = 0.05f;
    
    // no args constructor, balance of 0
    public MC(){
        this(0.0f);
    }
    
    public MC(float balance) {
        super(INTERESTRATE, balance, "MC");
    }    
}
