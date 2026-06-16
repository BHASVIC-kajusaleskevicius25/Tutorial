import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        MouseInfo info = Greenfoot.getMouseInfo();
    }
    public void act()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        int direction = Greenfoot.getRandomNumber(360);
        if(Greenfoot.isKeyDown("g")){
            addObject(new tracking(), 300,200);            
        }
        if(Greenfoot.mouseClicked(null)){
            
            addObject(new Animals(direction),info.getX(),info.getY());
        }
    }
}
