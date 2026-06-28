import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Days here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Days extends Actor
{
    MyWorld world;
    public Days(MyWorld WORLD){
        this.world = WORLD;
        
        getImage().scale(100,100);
        getImage().clear();
        
        //getImage().setColor(Color.BLACK);
        //getImage().fill();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getImage().setColor(world.color);
            getImage().fillRect(1,1,99,99);
        }
    }
}
