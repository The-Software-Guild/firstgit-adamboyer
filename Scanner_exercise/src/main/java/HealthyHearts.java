import java.util.Scanner;
import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class HealthyHearts {
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        int userAge, maximum;
        float lowRange, highRange;
        
        System.out.println("What is your age?");
        userAge = Integer.parseInt(myScanner.next());
        maximum = 220 - userAge;
        System.out.println("Your maximum heart rate should be " + maximum + " beats per minute.");
        lowRange = (float)maximum * .5f;
        highRange = (float)maximum * .85f;
        System.out.printf("Your target HR Zone is %d - %d beats per minute",Math.round(lowRange), Math.round(highRange));
    }
}
