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
public class DoItBetter {
    public static void main(String args[]){
        int miles, hotDogs, languages;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How miles can you run?");
        miles = Integer.parseInt(myScanner.nextLine());
        System.out.println("That's it! I can run "+ ((miles*2)+1) + " in my sleep.");
        System.out.println("What about hot dogs? How many can you eat?");
        hotDogs = Integer.parseInt(myScanner.nextLine());
        System.out.println("You're not even on my level. I can eat " + ((hotDogs*2)+1) + " hotdogs.");
        System.out.println("Maybe you're more of a linguist than me. How many languages do you speak?");
        languages = Integer.parseInt(myScanner.nextLine());
        System.out.println("Nope, sorry bud. Got you beat there too. I speak " + ((languages * 2) + 1) + " languages.");
    }
    
}
