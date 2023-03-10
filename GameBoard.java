import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * @author Isaac 
 * @version V 1.0
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 27;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        Dealer dealer = new Dealer(NUM_CARDS_IN_DECK);
        addObject(dealer,-30, -30);
        Player player = new Player(dealer);
        addObject(player, -30, -30);
    }
    
    
    
}
