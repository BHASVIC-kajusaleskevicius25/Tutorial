import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 24;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter(){
        setImage(new GreenfootImage("Score: " + score,50, Color.GREEN,Color.BLACK));
    }
    public void act()
    {
        YouWin();
        setImage(new GreenfootImage("Score: "+ score,50, Color.GREEN,Color.BLACK));
    }
    public void addScore(){
        score++;
    }
    public void YouWin(){
        if(score>=50){
            getWorld().addObject(new YouWin(),300,300);
            Greenfoot.stop();
        }
    }
}
