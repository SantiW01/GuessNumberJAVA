/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessnumber;
import java.util.Scanner;
/**
 *
 * @author Santiago
 */
public class GuessNumber {
    public static void main(String[] args) {
        Game game = new Game();
        int firstNumber = game.ComputerNumber();
        int secondNumber = game.UserNumber();
        if(firstNumber == secondNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose");
        }
    }
}