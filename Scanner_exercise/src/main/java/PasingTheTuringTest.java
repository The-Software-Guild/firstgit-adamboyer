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
public class PasingTheTuringTest {
    public static void main(String args[]){
        String userName, favoriteFruit, favoriteColor;
        int favoriteNumber;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello human! What is your name?");
        userName = myScanner.nextLine();
        System.out.printf("Nice to meet your %s. My name is Nano.\n", userName);
        System.out.println("What is your favorite color?");
        favoriteColor = myScanner.nextLine();
        System.out.println(favoriteColor +" is cool! My favorite color is purple.");
        System.out.println("I really like pineapples, whats your favaorite fruit?");
        favoriteFruit = myScanner.nextLine();
        System.out.println(favoriteFruit + "!? Thats a good choice");
        System.out.println("Okay, stop me if you're getting annoyed, but what's your favorite number? Mine is 75!");
        favoriteNumber = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("Wow! 75" + " + " + favoriteNumber+" = " +(favoriteNumber + 75)+" which is my second favorite number. Maybe we are destined to be friends!");
        System.out.printf("Welp, gotta go. See ya later %s\n", userName);
    }
}
