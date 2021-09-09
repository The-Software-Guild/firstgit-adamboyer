/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexa
 */
public class MenuOfChampions {
    public static void main(String args[]){
                String dishNameOne = "Fish Tacos";
        String dishNameTwo = "Fish Sticks";
        String dishNameThree = "Fish Soup";
        
        float dishOnePrice = 7.96f;
        float dishTwoPrice = 8.91f;
        float dishThreePrice = 1.99f;
        System.out.println("/////////////////////////////////////////");
        System.out.println("\tWelcome to Fish is All We Got");
        System.out.println("\tToday's Menu Is . . .");
        System.out.println("/////////////////////////////////////////");
        System.out.printf("$ %.2f \t%s\n",dishOnePrice, dishNameOne );
        System.out.printf("$ %.2f \t%s\n",dishTwoPrice, dishNameTwo);
        System.out.printf("$ %.2f \t%s\n",dishThreePrice, dishNameThree);        
    }
}
