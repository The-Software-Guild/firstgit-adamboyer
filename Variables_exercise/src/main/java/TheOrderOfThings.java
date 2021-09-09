/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class TheOrderOfThings {
     public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        // Writ out printouts using different orders; which one sounds best?
         System.out.println(origin + " " + opinion + " " + purpose + " " + age + " " + shape
                 + " " + color + " " +number + " " + material + " " + size + " " + noun);
         System.out.println(shape + " " + material+ " " + size + " " + purpose + " " + number
                 + " " + color + " " + origin + " " + opinion + " " + age + " " + noun);
         System.out.println("The original order definitely sounds the best!");
    }
}
