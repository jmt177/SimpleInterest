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
        CreditCard p1Card3 = new MC(128384.00f);
        Person person1 = new Person("George", "Koors");
        Wallet p1Wallet1 = new Wallet(person1Card1);
        Wallet p1Wallet2 = new Wallet(p1Card3);
        CreditCard person1Card2 = new MC(1234.22f);
        person1.addWallet(p1Wallet2);
        person1.addWallet(p1Wallet1);
        person1.addCardToWallet(p1Wallet1, person1Card2);
        person1.showTotalBalance(person1.getWallets());
    }
}
