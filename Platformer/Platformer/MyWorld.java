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
    
    public void act(){
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Tree tree = new Tree();
        addObject(tree,731,513);
        Tree tree2 = new Tree();
        addObject(tree2,860,587);
        Tree tree3 = new Tree();
        addObject(tree3,621,660);
        Tree tree4 = new Tree();
        addObject(tree4,444,530);
        Tree tree5 = new Tree();
        addObject(tree5,556,577);
        Tree tree6 = new Tree();
        addObject(tree6,417,645);
        Tree tree7 = new Tree();
        addObject(tree7,327,596);
        Tree tree8 = new Tree();
        addObject(tree8,165,531);
        Tree tree9 = new Tree();
        addObject(tree9,162,637);
        Tree tree10 = new Tree();
        addObject(tree10,69,581);
        Tree tree11 = new Tree();
        addObject(tree11,89,701);
        Tree tree12 = new Tree();
        addObject(tree12,244,676);
        Tree tree13 = new Tree();
        addObject(tree13,288,547);
        Tree tree14 = new Tree();
        addObject(tree14,486,723);
        Tree tree15 = new Tree();
        addObject(tree15,505,653);
        Tree tree16 = new Tree();
        addObject(tree16,646,589);
        Tree tree17 = new Tree();
        addObject(tree17,718,692);
        Tree tree18 = new Tree();
        addObject(tree18,777,616);
        Tree tree19 = new Tree();
        addObject(tree19,853,711);
        Tree tree20 = new Tree();
        addObject(tree20,941,669);
        Tree tree21 = new Tree();
        addObject(tree21,985,611);
        Tree tree22 = new Tree();
        addObject(tree22,974,543);
        Tree tree23 = new Tree();
        addObject(tree23,915,529);
        Tree tree24 = new Tree();
        addObject(tree24,844,493);
        Tree tree25 = new Tree();
        addObject(tree25,634,502);
        Cloud cloud = new Cloud();
        addObject(cloud,874,298);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,660,362);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,500,210);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,361,433);
        cloud4.setLocation(357,414);
        Cloud cloud5 = new Cloud();
        addObject(cloud5,153,275);
        Ground ground = new Ground();
        addObject(ground,98,662);
        ground.setLocation(130,711);
        Ground ground2 = new Ground();
        addObject(ground2,371,642);
        ground2.setLocation(351,650);
        ground.setLocation(166,758);
        ground2.setLocation(316,669);
        Ground ground3 = new Ground();
        addObject(ground3,551,675);
        ground3.setLocation(561,714);
        cloud3.setLocation(527,74);
        cloud2.setLocation(662,179);
        cloud.setLocation(856,123);
        cloud4.setLocation(491,265);
        cloud5.setLocation(149,138);
        Cloud cloud6 = new Cloud();
        addObject(cloud6,281,239);
        cloud6.setLocation(311,216);
        cloud5.setLocation(99,130);
        cloud6.setLocation(306,99);
        cloud4.setLocation(448,278);
        tree20.setLocation(905,655);
        Ground ground4 = new Ground();
        addObject(ground4,791,582);
        ground4.setLocation(799,635);
        Ground ground5 = new Ground();
        addObject(ground5,543,529);
        tree8.setLocation(180,553);
        Ground ground6 = new Ground();
        addObject(ground6,180,553);
        Ground ground7 = new Ground();
        addObject(ground7,894,437);
        tree18.setLocation(801,623);
        tree18.setLocation(855,658);
        Player player = new Player();
        addObject(player,558,655);
        Ground ground8 = new Ground();
        addObject(ground8,159,434);
        ground8.setLocation(368,447);
        ground8.setLocation(319,454);
        ground8.setLocation(352,456);
        Ground ground9 = new Ground();
        addObject(ground9,32,648);
    }
}
