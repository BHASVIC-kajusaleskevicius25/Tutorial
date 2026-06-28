import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world;
    String name;
    public Button(String NAME){
        this.name = NAME;
        setImage(new GreenfootImage(name + ": ", 30, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage(name + ": ", 30, Color.BLACK, Color.WHITE));
    }
}
