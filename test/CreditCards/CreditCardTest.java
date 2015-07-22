/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreditCards;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jtdollarsign
 */
public class CreditCardTest {
    
    public CreditCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    @Test
    public void testDiscover() {
        System.out.println("JUnit4 Test: Discover.calcInterest():");
        CreditCard discoverCard = new Discover(100.00f);
        // these are the only actual calculations, other methods return an attribute
        assertEquals(0.01f * 100.00f, discoverCard.calcInterest(), 0);
        assertEquals(101.00f, discoverCard.calcTotalBalance(), 0);
    }
    

    @Test
    public void testMC() {
        System.out.println("JUnit4 Test: Discover.calcInterest():");
        CreditCard mcCard = new MC(100.00f);
        // these are the only actual calculations, other methods return an attribute
        assertEquals(0.05f * 100.00f, mcCard.calcInterest(), 0);
        assertEquals(105.00f, mcCard.calcTotalBalance(), 0);
    }
    

    @Test
    public void testVisa() {
        System.out.println("JUnit4 Test: Discover.calcInterest():");
        CreditCard visaCard = new Visa(100.00f);
        // these are the only actual calculations, other methods return an attribute
        assertEquals(0.1f * 100.00f, visaCard.calcInterest(), 0);
        assertEquals(110.00f, visaCard.calcTotalBalance(), 0);
    }
       
}
