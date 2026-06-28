import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends AllRocks
{
    /**
     * Act - do whatever the Rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rocks(){
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
