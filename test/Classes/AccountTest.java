/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class AccountTest extends TestCase{
    
    private Account account1;
    private Account account2;
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
        this.account1 = new Account(12345); //CUENTA 1 DEL EJEMPLO DE LA PRACTICA
        this.account2 = new Account(67890); //CUENTA 2 DEL EJEMPLO DE LA PRACTICA
    }
    
    @After
    @Override
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("WithDraw-1");
        float data = 0.0F;
        Account instance = null;
        float expResult = 0.0F;
        float result = instance.withdraw(data);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("Deposit-1");
        float data = 0.0F;
        Account instance = null;
        float expResult = 0.0F;
        float result = instance.deposit(data);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
