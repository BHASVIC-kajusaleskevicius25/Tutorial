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
    Counter counter = new Counter();
    HealthBar healthbar = new HealthBar();
    boolean bosslevel = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    public void act(){
            addUFO();
            addBomb();
            Boss();
    }
    public void addUFO(){
        if(Greenfoot.getRandomNumber(120)<1){
            addObject(new UFO(1), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void addBomb(){
        if(Greenfoot.getRandomNumber(160)<1){
            addObject(new Bomb(2), Greenfoot.getRandomNumber(600), 0);
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
        addObject(counter,70,20);
        addObject(healthbar,220,20);
    }
    public Counter getCounter() {
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    public void Boss(){
        if(counter.score==25 || counter.score ==26){
            if(bosslevel==false){
                addObject(new Boss(30), 300,0);
                bosslevel= true;
            }
        }
    }
}
