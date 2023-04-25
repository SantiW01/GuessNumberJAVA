/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessnumber;

/**
 *
 * @author Santiago
 */
public class Game {
    protected int[] numbersChosen = new int[2];
    public void SetFirstNumber() {
        this.numbersChosen[0] = ComputerNumber();
    }
    public void SetSecondNumber() {
        this.numbersChosen[1] = UserNumber();
    }
    
    public int GetFirstNumber() {
        return this.numbersChosen[0];
    }
    
    public int GetSecondNumber() {
        return this.numbersChosen[1];
    }
    
    public int UserNumber(){
        UserNumber playerNumber = new UserNumber();
        playerNumber.SetNumber(playerNumber.EnterNumber());
        return playerNumber.GetNumber();
    }
    public int ComputerNumber() {
        ComputerNumber computerNumber = new ComputerNumber();
        computerNumber.SetComputerNumber((int) (100 * Math.random()));
        return computerNumber.GetComputerNumber();
    }  
}

