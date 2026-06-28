import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int money = 100;
    int BTP = 50;
    int worldTime =0;
    
    int waveNum=1;
    
    //0= empty, 1= road, 2=0 degrees and 3=90 degrees, 4=180 degrees, 5=270 degrees
    int map [][] = {
                    {1,1,1,3,0,0,0,0,0,0},
                    {0,0,0,1,0,0,0,0,0,0},
                    {0,0,0,1,0,2,1,1,3,0},
                    {0,3,1,4,0,1,0,0,1,0},
                    {0,1,0,0,0,1,0,3,4,0},
                    {0,2,1,1,1,5,0,1,0,0},
                    {0,0,0,0,0,0,0,1,0,0},
                    {0,0,0,0,0,0,0,1,0,0},
                    {0,0,0,0,0,0,0,1,0,0},
                    {0,0,0,0,0,0,0,1,0,0}
                    };
    public MyWorld()
    {         
        super(14*60, 10*60, 60/60); 
        money = 100;
        addObject(new Menu(),750,290);
        addObject(new MoneyDisplay(),720,30);
        
        Level1();

    }
    public void act()
    {
        addInTowers();
        worldTime++;
        spawnWave();
    }

    public void Level1()
    {
        for(int j=0;j<10;j++){
            for(int i=0;i<10;i++){
                if(map[j][i]== 1)
                {
                    addObject(new Road(true),30 +(i*60),30+(j*60));
                }
                if(map[j][i]== 2)
                {
                    addObject(new Road(0),30 +(i*60),30+(j*60));
                }
                if(map[j][i]== 3)
                {
                    addObject(new Road(90),30 +(i*60),30+(j*60));
                }
                if(map[j][i]== 4)
                {
                    addObject(new Road(180),30 +(i*60),30+(j*60));
                }
                if(map[j][i]== 5)
                {
                    addObject(new Road(270),30 +(i*60),30+(j*60));
                }
            }
        }
    }
    
    public void addInTowers()
    {
        if(Greenfoot.mouseClicked(null)&& Greenfoot.getMouseInfo().getActor()==null && money>=BTP)
        {
            int X= Greenfoot.getMouseInfo().getX();
            int Y = Greenfoot.getMouseInfo().getY();
            addObject(new Tower(), (X/60) * 60 +30 , (Y/60) * 60 +30);
            money -= BTP;
        }
    }
    
    public void spawnWave()
    {
        if(worldTime% 20 ==0)
        {
            addObject(new Enemy(waveNum),2,30);
        }
        if(worldTime%400 ==399){
            waveNum++;
        }
    }
}
