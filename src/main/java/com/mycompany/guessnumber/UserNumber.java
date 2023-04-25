/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessnumber;
import java.util.Scanner;
/**
 *
 * @author Santiago
 */
public class UserNumber {
    private int number;
    
    public void SetNumber(int numberChosen) {
        this.number = numberChosen;
    }
    
    public int GetNumber() {
        return this.number;
    }
    
    public int EnterNumber() {
        Scanner askUser = new Scanner(System.in);
        int numberChosen = askUser.nextInt();
        return numberChosen;
    }
}
