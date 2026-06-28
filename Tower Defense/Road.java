import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
    public int turn=0;
    public boolean straight = false;
    public Road(boolean STRAIGHT){
        this.straight = STRAIGHT;
        getImage().scale(60,60);
    }
    public Road(int TURN){
        this.turn = TURN;
        getImage().scale(60,60);
    }
    public void act()
    {
        // Add your action code here.
    }
}
