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
        int computerChoose = (int) (Math.random() * 100);
        Scanner userEntry = new Scanner(System.in);
        int userGuess = 0;
       System.out.print("Enter a number: ");
        while(userGuess != computerChoose) {
        userGuess = userEntry.nextInt();
        if(userGuess > computerChoose) {
            System.out.println("Number chosen by computer is smaller");
        }
           
        if(userGuess < computerChoose) {
            System.out.println("Number chosen by computer is greater");
        }
    }
    }
}