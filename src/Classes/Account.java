/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Exceptions.IncorrectDataException;
import Exceptions.LimitBalanceException;

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
        this.balance = initialBalance;
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
     * Sacar dinero de la cuenta.Si la cantidad que nos quedara fuera negativa, no podremos sacar dinero de la cuenta, además, data debe ser positivo
     * @param data
     * @return 
     * @throws Exceptions.IncorrectDataException Para errores con datos
     * @throws Exceptions.LimitBalanceException Para errores de limites permitidos
     */
    public float withdraw(float data) throws IncorrectDataException, LimitBalanceException{
        if(data <= 0){
            throw new IncorrectDataException("El saldo que se desea retirar es negativo. Introduzca cantidad positiva");
        }else if(data > 500){
            throw new IncorrectDataException("El saldo que se desea retirar excede de 500€ para " + data + " en withdraw");
        }
        
        else {
            //SI LA CANTIDAD QUE DESEAMOS SACAR HACE QUE NUESTRA CUENTA QUEDE EN MENOS DE -500.0, SALTARÁ ERROR.
            if((this.balance-data) < -500.0){
                throw new LimitBalanceException("El saldo que se desea retirar excede de 500€ para " + data + " en withdraw");
            }
            //Si no deja la cuenta en menos de -500.0
            else{
                this.balance = this.balance - data;
            }
        }        
        return this.balance;
    }
    
    /**
     * Depositamos dinero en la cuenta.
     * @param data
     * @return 
     * @throws Exceptions.IncorrectDataException Para errores con datos
     */
    public float deposit(float data) throws IncorrectDataException{
        if(data <= 0){
            throw new IncorrectDataException("El saldo que se desea ingresar es negativo. Introduzca cantidad positiva");
        }
        else this.balance+=data;
        
        return this.balance;
    } 
    
}
