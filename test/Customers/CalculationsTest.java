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
public class CalculationsTest {
    
    public CalculationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of showTotalBalance method, of class Calculations.
     */
    @Test
    public void testShowTotalBalance() {
        System.out.println("showTotalBalance");
        ArrayList<Wallet> wallets = null;
        Calculations instance = new CalculationsImpl();
        instance.showTotalBalance(wallets);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBalance method, of class Calculations.
     */
    @Test
    public void testGetTotalBalance() {
        System.out.println("getTotalBalance");
        ArrayList<Wallet> wallets = null;
        Calculations instance = new CalculationsImpl();
        float expResult = 0.0F;
        float result = instance.getTotalBalance(wallets);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardBalance method, of class Calculations.
     */
    @Test
    public void testGetCardBalance() {
        System.out.println("getCardBalance");
        CreditCard card = null;
        Calculations instance = new CalculationsImpl();
        float expResult = 0.0F;
        float result = instance.getCardBalance(card);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWalletBalance method, of class Calculations.
     */
    @Test
    public void testGetWalletBalance() {
        System.out.println("getWalletBalance");
        Wallet wallet = null;
        Calculations instance = new CalculationsImpl();
        float expResult = 0.0F;
        float result = instance.getWalletBalance(wallet);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CalculationsImpl implements Calculations {

        public void showTotalBalance(ArrayList<Wallet> wallets) {
        }

        public float getTotalBalance(ArrayList<Wallet> wallets) {
            return 0.0F;
        }

        public float getCardBalance(CreditCard card) {
            return 0.0F;
        }

        public float getWalletBalance(Wallet wallet) {
            return 0.0F;
        }
    }
    
}
