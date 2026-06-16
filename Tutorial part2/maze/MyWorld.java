import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void act()
    {
        time++;
        if(time%600==0)
        {
            addObject(new Enemy(),Greenfoot.getRandomNumber(715),Greenfoot.getRandomNumber(428));
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(715),Greenfoot.getRandomNumber(428));
        
        Enemy enemy2 = new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(715),Greenfoot.getRandomNumber(428));
        
        Enemy enemy3 = new Enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(715),Greenfoot.getRandomNumber(428));
        
        
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,694,192);
        wallHeightLong.setLocation(730,140);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,731,408);
        wallHeightLong2.setLocation(735,461);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,65,352);
        wallHeightLong3.setLocation(68,400);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,157,195);
        wallHeightLong4.setLocation(69,191);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,160,112);
        wallHeightSmall.setLocation(69,80);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,666,274);
        wallHeightSmall2.setLocation(727,272);
        wallHeightLong2.setLocation(737,415);
        wallHeightLong2.setLocation(736,447);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,604,413);
        wallHeightMedium.setLocation(602,398);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,648,313);
        wallHeightSmall3.setLocation(669,326);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,643,196);
        wallHeightLong5.setLocation(670,203);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,559,246);
        wallWidthSmall.setLocation(635,245);
        wallWidthSmall.setLocation(643,246);
        wallWidthSmall.setLocation(646,252);
        wallWidthSmall.setLocation(636,253);
        wallWidthSmall.setLocation(634,251);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,658,446);
        wallWidthSmall2.setLocation(640,450);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,640,450);
        wallWidthSmall2.setLocation(645,445);
        wallWidthSmall2.setLocation(646,451);
        wallWidthSmall2.setLocation(506,397);
        wallWidthSmall2.setLocation(497,397);
        wallWidthSmall2.setLocation(498,399);
        wallWidthSmall3.setLocation(627,446);
        wallWidthSmall3.setLocation(641,449);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,546,458);
        wallHeightMedium2.setLocation(533,446);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,673,391);
        wallWidthMedium.setLocation(670,398);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,612,497);
        wallWidthLong.setLocation(396,551);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,578,503);
        wallWidthMedium2.setLocation(594,502);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,686,494);
        wallWidthMedium3.setLocation(685,502);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,579,305);
        wallWidthMedium4.setLocation(609,299);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,545,334);
        wallHeightSmall4.setLocation(533,326);
        wallWidthMedium4.setLocation(585,303);
        wallWidthMedium4.setLocation(603,299);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,595,140);
        wallHeightMedium3.setLocation(609,162);
        wallHeightMedium3.setLocation(605,158);
        wallHeightMedium3.setLocation(601,151);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,609,70);
        wallHeightSmall5.setLocation(602,76);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,424,55);
        wallWidthLong2.setLocation(409,49);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,178,110);
        wallWidthSmall4.setLocation(165,99);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,282,135);
        wallHeightMedium4.setLocation(262,143);
        wallHeightMedium4.setLocation(264,173);
        wallHeightMedium4.setLocation(267,146);
        wallHeightMedium4.setLocation(268,150);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,300,85);
        wallHeightSmall6.setLocation(269,79);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,527,114);
        wallWidthMedium5.setLocation(540,100);
        wallWidthMedium5.setLocation(538,100);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,447,104);
        wallWidthMedium6.setLocation(456,97);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,339,138);
        wallWidthSmall5.setLocation(228,197);
        wallWidthSmall5.setLocation(231,198);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,349,145);
        wallHeightSmall7.setLocation(334,123);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,197,130);
        wallHeightSmall8.setLocation(198,125);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,318,206);
        wallHeightSmall9.setLocation(334,221);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,465,183);
        wallHeightSmall10.setLocation(472,176);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,339,511);
        wallHeightSmall11.setLocation(333,522);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,458,517);
        wallHeightMedium5.setLocation(472,498);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,410,427);
        wallHeightMedium6.setLocation(401,425);
        wallHeightMedium6.setLocation(400,394);
        wallHeightMedium6.setLocation(405,417);
        wallHeightMedium6.setLocation(403,402);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,393,474);
        wallHeightSmall12.setLocation(406,478);
        wallHeightSmall12.setLocation(399,468);
        wallHeightSmall12.setLocation(406,473);
        wallHeightSmall12.setLocation(402,474);
        wallHeightSmall12.setLocation(404,474);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,472,346);
        wallHeightSmall13.setLocation(468,325);
        WallHeightSmall wallHeightSmall14 = new WallHeightSmall();
        addObject(wallHeightSmall14,395,279);
        wallHeightSmall14.setLocation(403,279);
        WallHeightSmall wallHeightSmall15 = new WallHeightSmall();
        addObject(wallHeightSmall15,261,280);
        wallHeightSmall15.setLocation(266,279);
        WallHeightSmall wallHeightSmall16 = new WallHeightSmall();
        addObject(wallHeightSmall16,140,323);
        wallHeightSmall16.setLocation(129,329);
        WallHeightSmall wallHeightSmall17 = new WallHeightSmall();
        addObject(wallHeightSmall17,321,371);
        wallHeightSmall17.setLocation(337,379);
        WallHeightSmall wallHeightSmall18 = new WallHeightSmall();
        addObject(wallHeightSmall18,132,478);
        wallHeightSmall18.setLocation(135,475);
        WallHeightSmall wallHeightSmall19 = new WallHeightSmall();
        addObject(wallHeightSmall19,202,522);
        wallHeightSmall19.setLocation(200,531);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,229,499);
        wallWidthSmall6.setLocation(236,504);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,96,504);
        wallWidthSmall7.setLocation(106,500);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,137,399);
        wallWidthMedium7.setLocation(127,401);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,219,361);
        wallWidthMedium8.setLocation(187,352);
        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,270,350);
        wallWidthMedium9.setLocation(286,352);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,305,394);
        wallWidthSmall8.setLocation(305,406);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,96,301);
        wallWidthSmall9.setLocation(100,302);
        wallWidthSmall8.setLocation(307,407);
        wallWidthSmall8.setLocation(304,400);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,230,314);
        wallWidthSmall10.setLocation(232,299);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,192,251);
        wallWidthMedium10.setLocation(198,251);
        WallWidthMedium wallWidthMedium11 = new WallWidthMedium();
        addObject(wallWidthMedium11,327,290);
        wallWidthMedium11.setLocation(337,304);
        wallWidthMedium11.setLocation(317,299);
        wallWidthMedium11.setLocation(344,298);
        wallWidthMedium11.setLocation(336,299);
        wallHeightSmall9.setLocation(327,210);
        WallWidthMedium wallWidthMedium12 = new WallWidthMedium();
        addObject(wallWidthMedium12,327,210);
        wallWidthMedium12.setLocation(331,198);
        wallHeightSmall14.setLocation(409,252);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,409,252);
        wallHeightSmall14.setLocation(397,297);
        wallWidthSmall11.setLocation(451,248);
        wallHeightSmall14.setLocation(402,272);
        wallWidthSmall11.setLocation(436,254);
        WallWidthSmall wallWidthSmall12 = new WallWidthSmall();
        addObject(wallWidthSmall12,500,312);
        wallWidthSmall12.setLocation(502,303);
        WallWidthSmall wallWidthSmall13 = new WallWidthSmall();
        addObject(wallWidthSmall13,438,360);
        wallWidthSmall13.setLocation(436,349);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,527,211);
        wallHeightMedium7.setLocation(536,244);
        WallHeightSmall wallHeightSmall20 = new WallHeightSmall();
        addObject(wallHeightSmall20,526,175);
        wallHeightSmall20.setLocation(535,179);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,492,158);
        wallHeightMedium8.setLocation(131,198);
        WallWidthMedium wallWidthMedium13 = new WallWidthMedium();
        addObject(wallWidthMedium13,385,158);
        wallWidthMedium13.setLocation(392,152);
        WallWidthMedium wallWidthMedium14 = new WallWidthMedium();
        addObject(wallWidthMedium14,519,126);
        wallWidthMedium14.setLocation(481,150);
        wallHeightMedium8.setLocation(136,147);
        WallWidthMedium wallWidthMedium15 = new WallWidthMedium();
        addObject(wallWidthMedium15,136,147);
        WallWidthMedium wallWidthMedium16 = new WallWidthMedium();
        addObject(wallWidthMedium16,341,452);
        wallWidthMedium16.setLocation(342,453);
        WallWidthMedium wallWidthMedium17 = new WallWidthMedium();
        addObject(wallWidthMedium17,233,449);
        wallWidthMedium17.setLocation(233,449);
        wallWidthMedium17.setLocation(230,451);
        WallWidthSmall wallWidthSmall14 = new WallWidthSmall();
        addObject(wallWidthSmall14,154,437);
        wallWidthSmall14.setLocation(156,445);
        WallHeightSmall wallHeightSmall21 = new WallHeightSmall();
        addObject(wallHeightSmall21,176,220);
        wallHeightSmall21.setLocation(141,227);
        wallHeightSmall9.setLocation(332,236);
        Mouse mouse = new Mouse();
        addObject(mouse,87,517);
        mouse.setLocation(86,528);
        mouse.setLocation(89,524);
        mouse.setLocation(32,525);
        WallHeightSmall wallHeightSmall22 = new WallHeightSmall();
        addObject(wallHeightSmall22,73,578);
        wallHeightSmall22.setLocation(73,583);
        WallHeightSmall wallHeightSmall23 = new WallHeightSmall();
        addObject(wallHeightSmall23,36,48);
        wallHeightSmall23.setLocation(65,23);
        wallHeightSmall23.setLocation(68,25);
        WallHeightSmall wallHeightSmall24 = new WallHeightSmall();
        addObject(wallHeightSmall24,747,12);
        wallHeightSmall24.setLocation(730,14);
        WallHeightSmall wallHeightSmall25 = new WallHeightSmall();
        addObject(wallHeightSmall25,738,573);
        wallHeightSmall25.setLocation(736,577);
        pizza pizza = new pizza();
        addObject(pizza,102,461);
        pizza pizza2 = new pizza();
        addObject(pizza2,98,110);
        pizza pizza3 = new pizza();
        addObject(pizza3,567,70);
        pizza pizza4 = new pizza();
        addObject(pizza4,644,419);
        pizza pizza5 = new pizza();
        addObject(pizza5,326,270);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,224,276);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,701,526);
        Teleporter teleporter3 = new Teleporter();
        addObject(teleporter3,101,330);
    }
}
