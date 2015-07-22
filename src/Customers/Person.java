/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import CreditCards.CreditCard;
import Wallets.Wallet;
import java.util.ArrayList;

/**
 * Things to think about:
 * currently no removeWallet functionality
 * 
 */
public class Person implements Calculations{
    private String firstName;
    private String lastName;
    private ArrayList<Wallet> wallets;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        wallets = new ArrayList<Wallet>();
    }
    
    // functional methods
    public final void addWallet(Wallet wallet){
        this.wallets.add(wallet);
    }
    
    public void addCardToWallet(Wallet wallet, CreditCard card){
        wallet.addCard(card);
    }

    @Override
    public void showTotalBalance(ArrayList<Wallet> wallets) {
        System.out.println("--Total Balance for " + this.getFirstName() +
                           " " + this.getLastName() + "--");
        float totalBalance = 0.0f;
        float totalInterest = 0.0f;
        // display total balance going through each wallet
        for (Wallet curWallet : wallets) {
            for(int j = 0; j < curWallet.getCards().size(); j++){
                CreditCard curCard = curWallet.getCards().get(j);
                System.out.println(curCard.getName() + " card has $" + curCard.getBalance()
                        + " with a total of $" + curCard.calcInterest() + " in interest");
                System.out.println("at a rate of " + curCard.getInterestRate());
                totalBalance += curCard.getBalance();
                totalInterest += curCard.calcInterest();
            }
        }
    }

    @Override
    public float getTotalBalance(ArrayList<Wallet> wallets) {
        float totalBalance = 0.0f;
        // add from all wallets and cards
        for (Wallet curWallet : wallets) {
            for(int j = 0; j < curWallet.getCards().size(); j++){
                CreditCard curCard = curWallet.getCards().get(j);
                totalBalance += curCard.calcTotalBalance();
            }
        }
        return totalBalance;
    }

    public float getTotalInterest(ArrayList<Wallet> wallets){
        float totalInterest = 0.0f;
        // add from all wallets and cards
        for (Wallet curWallet : wallets) {
            for(int j = 0; j < curWallet.getCards().size(); j++){
                CreditCard curCard = curWallet.getCards().get(j);
                totalInterest += curCard.calcInterest();
            }
        }
        return totalInterest;        
    }
    
    // getters and setters. No setWallet
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    
}
