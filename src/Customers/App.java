/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import CreditCards.CreditCard;
import CreditCards.MC;
import CreditCards.Visa;
import Wallets.Wallet;
import java.util.ArrayList;

/**
 *
 * @author jtdollarsign
 */
public class App {
    public static void main(String[] args){
        CreditCard person1Card1 = new Visa(100.00f);
        Wallet person1Wallet = new Wallet(person1Card1);
        Person person1 = new Person("George", "Koors", person1Wallet);
        
        CreditCard person1Card2 = new MC(1234.22f);
        person1.addCardToWallet(person1Wallet, person1Card2);
        person1.showTotalBalance(person1.getWallets());
    }
}
