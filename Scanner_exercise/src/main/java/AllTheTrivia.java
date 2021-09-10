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
public class AllTheTrivia {
    public static void main(String args[]){
        String capital, largestBird, longestRunningAnimatedShow, firstLordOfTheRings;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the capital of Texas?");
        capital = myScanner.nextLine();
        System.out.println("What is the largest bird in the world?");
        largestBird = myScanner.nextLine();
        System.out.println("What is the name of the longest running animated tv show?");
        longestRunningAnimatedShow = myScanner.nextLine();
        System.out.println("What is the name of the first Lord of the Rings film?");
        firstLordOfTheRings = myScanner.nextLine();
        System.out.println("I can't wait to visit " + longestRunningAnimatedShow + ", Texas.");
        System.out.println("If "+ largestBird + " has been on tv for so long, it must be a good show.");
        System.out.println("Oh yeah, that's right! " + firstLordOfTheRings + " is the largest bird in the world.");
        System.out.println("I always forget the first Lord of the Rings is " + capital + ".");
        
    }
}
