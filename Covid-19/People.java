import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class People extends Actor
{
    public boolean infected = false;
    public boolean recovered = false;
    int recoveryTime = 0;
    int infectRadius = 60;
    
    MyWorld world;
    
    public People()
    {
        getImage().scale(30,30);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void act()
    {
       edge();
       socialDistance(world.SocialDistance);
       movement();
       ContactVirus();
       if(world.mask){
           infectRadius=5;
           getImage().setColor(Color.WHITE);
           getImage().fillOval(14,5,6,4);
       }
       else{
           infectRadius=60;
           getImage().setColor(Color.BLACK);
           getImage().fillOval(14,5,6,4);
       }
    }
    
    public void ContactVirus()
    {
        List<People> peoples = getObjectsInRange(infectRadius,People.class);
        for(People persons : peoples)
        {
            if(persons.infected && recovered == false && infected == false){
                infect();
            }
        }
        if(infected)
        {
            recoveryTime++;
            if(recoveryTime==200 && infected == true){
                recover();
                infected = false;
                recovered = true;
            }
        }
    }
    public void socialDistance(boolean enabled)
    {
        if(enabled){
           List<People> peoples = getObjectsInRange(120,People.class);
            for(People persons : peoples)
            {
                turn(Greenfoot.getRandomNumber(90)-45);
            } 
        }
    }
    
    private void movement()
    {
        move(4);
        turn(Greenfoot.getRandomNumber(20)-10);
    }
    private void edge()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }
    
    public void infect()
    {
        getImage().setColor(Color.RED);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        world.numInfected++;
        infected = true;
    }
    public void recover()
    {
        getImage().setColor(Color.GREEN);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        recovered = true;
        world.numInfected--;
        world.numRecovered++;
    }
}
