/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessnumber;
/**
 *
 * @author Santiago
 */
public class GuessNumber {
    public static void main(String[] args) {
        Game game = new Game();
        final int firstNumber;
        int secondNumber = 0;
        int tries = 0;
        firstNumber = game.ComputerNumber();
        while( secondNumber != firstNumber ){
            secondNumber = game.UserNumber();
            if(secondNumber > firstNumber){
                System.out.println("Number chosen is greater than chosen by Computer");
            }
            if(secondNumber < firstNumber ) {
                System.out.println("Number chosen is smaller than chosen by Computer");
            }
            tries++;
        }
        System.out.println("You guess the number after " + tries + " tries.");
    }
}