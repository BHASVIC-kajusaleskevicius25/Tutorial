import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int vSpeed=0;
    private int acceleration = 1;
    private int jumpHeight = -15;
    public void act()
    {
        moveAround();
        checkFalling();
        
    }
    public void moveAround(){
        
        if(Greenfoot.isKeyDown("d")){
            move(4);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("space")&& onGround()==true){
            vSpeed=jumpHeight;
            fall();
        }
    }
    private void moveBelow(){
        if(hitCeiling()==true){
            setLocation(getX(),getY()-2);
        }
    }
    private boolean hitCeiling(){
        Actor inside = getOneIntersectingObject(Ground.class);
        return inside != null;
    }
    private void fall(){
        setLocation(getX(),getY()+vSpeed);
        vSpeed= vSpeed+acceleration;
        if(onGround()==true){
            vSpeed=0;
        }
    }
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Ground.class);
        Actor under1 = getOneObjectAtOffset(getImage().getWidth()/2,getImage().getHeight()/2,Ground.class);
        Actor under2 = getOneObjectAtOffset(getImage().getWidth()/(-2),getImage().getHeight()/2,Ground.class);
        if(under != null){
            return true;
        }
        if(under1 != null){
            return true;
        }
        if(under2 != null){
            return true;
        }
        else{
            return false;
        }
    }
    private void checkFalling()
    {
        if(onGround()==false){
            fall();
        }
    }
}
