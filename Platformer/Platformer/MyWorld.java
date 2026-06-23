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
        super(1000, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,155,711);
        ground.setLocation(111,760);
        Ground ground2 = new Ground();
        addObject(ground2,423,734);
        ground2.setLocation(357,623);
        Ground ground3 = new Ground();
        addObject(ground3,579,718);
        ground3.setLocation(627,717);
        Ground ground4 = new Ground();
        addObject(ground4,847,661);
        ground4.setLocation(826,581);
        Ground ground5 = new Ground();
        addObject(ground5,549,486);
        ground5.setLocation(581,498);
        Ground ground6 = new Ground();
        addObject(ground6,101,514);
        ground6.setLocation(105,516);
        Cloud cloud = new Cloud();
        addObject(cloud,934,85);
        cloud.setLocation(869,77);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,722,173);
        cloud2.setLocation(658,212);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,432,77);
        cloud3.setLocation(548,57);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,447,272);
        cloud4.setLocation(276,248);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,158,89);
        cloud5.setLocation(115,64);
        Player player = new Player();
        addObject(player,120,693);
        player.setLocation(120,705);
        ground2.setLocation(364,622);
        ground2.setLocation(354,653);
        ground2.setLocation(369,693);
        ground6.setLocation(197,594);
        ground3.setLocation(593,751);
        ground4.setLocation(734,617);
        ground4.setLocation(778,690);
        ground5.setLocation(983,587);
        Ground ground7 = new Ground();
        addObject(ground7,657,491);
        ground7.setLocation(706,541);
        ground6.setLocation(222,582);
        Ground ground8 = new Ground();
        addObject(ground8,460,482);
        ground8.setLocation(416,452);
        ground2.setLocation(306,707);
        ground6.setLocation(202,582);
    }
}
