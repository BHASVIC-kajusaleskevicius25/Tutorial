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
    Color color;
    MyWorld world;
    public Button(Color COLOR,MyWorld WORLD){
        this.color = COLOR;
        this.world = WORLD;
        getImage().setColor(color);
        getImage().scale(20,50);
        getImage().fillRect(0,0,20,50);
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            world.color = color;
        }
    }
}
