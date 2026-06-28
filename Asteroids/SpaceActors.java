import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceActors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceActors extends Actor
{
    int xSpeed = 0;
    int ySpeed = 0;
    public void act()
    {
        
    }
    
    public void wrapAtEdge()
    {
        if(getX()==0){
            setLocation(getWorld().getWidth()-2, getY());
        }
        if(getX()==getWorld().getWidth()-1){
            setLocation(0, getY());
        }
        if(getY()==0){
            setLocation(getX(), getWorld().getHeight()-2);
        }
        if(getY()==getWorld().getHeight()-1){
            setLocation(getX(), 0);
        }
    }
    public void Bounce(){
        if(getX()==0){
            xSpeed = -xSpeed;
        }
        if(getX()==getWorld().getWidth()-1){
            xSpeed = -xSpeed;
        }
        if(getY()==0){
            ySpeed = -ySpeed;
        }
        if(getY()==getWorld().getHeight()-1){
            ySpeed = -ySpeed;
        }
    }
}
