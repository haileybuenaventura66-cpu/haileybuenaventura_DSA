/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ashly;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class rps {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("{1} Rock");
        System.out.println("{2} Paper");
        System.out.println("{3} Scissors");
        
        System.out.println("Enter Player 1: ");
        int player1 = input.nextInt();
        System.out.println("Enter Player 2: ");
        int player2 = input.nextInt();
        
        if (player1 == 1 && player2 == 1){
            System.out.println("Draw");
        }
        else if (player1 == 2 && player2 == 2){
            System.out.println("Draw");
        }
        else if (player1 == 3 && player2 == 3){
            System.out.println("Draw");
        }
        
        else if(player1 == 1 && player2 == 3){
            System.out.println("Player 1 Wins");
        }
        else if (player1 == 2 && player2 == 1){
            System.out.println("Player 1 Wins");
        }
        else if (player1 == 3 && player2 == 2){
            System.out.println("Player 1 Wins");
        }
        
        else if (player1 == 3 && player2 == 1){
            System.out.println("Player 2 Wins");
        }
        else if (player1 == 1 && player2 == 2){
             System.out.println("Player 2 Wins");
        }
        else if (player1 == 2 && player2 == 3){
             System.out.println("Player 2 Wins");
        }
        
        
        
        
    }
}
