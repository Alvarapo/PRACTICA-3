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
    public void setUpClass() {
        this.account1 = new Account(12345); //CUENTA 1 DEL EJEMPLO DE LA PRACTICA
        this.account2 = new Account(67890); //CUENTA 2 DEL EJEMPLO DE LA PRACTICA
    }
    
    @AfterClass
    public void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
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
        float expResult = 0.0F;
        float result = account1.withdraw(data);
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
        float expResult = 0.0F;
        float result = account1.deposit(data);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
