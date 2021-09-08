
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
public class winMas {
    public static void main (String... args){
        float height, width;
        
        String sHeight, sWidth;
        
        float areaOfWindow, cost, perOfTheWindow;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter window Height:");
        sHeight = myScanner.nextLine();
        System.out.println("Please enter window Width:");
        sWidth = myScanner.nextLine();
        
        height = Float.parseFloat(sHeight);
        width = Float.parseFloat(sWidth);
        
        areaOfWindow = height * width;
        
        perOfTheWindow = 2 * (height + width);
        
        cost = ((3.50f * areaOfWindow) + (2.25f * perOfTheWindow));
        
        System.out.println("Window height = :"+ height);
        System.out.println("Window width = :" + width);
        System.out.println("Window area = :" + areaOfWindow);
        System.out.println("Window perimeter = :" + perOfTheWindow);
        System.out.println("Total cost = :" + cost);
    }
}
