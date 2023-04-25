/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessnumber;

/**
 *
 * @author Santiago
 */
public class Play {
    public int Numbers(){
        UserNumber numberChosen = new UserNumber();
        numberChosen.SetNumber(numberChosen.EnterNumber());
        return numberChosen.GetNumber();
    }
}

/* 
ComputerNumber computerNumber = new ComputerNumber();
        computerNumber.SetComputerNumber((int) (100 * Math.random()));
        return computerNumber.GetComputerNumber();
*/