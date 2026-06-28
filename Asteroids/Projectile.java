import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends SpaceActors
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile(){
    }
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        Counter counter = myWorld.getCounter();
            
        move(10);
        Actor debris = getOneIntersectingObject(Debris.class);
        Actor debris2 = getOneIntersectingObject(Debris2.class);
        Actor rocks = getOneIntersectingObject(Rocks.class);
        if(getX()==0 || getX()==getWorld().getWidth()-1 || getY()==0 || getY()==getWorld().getHeight()-1){
            getWorld().removeObject(this);
        }
        else if(rocks!=null){
            counter.addScore();
            
            getWorld().removeObject(rocks);
            getWorld().addObject(new Debris(),getX(),getY());
            getWorld().addObject(new Debris(),getX(),getY());
            getWorld().addObject(new Debris(),getX(),getY());
            getWorld().removeObject(this);
        }
        else if(debris!=null){
            counter.addScore();
            
            getWorld().removeObject(debris);
            getWorld().addObject(new Debris2(),getX(),getY());
            getWorld().addObject(new Debris2(),getX(),getY());
            getWorld().addObject(new Debris2(),getX(),getY());
            getWorld().removeObject(this);
        }
        else if(debris2!=null){
            counter.addScore();
            getWorld().removeObject(debris2);
            getWorld().removeObject(this);
        }
    }
}
