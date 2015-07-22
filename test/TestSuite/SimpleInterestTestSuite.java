package TestSuite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jtdollarsign
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CreditCards.CreditCardTest.class,
    Wallets.WalletTest.class,
    Customers.PersonTest.class    
})
public class SimpleInterestTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
