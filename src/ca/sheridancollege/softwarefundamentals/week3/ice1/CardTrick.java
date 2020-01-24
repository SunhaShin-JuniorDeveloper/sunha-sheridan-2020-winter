/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week3.ice1;
import static ca.sheridancollege.softwarefundamentals.week3.ice1.Card.SUITS;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Dancy
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];          
        for (int i=0; i<magicHand.length; i++)        
        {
            int suitIndex = (int)(Math.random()*4);
            int valueIndex = (int)(Math.random()*13+1);
            String magicSuit = SUITS[suitIndex];
            
            Card c = new Card();         
            
            //c.setValue(insert call to random number generator here)
            c.setValue(valueIndex);
            
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(magicSuit);
            
            magicHand[i] = c;
        }        
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();    
        luckyCard.setSuit("Diamonds");
        luckyCard.setValue(6);
        System.out.println("Your cards : [" +luckyCard.getSuit() + " " + luckyCard.getValue() + "]");         
        
        // and search magicHand here       
        System.out.print("Magichand: ");
        for (int i=0; i<magicHand.length; i++)
            System.out.print("[" + magicHand[i].getSuit() + " " + magicHand[i].getValue() + "] ");
        System.out.println("");
        
        // Then report the result here
        boolean youwin = false;
        for(int i=0; i<magicHand.length; i++) {
            if(luckyCard.getSuit() == magicHand[i].getSuit() && 
               luckyCard.getValue() == magicHand[i].getValue() ){                
                System.out.println("Result : You Win");
                youwin = true;
                break;
                }
            }        
        if(youwin == false){
                System.out.println("Result : You lose");
            }
        
    }
}
