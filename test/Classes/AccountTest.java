/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.IncorrectDataException;
import Exceptions.LimitBalanceException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        //this.account1 = new Account(250, 12345); //CUENTA 1 DEL EJEMPLO DE LA PRACTICA
        //this.account2 = new Account(67890); //CUENTA 2 DEL EJEMPLO DE LA PRACTICA
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
     * Test of Account1
     */
    @Test
    public void testAccount1() {        
        System.out.println("Prueba con Account 1------------------------");
        this.account1 = new Account(50, 12345); //CUENTA 1 DEL EJEMPLO DE LA PRACTICA
        float result1 = -1;
        try {
            System.out.println("1.- WITHDRAW $200 FROM ACCOUNT #12345");
            account1.withdraw(200);
            System.out.println("3.- DEPOSIT $100 INTO ACCOUNT #12345");
            account1.deposit(100);
            System.out.println("6.- WITHDRAW $200 FROM ACCOUNT #12345");
            result1 = account1.withdraw(200);
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(-250f, result1);
        System.out.println("LOS RESULTADOS EN LA CUENTA 1 HAN SIDO CORRECTOS - BALANCE FINAL DE " + result1);
    }
    
    /**
     * Test of Account2
     */
    @Test
    public void testAccount2() {
        System.out.println("Prueba con Account 2------------------------");
        this.account2 = new Account(0, 67890); //CUENTA 2 DEL EJEMPLO DE LA PRACTICA
        float result1 = -1;
        try {
            System.out.println("2.- WITHDRAW $350 FROM ACCOUNT #67890");
            account2.withdraw(350);
            System.out.println("4.- WITHDRAW $200 FROM ACCOUNT #67890");
            //account2.withdraw(200);//DA ERROR
            System.out.println("5.- WITHDRAW $150 FROM ACCOUNT #67890");
            account2.withdraw(150);
            System.out.println("7.- DEPOSIT $50 INTO ACCOUNT #67890");
            result1 = account2.deposit(50);
            System.out.println("8.- WITHDRAW $100 FROM ACCOUNT #67890");
            //account2.withdraw(100);//DA ERROR
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        assertEquals(-450f, result1);
        System.out.println("LOS RESULTADOS EN LA CUENTA 2 HAN SIDO CORRECTOS - BALANCE FINAL DE " + result1);
    }
    
    /**
     * Test of Accounts
     */
    @Test
    public void testAccounts() {
        System.out.println("Ejecucion conjunto de operaciones en ambas cuentas-----------------------");
        this.account1 = new Account(50, 12345); //CUENTA 1 DEL EJEMPLO DE LA PRACTICA
        this.account2 = new Account(0, 67890); //CUENTA 2 DEL EJEMPLO DE LA PRACTICA
        float result1 = -1;
        float result2 = -1;
        try {
            System.out.println("1.- WITHDRAW $200 FROM ACCOUNT #12345");
            account1.withdraw(200);         
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("2.- WITHDRAW $350 FROM ACCOUNT #67890");
            account2.withdraw(350);         
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("3.- DEPOSIT $100 INTO ACCOUNT #12345");
            account1.deposit(100);       
        } catch (IncorrectDataException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("4.- WITHDRAW $200 FROM ACCOUNT #67890");
            account2.withdraw(200);//DA ERROR       
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("5.- WITHDRAW $150 FROM ACCOUNT #67890");
            account2.withdraw(150);     
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("6.- WITHDRAW $200 FROM ACCOUNT #12345");
            result1 = account1.withdraw(200);    
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("7.- DEPOSIT $50 INTO ACCOUNT #67890");
            result2 = account2.deposit(50);  
        } catch (IncorrectDataException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            System.out.println("8.- WITHDRAW $100 FROM ACCOUNT #67890");
            account2.withdraw(100);//DA ERROR   
        } catch (IncorrectDataException | LimitBalanceException ex) {
            System.out.println(ex.getMessage());
        }
        
        assertEquals(-250f, result1);
        assertEquals(-450f, result2);
        System.out.println("LOS RESULTADOS EN LA CUENTA 1 HAN SIDO CORRECTOS - BALANCE FINAL DE " + result1);
        System.out.println("LOS RESULTADOS EN LA CUENTA 2 HAN SIDO CORRECTOS - BALANCE FINAL DE " + result1);
    }
}
