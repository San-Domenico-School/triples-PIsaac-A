import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dealer extends Actor
{
    private Deck deck;
    
    private int triplesRemaining;
    
    public Dealer(int numCardsInDeck)
    {
        deck = new Deck(numCardsInDeck);
        triplesRemaining = numCardsInDeck / 3;
        Scorekeeper.setDeckSize(numCardsInDeck);
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
    }
    
    protected void dealBoard()
    {
            for(int row = 0; row < 5; row++)
            {
                for(int column = 0; column < 3; column++)
                {
                    getWorld().addObject(deck.getTopCard(), (133 * column) + 83, 
                                            75 * row + 80);
                }
            }
    }
    
    private void setUT()
    {
        String cardsRemainingText = new Integer(triplesRemaining * 3).toString();
        String scoreText = new Integer(Scorekeeper.getScore()).toString();
        getWorld().showText(cardsRemainingText, 310, 470);
        getWorld().showText(scoreText, 310, 504); 
    }
    
    protected void checkIfEndGame()
    {
        //TBI
    }
    
    protected void checkIfTriple(ArrayList<Card> cardsOnBoard, Card[] cardsSelected, 
                                 ArrayList<Integer> selectedCardsIndex)
    {
        if(
            (cardsSelected[0].getColor().ordinal() + 
            cardsSelected[1].getColor().ordinal() + 
            cardsSelected[2].getColor().ordinal()) % 3 == 0)
        {
            if((cardsSelected[0].getShape().ordinal() + 
            cardsSelected[1].getShape().ordinal() + 
            cardsSelected[2].getShape().ordinal()) % 3 == 0)
            {
                System.out.println("test");
            }
        }
    }
    
    private void removeAndReplaceTriple(ArrayList<Card> cardsOnBoard, Card[] cardsSelected, 
                                         ArrayList<Integer> selectedCardsIndex)
    {
        //TBI
    }
    
    
}
