/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wallets;

import CreditCards.CreditCard;
import CreditCards.Visa;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jtdollarsign
 */
public class WalletTest {
    
    public WalletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addCard method, of class Wallet.
     */
    @Test
    public void testAddCard() {
        System.out.println("JUnit4 Test: Wallet.addCard");
        CreditCard card = new Visa(100.00f);
        Wallet wallet = new Wallet(card);
        wallet.addCard(card);
        assertTrue(wallet.getCards().get(0) == card);
    }

    /**
     * Test of walletInterest method, of class Wallet.
     */
    @Test
    public void testWalletInterest() {
        System.out.println("JUnit4 Test: Wallet.walletInterest");
        CreditCard card = new Visa(100.00f);
        CreditCard card2 = new Visa(100.00f);
        Wallet wallet = new Wallet(card);
        wallet.addCard(card2);
        float expResult = 20.0F;
        float result = wallet.walletInterest();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of walletBalance method, of class Wallet.
     */
    @Test
    public void testWalletBalance() {
        System.out.println("JUnit4 Test: Wallet.walletBalance");
        CreditCard card = new Visa(100.00f);
        CreditCard card2 = new Visa(100.00f);        
        Wallet instance = new Wallet(card);
        instance.addCard(card2);
        float expResult = 200.0F;
        float result = instance.walletBalance();
        assertEquals(expResult, result, 0.0);
    }
}
