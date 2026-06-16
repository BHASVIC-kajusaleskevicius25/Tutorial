import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Player(){
        setRotation(270);
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    
    public void moveAround(){
        
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+7, getY());
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-7, getY());
        }
    }
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Projectile(),getX(),getY()-32);
        }
    }
}
