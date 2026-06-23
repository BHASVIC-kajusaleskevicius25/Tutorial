import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cloud(){
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("a")){
            move(1);
        }
        if(getX()<=0){
            setLocation(998,Greenfoot.getRandomNumber(240)+10);
        }
        if(getX()==999){
            setLocation(1,Greenfoot.getRandomNumber(240)+10);
        }
    }
}
