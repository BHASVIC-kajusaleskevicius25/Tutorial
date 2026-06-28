import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    private int health = 10;
    private int healthBarWidth = 200;
    private int healthBarHeight = 20;
    private int pixelsPerHealthPoint = healthBarWidth/health;
    
    public HealthBar()
    {
        update();
    }
    
    public void act()
    {
        update();
        if(health<=0){
            getWorld().addObject(new YouLose(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        }
    }
    
    public void lowerHealth()
    {
        this.health--;
    }
    private void update()
    {
        setImage(new GreenfootImage(healthBarWidth+2,healthBarHeight+2));
        getImage().setColor(Color.WHITE);
        getImage().drawRect(0,0, healthBarWidth+1,healthBarHeight+1);
        getImage().setColor(Color.RED);
        getImage().fillRect(1,1,pixelsPerHealthPoint * health, healthBarHeight);
    }
}
