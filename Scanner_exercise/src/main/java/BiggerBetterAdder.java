import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class BiggerBetterAdder {
    public static void main(String args[]){
        int firstNumber, secondNumber;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the first number to add:");
        firstNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("Please enter the second number to add:");
        secondNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("The result of " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}
