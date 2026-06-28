import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   
    int width = getWidth();
    int height = getHeight();
    
    public static int population =0;
    Button popButton = new Button("Population");
    
    public static int numInfected =0;    
    Button InfectedButton = new Button("Infected");
    
    public static int numRecovered =0;
    Button RecoveredButton = new Button("Recovered");
    
    public static int numVulnerable =0;
    Button VulnerableButton = new Button("Vulnerable");
    
    public static boolean SocialDistance =false;
    Button SocialDistanceButton = new Button("SocialDistance");
    
    public static boolean mask =false;
    Button maskButton = new Button("mask");
    
    String input;
    public MyWorld()
    {    
       
        super(1600, 800, 1); 
        numRecovered =0;
        numInfected =0;
        population =0;
        
        addObject(popButton,100,50);
        showText(""+population,200,50);
        
        addObject(InfectedButton,100,100);
        showText(""+numInfected,170,100);
        
        addObject(RecoveredButton,100,150);
        showText(""+numRecovered,185,150);
        
        addObject(VulnerableButton,100,200);
        showText(""+numVulnerable,185,200);
        
        addObject(SocialDistanceButton,100,250);
        showText(""+SocialDistance,215,250);
        
        addObject(maskButton,100,300);
        showText(""+mask,165,300);
        
        setPaintOrder(Button.class,People.class);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(popButton))
        {
            input = JOptionPane.showInputDialog("How many people in world?");
            populate(Integer.parseInt(input));
        }
        
        if(Greenfoot.mouseClicked(SocialDistanceButton))
        {
            SocialDistance = !SocialDistance;
        }
        if(Greenfoot.mouseClicked(maskButton))
        {
            mask = !mask;
        }
        
        showText(""+population,200,50);
        showText(""+numInfected,170,100);
        showText(""+numRecovered,185,150);
        
        numVulnerable=population-(numInfected+numRecovered);
        showText(""+numVulnerable,185,200);
        
        showText(""+SocialDistance,215,250);
        showText(""+mask,165,300);
    }
    
    private void populate(int POPULATION)
    {
        this.population = POPULATION;
        for(int i=0; i<population;i++){
            int X = Greenfoot.getRandomNumber(width);
            int Y = Greenfoot.getRandomNumber(height);
            addObject(new People(), X,Y);
        }
    }
}
