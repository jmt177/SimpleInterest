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
public class Discover extends CreditCard {
    
    // Discover's only interest rate value
    private static final float INTERESTRATE = 0.01f;
    
    // no args constructor, balance of 0
    public Discover(){
        this(0.0f);
    }
    
    public Discover(float balance) {
        super(INTERESTRATE, balance, "Discover");
    }    
}
