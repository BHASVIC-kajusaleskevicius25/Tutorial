import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends AllRocks
{
    public Debris(){
        getImage().scale(getImage().getWidth()/2 ,getImage().getHeight()/2 ); 
        this.xSpeed = Greenfoot.getRandomNumber(5)+2;
        this.ySpeed = Greenfoot.getRandomNumber(5)+2;
        if(Greenfoot.getRandomNumber(2)==1){
            xSpeed= -xSpeed;
        }
        if(Greenfoot.getRandomNumber(2)==1){
            ySpeed= -ySpeed;
        }
    }
    public void act()
    {
        wrapAtEdge();
        setLocation(getX()+xSpeed, getY()+ySpeed);
    }
}
