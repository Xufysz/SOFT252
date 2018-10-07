/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankentities;

import bankentities.BankAccount.TransactionOutput;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kyler
 */
public class BankAccountTest {

    private BankAccount testInstance;

    public BankAccountTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.testInstance = new BankAccount("kyle", 100, 500);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of GetHolder method, of class BankAccount.
     */
    @Test
    public void testGetHolder() {
        System.out.println("GetHolder");
        BankAccount instance = this.testInstance;
        String expResult = "kyle";
        String result = instance.GetHolder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of GetBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("GetBalance");
        BankAccount instance = this.testInstance;
        int expResult = 100;
        int result = instance.GetBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of GetOverdraft method, of class BankAccount.
     */
    @Test
    public void testGetOverdraft() {
        System.out.println("GetOverdraft");
        BankAccount instance = this.testInstance;
        int expResult = 500;
        int result = instance.GetOverdraft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of DepositMoney method, of class BankAccount.
     */
    @Test
    public void testDepositMoney_String() {
        System.out.println("DepositMoney");
        String amount = "200";
        BankAccount instance = this.testInstance;
        BankAccount.TransactionOutput expResult = TransactionOutput.COMPLETED;
        BankAccount.TransactionOutput result = instance.DepositMoney(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of DepositMoney method, of class BankAccount.
     */
    @Test
    public void testDepositMoney_int() {
        System.out.println("DepositMoney");
        int amount = 200;
        BankAccount instance = this.testInstance;
        BankAccount.TransactionOutput expResult = TransactionOutput.COMPLETED;
        BankAccount.TransactionOutput result = instance.DepositMoney(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of WithdrawMoney method, of class BankAccount.
     */
    @Test
    public void testWithdrawMoney_String() {
        System.out.println("WithdrawMoney");
        String amount = "200";
        BankAccount instance = this.testInstance;
        BankAccount.TransactionOutput expResult = TransactionOutput.COMPLETED;
        BankAccount.TransactionOutput result = instance.WithdrawMoney(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of WithdrawMoney method, of class BankAccount.
     */
    @Test
    public void testWithdrawMoney_int() {
        System.out.println("WithdrawMoney");
        int amount = 200;
        BankAccount instance = this.testInstance;
        BankAccount.TransactionOutput expResult = TransactionOutput.COMPLETED;
        BankAccount.TransactionOutput result = instance.WithdrawMoney(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
