import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score= 0;
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score,40, Color.BLUE, Color.WHITE));
    }
    
    public void act()
    {
        setImage(new GreenfootImage("Score: " + score,40, Color.BLUE, Color.WHITE));
        YouWin();
    }
    
    
    public void addScore(){
        score++;
    }
    public void YouWin(){
        if(score ==28){
            getWorld().addObject(new YouWin(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }
}
