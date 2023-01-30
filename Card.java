import greenfoot.*; 

/**
 * The Cards which can be selected and matched to create triples.
 * 
 * @author Isaac Archer
 * @version 0.1
 */
public class Card extends Actor
{
    public enum Shape
    {
        TRIANGLE, SQUARE, CIRCLE, NO_SHAPE
    }
    
    public enum Color
    {
        RED, GREEN, BLUE, NO_COLOR
    }
    
    private Shape shape;
    
    private Color color;
    
    private boolean isSelected;
    
    private GreenfootImage cardImage, selectedCardImage;
    
    private int numberOfShapes, shading;

    public Card(Shape shape, Color color, int numberOfShapes, 
                int shading, GreenfootImage cardImage, 
                GreenfootImage selectedCardImage)
    {
        this.shape = shape;
        this.color = color;
        this.numberOfShapes = numberOfShapes;
        this.shading = shading;
        this.cardImage = cardImage;
        this.selectedCardImage = selectedCardImage;
        setImage(cardImage);
    }
    
    public Shape getShape()
    {
        return shape;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getNumberOfShapes()
    {
        return numberOfShapes;
    }
    
    public int getShading()
    {
        return shading;
    }
    
    public GreenfootImage getCardImage()
    {
        return cardImage;
    }
    
    public GreenfootImage getSelectedCardImage()
    {
        return selectedCardImage;
    }
    
    public boolean getIsSelected()
    {
        return isSelected;
    }
    
    public void setIsSelected(boolean isSelected)
    {
        this.isSelected = isSelected;
    }
    
    
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
}


