/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import CreditCards.*;
import Wallets.Wallet;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jtdollarsign
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTotalBalance method, of class Person.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        ArrayList<Wallet> wallets = null;
        Person instance = null;
        float expResult = 0.0F;
        float result = instance.getTotalBalance(wallets);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalInterest method, of class Person.
     */
    @Test
    public void testGetTotalInterest() {
        System.out.println("JUnit4 Test: Person.getTotalInterest");
        CreditCard card1 = new Visa(100.00f);
        CreditCard card2 = new MC(100.00f);        
        Wallet wallet1 = new Wallet(card1);
        wallet1.addCard(card2);
        Person person = new Person("some", "guy");
        person.addWallet(wallet1);
        float expectedInterest = 15.0F;
        assertEquals(expectedInterest, person.getTotalInterest(person.getWallets()), 0.0);
    }

    /**
     * Test of getWallets method, of class Person.
     */
    @Test
    public void testGetWallets() {
        System.out.println("JUnit4 Test: Person.getWallets");
        CreditCard card1 = new Visa(100.00f);
        CreditCard card2 = new Visa(100.00f);        
        Wallet wallet1 = new Wallet(card1);
        Wallet wallet2 = new Wallet(card2);
        Person person = new Person("some", "guy");
        person.addWallet(wallet1);
        person.addWallet(wallet2);
        assertEquals(wallet1, person.getWallets().get(0));
        assertEquals(wallet2, person.getWallets().get(1));
    }
    
}
