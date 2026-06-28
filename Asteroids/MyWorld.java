import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthBar = new HealthBar();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 750, 1); 
        prepare();
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealth(){
        return healthBar;
    }
    
    private void prepare()
    {
        Player player = new Player();
        addObject(player,421,380);

        addObject(counter, 70,40);

        addObject(new Rocks(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Rocks(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Rocks(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        addObject(new Rocks(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));

        addObject(healthBar,419,42);
    }
}
