/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ashly;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Ashly {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello World!");
        System.out.println("Ashly Ashly");
        
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Enter another number");
        int y = input.nextInt();
        
        int sum;
        int difference;
        int product;
        int quot;
        
        sum = x + y;
        difference = x - y;
        product = x * y;
        quot = x / y;
        
        System.out.println("Result");
        System.out.println("sum is:" + sum);
        System.out.println("difference is:" + difference);
        System.out.println("product is:" + product);
        System.out.println("quot is:" + quot);
    }
}
