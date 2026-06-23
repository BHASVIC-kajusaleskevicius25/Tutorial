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
    
    private int playerHeight = getImage().getHeight()/2;
    private int playerWidth = getImage().getWidth()/2;
    public void act()
    {
        moveAround();
        moveBelow();
        moveSide();
        checkFalling();
        
    }
    public void moveAround(){//movement keys for the user
        if(Greenfoot.isKeyDown("space")&& onGround()==true){
            vSpeed=jumpHeight;
            fall();
        }
    }
    
    private void moveBelow(){//stops player from going through the ceiling
        if(hitCeiling()==true){
            vSpeed=1;
        }
    }
    private boolean hitCeiling(){//checks if player in hitting the ceiling
        Actor above = getOneObjectAtOffset(0,-playerHeight,Ground.class);
        return above != null;
    }
    
    //These 2 methods check if the player is standing on a platform.
    private boolean onGround(){
        Actor under = getOneObjectAtOffset(0,playerHeight,Ground.class);
        return under != null;
    }
    private void checkFalling()//checks if player is in the air
    {
        if(onGround()==false){
            fall();
        }
    }
    
    
    private int hittingSide(){//checks if hitting the side of an platform
        Actor sideR = getOneObjectAtOffset(playerWidth,0,Ground.class);
        Actor sideL = getOneObjectAtOffset(-playerWidth,0,Ground.class);
        if(sideR!=null){
            return 1;
        }
        if(sideL!=null){
            return 2;
        }
        else{
            return 0;
        }
    }
    private void moveSide(){//moves player out the way
        if(hittingSide()==1){
            setLocation(getX()-6,getY());
        }
        if(hittingSide()==2){
            setLocation(getX()+6,getY());          
        }
    }
    
    //this method just makes the player fall
        private void fall(){
        setLocation(getX(),getY()+vSpeed);
        vSpeed= vSpeed+acceleration;
        if(onGround()==true){
            vSpeed=0;
        }
    }
}
