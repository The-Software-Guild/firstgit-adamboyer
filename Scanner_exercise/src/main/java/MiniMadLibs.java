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
public class MiniMadLibs {
    public static void main(String args[]){
        String noun, adj, noun2, number, adj2, plurNoun, plurNoun2, plurNoun3, presVerb, pastVerb;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Let's play MAD LIBS!\n");
        System.out.println("I need a noun:");
        noun = myScanner.nextLine();
        System.out.println("Now an adjective:");
        adj = myScanner.nextLine();
        System.out.println("Another noun:");
        noun2 = myScanner.nextLine();
        System.out.println("And a number:");
        number = myScanner.nextLine();
        System.out.println("Another adjective:");
        adj2 = myScanner.nextLine();
        System.out.println("A plural noun:");
        plurNoun = myScanner.nextLine();
        System.out.println("Another one:");
        plurNoun2 = myScanner.nextLine();
        System.out.println("One more:");
        plurNoun3 = myScanner.nextLine();
        System.out.println("A verb (infinitive form):");
        presVerb = myScanner.nextLine();
        System.out.println("Same verb (past participle):");
        pastVerb = myScanner.nextLine();
        System.out.println("\n*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun + ": the " + adj + " frontier. These are the voyages of the starship " + noun2 + 
                ". \nIt's " + number + "-year mission: to explore strange " + adj2 + " " + plurNoun +", to seek out " + adj2 + " " +
                plurNoun2 + " and " + adj2 + " " + plurNoun3 + ", to boldly " + presVerb + " where no one has " +
                pastVerb + " before.");
    }
}
