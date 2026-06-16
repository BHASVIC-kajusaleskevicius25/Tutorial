import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tracking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tracking extends Actor
{
    int count = 0;
    /**
     * Act - do whatever the tracking wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info != null){
            setLocation(info.getX(),info.getY());
        }
    }
}
