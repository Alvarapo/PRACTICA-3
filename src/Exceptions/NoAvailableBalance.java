/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class NoAvailableBalance extends Exception{
    public NoAvailableBalance(String message){
       super(message);
    }
}
