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
public class Visa extends CreditCard {
    
    // Visa's only interest rate value
    private static final float INTERESTRATE = 0.1f;
    
    // no args constructor, balance of 0
    public Visa(){
        this(0.0f);
    }
    
    public Visa(float balance) {
        super(INTERESTRATE, balance, "Visa");
    }
    
}
