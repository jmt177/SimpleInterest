/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wallets;

import CreditCards.CreditCard;
import java.util.ArrayList;

/**
 *
 * @author jtdollarsign
 */
public class Wallet {
    
    // fields
    private ArrayList<CreditCard> cards;

    // constructor, single card
    public Wallet(CreditCard card){
        this.cards = new ArrayList<>();
        addCard(card);
    }
    
    // constructor, multiple cards at once
    public Wallet(ArrayList<CreditCard> cards) {
        this.cards = new ArrayList<>();
        for (CreditCard card : cards) {
            addCard(card);
        }
    }

    // functional methods
    public final void addCard(CreditCard card){
        this.getCards().add(card);
    }
    
    public float walletInterest(){
        float sum = 0;
        for (CreditCard card : cards) {
            sum += card.calcInterest();
        }
        return sum;
    }
    
    public float walletBalance(){
        float sum = 0;
        for (CreditCard card : cards) {
            sum += card.getBalance();
        }
        return sum;
    }
    
    // getters and setters
    public ArrayList<CreditCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<CreditCard> cards) {
        this.cards = cards;
    }
    
    
    
}
