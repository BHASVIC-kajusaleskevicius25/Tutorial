import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Enemy extends Actor
{
    public int health = 5;
    MyWorld game;
    
    public Enemy(int level)
    {
        if(level==1)
        {
            setImage("spider.png");
        }
        if(level==2){
            setImage("snake2.png");
        }
    }
    public void act()
    {
        move(2);
        turn();
        hit();
    }
    
    public void turn()
    {
        List<Road> road0=getObjectsAtOffset(0, -30, Road.class);
        for(Road roads: road0)
        {
            if(roads.straight==false && getRotation()==90)
            {
                setRotation(roads.turn);
            }
        }
        
        List<Road> road90=getObjectsAtOffset(-30, 0, Road.class);
        for(Road roads: road90)
        {
            if(roads.straight==false && getRotation()==0)
            {
                setRotation(roads.turn);
            }
        }
        
        List<Road> road180=getObjectsAtOffset(0, 30, Road.class);
        for(Road roads: road180)
        {
            if(roads.straight==false && getRotation()==270)
            {
                setRotation(roads.turn);
            }
        }
        
        List<Road> road270=getObjectsAtOffset(30, 0, Road.class);
        for(Road roads: road270)
        {
            if(roads.straight==false && getRotation()==180)
            {
                setRotation(roads.turn);
            }
        }
        
    }
    
    public void hit(){
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if(projectile!=null)
        {
            health--;
            getWorld().removeObject(projectile);
        }
        if(health<1)
        {
            game.money+=50;
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
