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
     * Test of Case One
     * 1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) –
     * Each Card has a balance of $100 – calculate the total interest
     * (simple interest) for this person and per card.
     */
    @Test
    public void testCaseOne() {
        System.out.println("JUnit4 Test: Case One");
        CreditCard visaCard = new Visa(100.00F);
        CreditCard mcCard = new MC(100.00F);
        CreditCard discoverCard = new Discover(100.00F);
        Wallet wallet = new Wallet(visaCard);
        wallet.addCard(mcCard);
        wallet.addCard(discoverCard);
        ArrayList<Wallet> wallets = new ArrayList<>();
        wallets.add(wallet);
        Person person = new Person("John", "Smith");
        float visaInterest = 10.0F;
        float mcInterest = 5.0F;
        float discoverInterest = 1.0F;
        float totalInterest = 16.0F;
        float result = person.getTotalInterest(wallets);
        assertEquals(totalInterest, result, 0.0);
        assertEquals(visaInterest, visaCard.calcInterest(), 0.0);
        assertEquals(mcInterest, mcCard.calcInterest(), 0.0);        
        assertEquals(discoverInterest, discoverCard.calcInterest(), 0.0);        
    }
    
    /**
     * 1 person has 2 wallets  Wallet 1 has a Visa and Discover, 
     * wallet 2 a MC -  each card has $100 balance - calculate 
     * the total interest(simple interest) for this person and interest per wallet
     */
    @Test
    public void testCaseTwo() {
        System.out.println("JUnit4 Test: Case Two");
        CreditCard visaCard = new Visa(100.00F);
        CreditCard mcCard = new MC(100.00F);
        CreditCard discoverCard = new Discover(100.00F);
        Wallet wallet1 = new Wallet(visaCard);
        Wallet wallet2 = new Wallet(mcCard);
        wallet1.addCard(discoverCard);

        Person person = new Person("John", "Smith");
        person.addWallet(wallet1);
        person.addWallet(wallet2);
      
        float wallet1Interest = 11.0F;
        float wallet2Interest = 5.0F;
        float totalInterest = 16.0F;
        float result = person.getTotalInterest(person.getWallets());
        assertEquals(totalInterest, result, 0.0);
        assertEquals(wallet1Interest, wallet1.walletInterest(), 0.0);
        assertEquals(wallet2Interest, wallet2.walletInterest(), 0.0);        
    }
    
    /**
     * 2 people have 1 wallet each,  person 1 has 1 wallet , with 2 cards MC 
     * and visa person 2 has 1 wallet – 1 visa and 1 MC -  each card has $100 
     * balance - calculate the total interest(simple interest) for each person
     * and interest per wallet
     */
    @Test
    public void testCaseThree() {
        System.out.println("JUnit4 Test: Case Three");
        CreditCard p1VisaCard = new Visa(100.00F);
        CreditCard p1mcCard = new MC(100.00F);
        CreditCard p2VisaCard = new Visa(100.00F);
        CreditCard p2mcCard = new MC(100.00F);
        
        Person person1 = new Person("John", "Smith");
        Person person2 = new Person("Jane", "Doe");
        
        Wallet p1wallet = new Wallet(p1VisaCard);
        p1wallet.addCard(p1mcCard);
        person1.addWallet(p1wallet);
        
        Wallet p2wallet = new Wallet(p2mcCard);
        p2wallet.addCard(p2VisaCard);
        person2.addWallet(p2wallet);

        float p1walletInterest = 15.0F;
        float p2walletInterest = 15.0F;
        float p1totalInterest = 15.0F;
        float p2totalInterest = 15.0F;
        assertEquals(p1totalInterest, person1.getTotalInterest(person1.getWallets()), 0.0);
        assertEquals(p1walletInterest, person1.getWallets().get(0).walletInterest(),0.0);
        assertEquals(p2totalInterest, person2.getTotalInterest(person2.getWallets()), 0.0);
        assertEquals(p2walletInterest, person2.getWallets().get(0).walletInterest(),0.0);    
    }    
}
