import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void act(){
            addUFO();
            addBomb();
    }
    public void addUFO(){
        if(Greenfoot.getRandomNumber(120)<1){
            addObject(new UFO(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addBomb(){
        if(Greenfoot.getRandomNumber(160)<1){
            addObject(new Bomb(), Greenfoot.getRandomNumber(600), 0);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,288,534);
    }
}
