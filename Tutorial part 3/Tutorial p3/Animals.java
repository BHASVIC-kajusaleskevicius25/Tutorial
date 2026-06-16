import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animals extends Actor
{
    int imageNumber;
    public Animals(int direction)
    {
        setRotation(direction);
        imageNumber = 0;
    }
    public void act()
    {
        move(4);
        if(getX()>598)
        {
            turn(150);
            changeImage();
        }
        if(getX()<2)
        {
            turn(150);
            changeImage();
        }
        if(getY()>398)
        {
            turn(150);
            changeImage();
        }
        if(getY()<3)
        {
            turn(150);
            changeImage();
        }
    }
    
    public void changeImage()
    {
        imageNumber++;
        if(imageNumber==1){
            setImage("dolphin.png");
        }
        if(imageNumber==1){
            setImage("dolphin.png");
        }
        if(imageNumber==2){
            setImage("ant.png");
        }
        if(imageNumber==3){
            setImage("bee.png");
        }
        if(imageNumber==4){
            setImage("fish1.png");
        }
        if(imageNumber==5){
            imageNumber=0;
            setImage("alligator.png");
        }
    }
}
