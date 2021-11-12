/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.IncorrectDataException;

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
    
    /**
     * Constructor con dos parámetros
     * @param initialBalance
     * @param idAccount 
     */
    public Account(float initialBalance, int idAccount){
        this.balance = balance;
        this.idAccount = idAccount;
    }
    
    /**
     * Devuelve el balance total de mi cuenta
     * @return 
     */
    public float balance(){
        return this.balance;
    }
    
    /**
     * Sacar dinero de la cuenta. Si la cantidad que nos quedara fuera negativa, no podremos sacar dinero de la cuenta, además, data debe ser positivo
     * @param data
     * @return 
     */
    public float withdraw(float data) throws IncorrectDataException{
        if(data <= 0){
            throw new IncorrectDataException("El saldo que se desea retirar es negativo. Introduzca cantidad positiva");
        }
        else {
            //if()
        }
        
        
        
        return 0;
    }
    
    /**
     * Depositamos dinero en la cuenta.
     * @param data
     * @return 
     */
    public float deposit(float data){
        return 0;
    } 
    
}
