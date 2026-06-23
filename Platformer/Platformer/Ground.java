import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground extends Actor
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ground(){
        getImage().scale(getImage().getWidth()*6,getImage().getHeight());
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("a")){
            move(5);
        }
        
        if(getX()<=0){
            setLocation(998,getY());
        }
        if(getX()==999){
            setLocation(1,getY());
        }
    }
}
