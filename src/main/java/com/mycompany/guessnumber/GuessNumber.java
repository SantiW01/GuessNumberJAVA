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
        int numberChoose = (int) (Math.random() * 100);
        Scanner userEntry = new Scanner(System.in);
        int numberGuess = userEntry.nextInt();
        if(numberChoose == numberGuess) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose");
            System.out.println(numberChoose);
        }
    }
}
