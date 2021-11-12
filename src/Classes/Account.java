/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class Account {
    private float balance;    
    private final int idAccount;
    
    public Account(int idAccount){
        this.idAccount = idAccount;
        this.balance = 500;
    }
    
    public Account(float initialBalance, int idAccount){
        this.balance = balance;
        this.idAccount = idAccount;
    }
    
    public float balance(){
        return this.balance;
    }
    
    /**
     * Sacar dinero de la cuenta
     * @param data
     * @return 
     */
    public float withdraw(float data){
        return 0;
    }
    
    public float deposit(float data){
        return 0;
    } 
    
}
