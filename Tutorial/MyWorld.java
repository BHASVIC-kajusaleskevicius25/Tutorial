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
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,481,322);
        Bee bee = new Bee();
        addObject(bee,20,20);
        Bee bee1 = new Bee();
        addObject(bee1,20,322);
        Bee bee2 = new Bee();
        addObject(bee2,20,580);
        bee2.setLocation(97,234);
        bee.setLocation(48,53);
        player.setLocation(435,360);
        bee2.setLocation(66,517);
        bee2.setLocation(60,453);
        bee.setLocation(159,403);
        bee2.setLocation(189,507);
        bee.setLocation(113,406);
        player.setLocation(350,198);
        Bee bee4 = new Bee();
        addObject(bee4,366,441);
        Bee bee5 = new Bee();
        addObject(bee5,464,536);
        Bee bee6 = new Bee();
        addObject(bee6,681,395);
        Bee bee7 = new Bee();
        addObject(bee7,712,509);
        bee6.setLocation(632,426);
        bee4.setLocation(336,435);
        bee5.setLocation(429,558);
        bee4.setLocation(374,408);
        bee6.setLocation(542,453);
        bee6.setLocation(569,428);
        bee4.setLocation(400,361);
        bee5.setLocation(440,556);
        removeObject(bee5);
    }
}
