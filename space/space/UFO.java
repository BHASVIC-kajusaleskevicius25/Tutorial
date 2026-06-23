import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UFO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UFO extends Enemy
{
    /**
     * Act - do whatever the UFO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UFO(int TIMEHIT){
        setRotation(90);
        this.timeHit= TIMEHIT;
    }
    public void act()
    {
        moveEnemy();
        remove();
        
    }
}