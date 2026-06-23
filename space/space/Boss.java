import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemy
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Boss(int TIMEHIT){
        setRotation(90);
        this.timeHit= TIMEHIT;
    }
    public void act()
    {
        moveEnemy();
        remove();
    }
    public void moveEnemy()
    {
        setLocation(getX(),getY()+1);
    }
    
    public void remove(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(getY()>=597){
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            HealthBar healthbar = myWorld.getHealthBar();
            healthbar.LoseHealth();
            healthbar.LoseHealth();
            healthbar.LoseHealth();
            healthbar.LoseHealth();
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
            counter.addScore();
            counter.addScore();
            counter.addScore();
            counter.addScore();
            
            getWorld().removeObject(this);
        }
    }
    
}
