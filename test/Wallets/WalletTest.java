/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wallets;

import CreditCards.CreditCard;
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
        System.out.println("addCard");
        CreditCard card = null;
        Wallet instance = null;
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class Wallet.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Wallet instance = null;
        ArrayList<CreditCard> expResult = null;
        ArrayList<CreditCard> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCards method, of class Wallet.
     */
    @Test
    public void testSetCards() {
        System.out.println("setCards");
        ArrayList<CreditCard> cards = null;
        Wallet instance = null;
        instance.setCards(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
