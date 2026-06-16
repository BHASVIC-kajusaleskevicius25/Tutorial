import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mouse()
    {
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
    public void act()
    {
        moveAround();
        hitFood();
        hitTeleporter();
        
        lose();
    }
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3, getY());
            if(hitWall() == true)
            {
                setLocation(getX()-3, getY());
            }
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3);
            if(hitWall() == true)
            {
                setLocation(getX(), getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+3);
            if(hitWall() == true)
            {
                setLocation(getX(), getY()-3);
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3, getY());
            if(hitWall() == true)
            {
                setLocation(getX()+3, getY());
            }
        }
    }
    public boolean hitWall()
    {
        if(isTouching(Walls.class))
        {
           return true;
        }
        return false;
    }
    public void hitFood()
    {
        if(getOneIntersectingObject(pizza.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(pizza.class));
        }
    }
    public void hitTeleporter()
    {
        if(isTouching(Teleporter.class))
        {
            setLocation(32,525);
        }
        
    }
    public boolean hitEnemy()
    {
        if(isTouching(Enemy.class))
        {
           return true;
        }
        return false;
    }
    public void lose()
    {
        if(hitEnemy())
        {
        getWorld().addObject(new YouLose(), 400,300);
        Greenfoot.stop();
        }   
    }
}
