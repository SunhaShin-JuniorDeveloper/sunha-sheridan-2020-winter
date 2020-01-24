/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;
import static ca.sheridancollege.softwarefundamentals.week3.ice1.Card.SUITS;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sunha Shin
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];                
        
        int suitIndex;
        int valueIndex;      
        String magicSuit;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("** Enter a suit");
        String userSuit = sc.nextLine();
        System.out.println("   Enter a value **");
        int userValue = sc.nextInt();
        boolean result = false;
        
        System.out.println("** Magic hand just pick card **");        
        for (int i=0; i<magicHand.length; i++)        
        {
            Card c = new Card();     
            suitIndex = (int)(Math.random()*4);
            valueIndex = (int)(Math.random()*2);
            magicSuit = SUITS[suitIndex];
            c.setSuit(magicSuit);
            c.setValue(valueIndex);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            if(userSuit.equals(magicSuit) && userValue == valueIndex){     
                result = true;
                System.out.println("\nYou win");                
                break;
            }
        }        
        System.out.println();  
        
        if(result == false){
            System.out.println("You lose");
        }        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
