import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyDisplay extends Actor
{
    MyWorld game;
    public MoneyDisplay()
    {
        setImage(new GreenfootImage("Money: "+game.money,50,Color.BLACK,new Color(0,0,0,0)));
    }
    public void act()
    {
        setImage(new GreenfootImage("Money: "+game.money,50,Color.BLACK,new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            game.money+=100;
        }
    }
}
