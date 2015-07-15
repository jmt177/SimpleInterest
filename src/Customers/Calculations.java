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
 *
 * @author jtdollarsign
 */
public interface Calculations {
    public void showTotalBalance(ArrayList<Wallet> wallets);
    
    public float getTotalBalance(ArrayList<Wallet> wallets);
    
    public float getCardBalance(CreditCard card);
    
    public float getWalletBalance(Wallet wallet);
}
