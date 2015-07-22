/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customers;

import CreditCards.CreditCard;
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
     * Test of addWallet method, of class Person.
     */
    @Test
    public void testAddWallet() {
        System.out.println("addWallet");
        Wallet wallet = null;
        Person instance = null;
        instance.addWallet(wallet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToWallet method, of class Person.
     */
    @Test
    public void testAddCardToWallet() {
        System.out.println("addCardToWallet");
        Wallet wallet = null;
        CreditCard card = null;
        Person instance = null;
        instance.addCardToWallet(wallet, card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTotalBalance method, of class Person.
     */
    @Test
    public void testShowTotalBalance() {
        System.out.println("showTotalBalance");
        ArrayList<Wallet> wallets = null;
        Person instance = null;
        instance.showTotalBalance(wallets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getCardBalance method, of class Person.
     */
    @Test
    public void testGetCardBalance() {
        System.out.println("getCardBalance");
        CreditCard card = null;
        Person instance = null;
        float expResult = 0.0F;
        float result = instance.getCardBalance(card);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWalletBalance method, of class Person.
     */
    @Test
    public void testGetWalletBalance() {
        System.out.println("getWalletBalance");
        Wallet wallet = null;
        Person instance = null;
        float expResult = 0.0F;
        float result = instance.getWalletBalance(wallet);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Person instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Person instance = null;
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Person instance = null;
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWallets method, of class Person.
     */
    @Test
    public void testGetWallets() {
        System.out.println("getWallets");
        Person instance = null;
        ArrayList<Wallet> expResult = null;
        ArrayList<Wallet> result = instance.getWallets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
