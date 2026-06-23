import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int timeHit=1;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
    }
    public void act()
    {
        moveEnemy();
    }
    public void moveEnemy()
    {
        setLocation(getX(),getY()+3);
    }
    public void remove(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(getY()>=597){
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.LoseHealth();
             
            getWorld().removeObject(this);
        }
        
        else if(projectile!=null)
        {
            getWorld().removeObject(projectile);
            timeHit--;
        }
        if(timeHit==0){
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            
            getWorld().removeObject(this);
        }
    }
}
