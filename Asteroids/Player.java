import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SpaceActors
{
    boolean fired = false;
    boolean hitRock = false;
    public Player(){
        getImage().scale(getImage().getWidth()/2 ,getImage().getHeight()/2 ); 
    }
    public void act()
    {
        Bounce();
        hitRocks();
        turnCommand();
        fire();
        accelerate();
        setLocation(getX()+xSpeed/4, getY()+ySpeed/4);
        
    }
    
    private void hitRocks()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        HealthBar healthBar = myWorld.getHealth();
        if(isTouching(AllRocks.class) && hitRock == false)
        {
            healthBar.lowerHealth();
            hitRock = true;
        }
        else if(!isTouching(AllRocks.class)){
            hitRock = false;
        }
    }
    
    private void turnCommand()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
        }
    }
    private void accelerate()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(getRotation()==0 && xSpeed!=12){
                xSpeed= xSpeed + 1;
            }
            if(getRotation()==90 && ySpeed!=12){
                ySpeed= ySpeed + 1;
            }
            if(getRotation()==270 && ySpeed!=-12){
                ySpeed= ySpeed - 1;
            }
            if(getRotation()==180 && xSpeed!=-12){
                xSpeed= xSpeed - 1;
            }
            
        }
    }
    private void fire(){
        if(Greenfoot.isKeyDown("f")&&fired==false)
        {
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(),getY());
            projectile.setRotation(getRotation());
            fired=true;
        }
        if(!Greenfoot.isKeyDown("f")){
            fired=false;
        }
    }
}
