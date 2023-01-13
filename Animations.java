import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Makes the cards make sound
 * 
 * @author Isaac Archer 
 * @version 0.1
 */
public class Animations  
{
    public static void wobble(Card card[])
    {
        Greenfoot.playSound("wobble.wav");
    }
    
    public static void slideAndTurn(Card card[])
    {
        Greenfoot.playSound("swoosh.wav");
    }
}
