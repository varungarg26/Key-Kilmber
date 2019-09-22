/* Key Kilmber
 * Varun Garg
 * June 15, 2018
 * This program is a game similar to Snakes and Ladders
 */
import greenfoot.*;
import javax.swing.*;

public class GameBoard extends World
{
    
    /* Since the code is really long and repetitive. In the shortest form possible, the program checks the game piece's position relative to the die roll, and moves the number of spaces 
       according to the die roll. If the game piece needs to move up, according to the location of the game piece at the time, the game piece will move a certain number of units
       right or left, and then up and down.*/
    private DiceRoll dice = new DiceRoll();
    private DiceRoll2 dice2 = new DiceRoll2();
    private DiceRoll3 dice3 = new DiceRoll3();
    private DiceRoll4 dice4 = new DiceRoll4();
    private DiceRoll5 dice5 = new DiceRoll5();
    Hippo p1 = new Hippo();
    Wombat p2 = new Wombat();
    Pelican p3 = new Pelican();
    Fish p4 = new Fish();
    Spider p5 = new Spider();
    
    int[][] gridPositionX = {{350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250},
                             {350, 450, 550, 650, 750, 850, 950, 1050, 1150, 1250}};
                             
    int[] gridPositionY = {80, 180, 280, 380, 480, 580, 680, 780, 880, 980};
    
    public GameBoard()
    {    
       super(1350, 1050, 1);
      
       addObject(new Start_Button(), 215, 200);
         
        addObject(new PlayerOne(), 85, 350);
        addObject(p1, 200, 350);
         
        addObject(new PlayerTwo(), 85, 430);
        addObject(p2, 200, 430);
         
        addObject(new PlayerThree(), 85, 510);
        addObject(p3, 200, 510);
         
        addObject(new PlayerFour(), 85, 590);
        addObject(p4, 200, 590);
         
        addObject(new PlayerFive(), 85, 670);
        addObject(p5, 200, 670);
         
        addObject(new Welcome(), 150, 65);
         
        addObject(new ClickHere(), 94, 200);
        
        addObject(new RollDie(), 110, 750);
         
        addObject(new Start(), 228, 930);
        
        addObject(new P1(), 40, 800);
        addObject(dice, 90, 800);
        
        addObject(new P2(), 40, 845);
        addObject(dice2, 90, 845);
        
        addObject(new P3(), 40, 890);
        addObject(dice3, 90, 890);
        
        addObject(new P4(), 150, 800);
        addObject(dice4, 200, 800);
        
        addObject(new P5(), 150, 845);
        addObject(dice5, 200, 845);
    }
   /* public void //playerChange()
    {
       JOptionPane.showMessageDialog(new JInternalFrame(), "Next player, please roll the die", "Next Player", JOptionPane.INFORMATION_MESSAGE);
    }*/
    public void act()
    {
        if(Greenfoot.mouseClicked(dice))
        {
          int rollValue = dice.roll();
          int pixels = rollValue*100;
          JOptionPane.showMessageDialog(new JInternalFrame(), "You have rolled a: " + rollValue,"Dice Roll", JOptionPane.INFORMATION_MESSAGE);
          if (rollValue == 1)
          {
            if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                  p1.setLocation(p1.getX(), p1.getY()-100);
                  pixels = 0;
                  //playerChange();
                 }
            }
            if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
            {
              for(int i = 0; i < pixels; i += 100)
              {
                  p1.move(100);
              }
              pixels = 0;
              //playerChange();
            }
            if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
            {
                if (p1.getX() == gridPositionX[9][0])
                 {
                  p1.setLocation(p1.getX(), p1.getY()-100);
                  pixels = 0;
                  //playerChange();
                 }
            }
            if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
            {
               for(int i = 0; i < pixels; i += 100)
               {
                  p1.move(-100);
              }
              pixels = 0;
              //playerChange();
              }
        }
        
          if (rollValue == 2)
          {
              if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][8])
                 {
                     p1.move(100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(100);
                }
                pixels = 0;
                //playerChange();
              }
              if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                 if (p1.getX() == gridPositionX[9][0])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][1])
                 {
                     p1.move(-100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 } 
              }
              if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(-100);
                }
                pixels = 0;
                //playerChange();
              }
          }
          
          if (rollValue == 3)
          {
              if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][8])
                 {
                     p1.move(100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][7])
                 {
                     p1.move(200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(100);
                }
                pixels = 0;
                //playerChange();
              }
              if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                 if (p1.getX() == gridPositionX[9][0])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][1])
                 {
                     p1.move(-100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][2])
                 {
                     p1.move(-200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(-100);
                }
                pixels = 0;
                //playerChange();
              }
            }
            
          if (rollValue == 4)
          {
              if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][8])
                 {
                     p1.move(100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][7])
                 {
                     p1.move(200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][6])
                 {
                     p1.move(300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(100);
                }
                pixels = 0;
                //playerChange();
              }
              if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                 if (p1.getX() == gridPositionX[9][0])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][1])
                 {
                     p1.move(-100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][2])
                 {
                     p1.move(-200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][3])
                 {
                     p1.move(-300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(-100);
                }
                pixels = 0;
                //playerChange();
              }
          }
          
          if (rollValue == 5)
          {
              if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-400);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][8])
                 {
                     p1.move(100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][7])
                 {
                     p1.move(200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][6])
                 {
                     p1.move(300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][5])
                 {
                     p1.move(400);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(100);
                }
                pixels = 0;
                //playerChange();
              }
              if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                 if (p1.getX() == gridPositionX[9][0])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(400);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][1])
                 {
                     p1.move(-100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][2])
                 {
                     p1.move(-200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][3])
                 {
                     p1.move(-300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][4])
                 {
                     p1.move(-400);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(-100);
                }
                pixels = 0;
                //playerChange();
              }
          }
          
          if (rollValue == 6)
          {
              if ((p1.getX() + pixels) > 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                 if (p1.getX() == gridPositionX[9][9])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-500);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][8])
                 {
                     p1.move(100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-400);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][7])
                 {
                     p1.move(200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][6])
                 {
                     p1.move(300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(-200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][5])
                 {
                     p1.move(400);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     p1.move(-100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][4])
                 {
                     p1.move(500);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() + pixels) <= 1250 && (p1.getY() == gridPositionY[9]) || (p1.getY() == gridPositionY[7]) || (p1.getY() == gridPositionY[5]) || (p1.getY() == gridPositionY[3]) || (p1.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(100);
                }
                pixels = 0;
                //playerChange();
              }
              if ((p1.getX() - pixels) < 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                 if (p1.getX() == gridPositionX[9][0])
                 {
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(500);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][1])
                 {
                     p1.move(-100);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(400);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][2])
                 {
                     p1.move(-200);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(300);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][3])
                 {
                     p1.move(-300);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(200);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][4])
                 {
                     p1.move(-400);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     Greenfoot.delay(25);
                     p1.move(100);
                     pixels = 0;
                     //playerChange();
                 }
                 if (p1.getX() == gridPositionX[9][5])
                 {
                     p1.move(-500);
                     Greenfoot.delay(25);
                     p1.setLocation(p1.getX(), p1.getY()-100);
                     pixels = 0;
                     //playerChange();
                 }
              }
              if ((p1.getX() - pixels) >= 350 && (p1.getY() == gridPositionY[8]) || (p1.getY() == gridPositionY[6]) || (p1.getY() == gridPositionY[4]) || (p1.getY() == gridPositionY[2]) || (p1.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels; i += 100)
                {
                    p1.move(-100);
                }
                pixels = 0;
                //playerChange();
              }
          }
          
            if (p1.getX() == gridPositionX[9][0] && p1.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[6][2], gridPositionY[6]);
            }
            if (p1.getX() == gridPositionX[9][3] && p1.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[8][6], gridPositionY[8]);
            }
            if (p1.getX() == gridPositionX[9][8] && p1.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[6][9], gridPositionY[6]);
            }
            if (p1.getX() == gridPositionX[8][3] && p1.getY() == gridPositionY[8])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[9][5], gridPositionY[9]);
            }
            if (p1.getX() == gridPositionX[7][0] && p1.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[5][1], gridPositionY[5]);
            }
            if (p1.getX() == gridPositionX[7][7] && p1.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[1][3], gridPositionY[1]);
            }
            if (p1.getX() == gridPositionX[4][9] && p1.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[3][6], gridPositionY[3]);
            }
            if (p1.getX() == gridPositionX[4][6] && p1.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[6][6], gridPositionY[6]);
            }
            if (p1.getX() == gridPositionX[3][1] && p1.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[8][1], gridPositionY[8]);
            }
            if (p1.getX() == gridPositionX[3][3] && p1.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[4][0], gridPositionY[4]);
            }
            if (p1.getX() == gridPositionX[2][8] && p1.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[0][9], gridPositionY[0]);
            }
            if (p1.getX() == gridPositionX[2][0] && p1.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[0][1], gridPositionY[1]);
            }
            if (p1.getX() == gridPositionX[1][6] && p1.getY() == gridPositionY[1])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[6][4], gridPositionY[6]);
            }
            if (p1.getX() == gridPositionX[0][7] && p1.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[2][7], gridPositionY[2]);
            }
            if (p1.getX() == gridPositionX[0][5] && p1.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[2][2], gridPositionY[2]);
            }
            if (p1.getX() == gridPositionX[0][2] && p1.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p1.setLocation(gridPositionX[2][1], gridPositionY[2]);
            }
        } 
      if(Greenfoot.mouseClicked(dice2))
        {    
        int rollValue2 = dice2.roll();
        int pixels2 = rollValue2*100;
          //int remainingPixels = pixels2;
         JOptionPane.showMessageDialog(new JInternalFrame(), "You have rolled a: " + rollValue2,"Dice Roll", JOptionPane.INFORMATION_MESSAGE);
          if (rollValue2 == 1)
          {
            if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                  p2.setLocation(p2.getX(), p2.getY()-100);
                  pixels2 = 0;
                  //playerChange();
                 }
            }
            if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
            {
              for(int i = 0; i < pixels2; i += 100)
              {
                  p2.move(100);
              }
              pixels2 = 0;
              //playerChange();
            }
            if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
            {
                if (p2.getX() == gridPositionX[9][0])
                 {
                  p2.setLocation(p2.getX(), p2.getY()-100);
                  pixels2 = 0;
                  //playerChange();
                 }
            }
            if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
            {
               for(int i = 0; i < pixels2; i += 100)
               {
                  p2.move(-100);
              }
              pixels2 = 0;
              //playerChange();
              }
        }
        
          if (rollValue2 == 2)
          {
              if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][8])
                 {
                     p2.move(100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(100);
                }
                pixels2 = 0;
                //playerChange();
              }
              if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                 if (p2.getX() == gridPositionX[9][0])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][1])
                 {
                     p2.move(-100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 } 
              }
              if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(-100);
                }
                pixels2 = 0;
                //playerChange();
              }
          }
          
          if (rollValue2 == 3)
          {
              if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][8])
                 {
                     p2.move(100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][7])
                 {
                     p2.move(200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(100);
                }
                pixels2 = 0;
                //playerChange();
              }
              if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                 if (p2.getX() == gridPositionX[9][0])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][1])
                 {
                     p2.move(-100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][2])
                 {
                     p2.move(-200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(-100);
                }
                pixels2 = 0;
                //playerChange();
              }
            }
            
          if (rollValue2 == 4)
          {
              if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][8])
                 {
                     p2.move(100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][7])
                 {
                     p2.move(200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][6])
                 {
                     p2.move(300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(100);
                }
                pixels2 = 0;
                //playerChange();
              }
              if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                 if (p2.getX() == gridPositionX[9][0])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][1])
                 {
                     p2.move(-100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][2])
                 {
                     p2.move(-200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][3])
                 {
                     p2.move(-300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(-100);
                }
                pixels2 = 0;
                //playerChange();
              }
          }
          
          if (rollValue2 == 5)
          {
              if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-400);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][8])
                 {
                     p2.move(100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][7])
                 {
                     p2.move(200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][6])
                 {
                     p2.move(300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][5])
                 {
                     p2.move(400);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(100);
                }
                pixels2 = 0;
                //playerChange();
              }
              if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                 if (p2.getX() == gridPositionX[9][0])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(400);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][1])
                 {
                     p2.move(-100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][2])
                 {
                     p2.move(-200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][3])
                 {
                     p2.move(-300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][4])
                 {
                     p2.move(-400);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(-100);
                }
                pixels2 = 0;
                //playerChange();
              }
          }
          
          if (rollValue2 == 6)
          {
              if ((p2.getX() + pixels2) > 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                 if (p2.getX() == gridPositionX[9][9])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-500);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][8])
                 {
                     p2.move(100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-400);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][7])
                 {
                     p2.move(200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][6])
                 {
                     p2.move(300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(-200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][5])
                 {
                     p2.move(400);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     p2.move(-100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][4])
                 {
                     p2.move(500);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() + pixels2) <= 1250 && (p2.getY() == gridPositionY[9]) || (p2.getY() == gridPositionY[7]) || (p2.getY() == gridPositionY[5]) || (p2.getY() == gridPositionY[3]) || (p2.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(100);
                }
                pixels2 = 0;
                //playerChange();
              }
              if ((p2.getX() - pixels2) < 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                 if (p2.getX() == gridPositionX[9][0])
                 {
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(500);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][1])
                 {
                     p2.move(-100);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(400);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][2])
                 {
                     p2.move(-200);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(300);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][3])
                 {
                     p2.move(-300);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(200);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][4])
                 {
                     p2.move(-400);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     Greenfoot.delay(25);
                     p2.move(100);
                     pixels2 = 0;
                     //playerChange();
                 }
                 if (p2.getX() == gridPositionX[9][5])
                 {
                     p2.move(-500);
                     Greenfoot.delay(25);
                     p2.setLocation(p2.getX(), p2.getY()-100);
                     pixels2 = 0;
                     //playerChange();
                 }
              }
              if ((p2.getX() - pixels2) >= 350 && (p2.getY() == gridPositionY[8]) || (p2.getY() == gridPositionY[6]) || (p2.getY() == gridPositionY[4]) || (p2.getY() == gridPositionY[2]) || (p2.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels2; i += 100)
                {
                    p2.move(-100);
                }
                pixels2 = 0;
                //playerChange();
              }
          }
          
            if (p2.getX() == gridPositionX[9][0] && p2.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[6][2], gridPositionY[6]);
            }
            if (p2.getX() == gridPositionX[9][3] && p2.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[8][6], gridPositionY[8]);
            }
            if (p2.getX() == gridPositionX[9][8] && p2.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[6][9], gridPositionY[6]);
            }
            if (p2.getX() == gridPositionX[8][3] && p2.getY() == gridPositionY[8])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[9][5], gridPositionY[9]);
            }
            if (p2.getX() == gridPositionX[7][0] && p2.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[5][1], gridPositionY[5]);
            }
            if (p2.getX() == gridPositionX[7][7] && p2.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[1][3], gridPositionY[1]);
            }
            if (p2.getX() == gridPositionX[4][9] && p2.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[3][6], gridPositionY[3]);
            }
            if (p2.getX() == gridPositionX[4][6] && p2.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[6][6], gridPositionY[6]);
            }
            if (p2.getX() == gridPositionX[3][1] && p2.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[8][1], gridPositionY[8]);
            }
            if (p2.getX() == gridPositionX[3][3] && p2.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[4][0], gridPositionY[4]);
            }
            if (p2.getX() == gridPositionX[2][8] && p2.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[0][9], gridPositionY[0]);
            }
            if (p2.getX() == gridPositionX[2][0] && p2.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[0][1], gridPositionY[1]);
            }
            if (p2.getX() == gridPositionX[1][6] && p2.getY() == gridPositionY[1])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[6][4], gridPositionY[6]);
            }
            if (p2.getX() == gridPositionX[0][7] && p2.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[2][7], gridPositionY[2]);
            }
            if (p2.getX() == gridPositionX[0][5] && p2.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[2][2], gridPositionY[2]);
            }
            if (p2.getX() == gridPositionX[0][2] && p2.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p2.setLocation(gridPositionX[2][1], gridPositionY[2]);
            }
        }
        if(Greenfoot.mouseClicked(dice3))
        {    
        int rollValue3 = dice3.roll();
        int pixels3 = rollValue3*100;
          //int remainingPixels = pixels3;
         JOptionPane.showMessageDialog(new JInternalFrame(), "You have rolled a: " + rollValue3,"Dice Roll", JOptionPane.INFORMATION_MESSAGE);
          if (rollValue3 == 1)
          {
            if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                  p3.setLocation(p3.getX(), p3.getY()-100);
                  pixels3 = 0;
                  //playerChange();
                 }
            }
            if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
            {
              for(int i = 0; i < pixels3; i += 100)
              {
                  p3.move(100);
              }
              pixels3 = 0;
              //playerChange();
            }
            if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
            {
                if (p3.getX() == gridPositionX[9][0])
                 {
                  p3.setLocation(p3.getX(), p3.getY()-100);
                  pixels3 = 0;
                  //playerChange();
                 }
            }
            if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
            {
               for(int i = 0; i < pixels3; i += 100)
               {
                  p3.move(-100);
              }
              pixels3 = 0;
              //playerChange();
              }
        }
        
          if (rollValue3 == 2)
          {
              if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][8])
                 {
                     p3.move(100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(100);
                }
                pixels3 = 0;
                //playerChange();
              }
              if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                 if (p3.getX() == gridPositionX[9][0])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][1])
                 {
                     p3.move(-100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 } 
              }
              if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(-100);
                }
                pixels3 = 0;
                //playerChange();
              }
          }
          
          if (rollValue3 == 3)
          {
              if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][8])
                 {
                     p3.move(100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][7])
                 {
                     p3.move(200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(100);
                }
                pixels3 = 0;
                //playerChange();
              }
              if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                 if (p3.getX() == gridPositionX[9][0])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][1])
                 {
                     p3.move(-100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][2])
                 {
                     p3.move(-200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(-100);
                }
                pixels3 = 0;
                //playerChange();
              }
            }
            
          if (rollValue3 == 4)
          {
              if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][8])
                 {
                     p3.move(100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][7])
                 {
                     p3.move(200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][6])
                 {
                     p3.move(300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(100);
                }
                pixels3 = 0;
                //playerChange();
              }
              if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                 if (p3.getX() == gridPositionX[9][0])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][1])
                 {
                     p3.move(-100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][2])
                 {
                     p3.move(-200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][3])
                 {
                     p3.move(-300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(-100);
                }
                pixels3 = 0;
                //playerChange();
              }
          }
          
          if (rollValue3 == 5)
          {
              if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-400);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][8])
                 {
                     p3.move(100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][7])
                 {
                     p3.move(200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][6])
                 {
                     p3.move(300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][5])
                 {
                     p3.move(400);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(100);
                }
                pixels3 = 0;
                //playerChange();
              }
              if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                 if (p3.getX() == gridPositionX[9][0])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(400);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][1])
                 {
                     p3.move(-100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][2])
                 {
                     p3.move(-200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][3])
                 {
                     p3.move(-300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][4])
                 {
                     p3.move(-400);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(-100);
                }
                pixels3 = 0;
                //playerChange();
              }
          }
          
          if (rollValue3 == 6)
          {
              if ((p3.getX() + pixels3) > 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                 if (p3.getX() == gridPositionX[9][9])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-500);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][8])
                 {
                     p3.move(100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-400);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][7])
                 {
                     p3.move(200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][6])
                 {
                     p3.move(300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(-200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][5])
                 {
                     p3.move(400);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     p3.move(-100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][4])
                 {
                     p3.move(500);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() + pixels3) <= 1250 && (p3.getY() == gridPositionY[9]) || (p3.getY() == gridPositionY[7]) || (p3.getY() == gridPositionY[5]) || (p3.getY() == gridPositionY[3]) || (p3.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(100);
                }
                pixels3 = 0;
                //playerChange();
              }
              if ((p3.getX() - pixels3) < 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                 if (p3.getX() == gridPositionX[9][0])
                 {
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(500);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][1])
                 {
                     p3.move(-100);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(400);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][2])
                 {
                     p3.move(-200);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(300);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][3])
                 {
                     p3.move(-300);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(200);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][4])
                 {
                     p3.move(-400);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     Greenfoot.delay(25);
                     p3.move(100);
                     pixels3 = 0;
                     //playerChange();
                 }
                 if (p3.getX() == gridPositionX[9][5])
                 {
                     p3.move(-500);
                     Greenfoot.delay(25);
                     p3.setLocation(p3.getX(), p3.getY()-100);
                     pixels3 = 0;
                     //playerChange();
                 }
              }
              if ((p3.getX() - pixels3) >= 350 && (p3.getY() == gridPositionY[8]) || (p3.getY() == gridPositionY[6]) || (p3.getY() == gridPositionY[4]) || (p3.getY() == gridPositionY[2]) || (p3.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels3; i += 100)
                {
                    p3.move(-100);
                }
                pixels3 = 0;
                //playerChange();
              }
          }
          
            if (p3.getX() == gridPositionX[9][0] && p3.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[6][2], gridPositionY[6]);
            }
            if (p3.getX() == gridPositionX[9][3] && p3.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[8][6], gridPositionY[8]);
            }
            if (p3.getX() == gridPositionX[9][8] && p3.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[6][9], gridPositionY[6]);
            }
            if (p3.getX() == gridPositionX[8][3] && p3.getY() == gridPositionY[8])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[9][5], gridPositionY[9]);
            }
            if (p3.getX() == gridPositionX[7][0] && p3.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[5][1], gridPositionY[5]);
            }
            if (p3.getX() == gridPositionX[7][7] && p3.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[1][3], gridPositionY[1]);
            }
            if (p3.getX() == gridPositionX[4][9] && p3.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[3][6], gridPositionY[3]);
            }
            if (p3.getX() == gridPositionX[4][6] && p3.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[6][6], gridPositionY[6]);
            }
            if (p3.getX() == gridPositionX[3][1] && p3.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[8][1], gridPositionY[8]);
            }
            if (p3.getX() == gridPositionX[3][3] && p3.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[4][0], gridPositionY[4]);
            }
            if (p3.getX() == gridPositionX[2][8] && p3.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[0][9], gridPositionY[0]);
            }
            if (p3.getX() == gridPositionX[2][0] && p3.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[0][1], gridPositionY[1]);
            }
            if (p3.getX() == gridPositionX[1][6] && p3.getY() == gridPositionY[1])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[6][4], gridPositionY[6]);
            }
            if (p3.getX() == gridPositionX[0][7] && p3.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[2][7], gridPositionY[2]);
            }
            if (p3.getX() == gridPositionX[0][5] && p3.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[2][2], gridPositionY[2]);
            }
            if (p3.getX() == gridPositionX[0][2] && p3.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p3.setLocation(gridPositionX[2][1], gridPositionY[2]);
            }
        }
        if(Greenfoot.mouseClicked(dice4))
        {    
        int rollValue4 = dice4.roll();
        int pixels4 = rollValue4*100;
          //int remainingPixels = pixels4;
         JOptionPane.showMessageDialog(new JInternalFrame(), "You have rolled a: " + rollValue4,"Dice Roll", JOptionPane.INFORMATION_MESSAGE);
          if (rollValue4 == 1)
          {
            if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                  p4.setLocation(p4.getX(), p4.getY()-100);
                  pixels4 = 0;
                  //playerChange();
                 }
            }
            if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
            {
              for(int i = 0; i < pixels4; i += 100)
              {
                  p4.move(100);
              }
              pixels4 = 0;
              //playerChange();
            }
            if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
            {
                if (p4.getX() == gridPositionX[9][0])
                 {
                  p4.setLocation(p4.getX(), p4.getY()-100);
                  pixels4 = 0;
                  //playerChange();
                 }
            }
            if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
            {
               for(int i = 0; i < pixels4; i += 100)
               {
                  p4.move(-100);
              }
              pixels4 = 0;
              //playerChange();
              }
        }
        
          if (rollValue4 == 2)
          {
              if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][8])
                 {
                     p4.move(100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(100);
                }
                pixels4 = 0;
                //playerChange();
              }
              if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                 if (p4.getX() == gridPositionX[9][0])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][1])
                 {
                     p4.move(-100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 } 
              }
              if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(-100);
                }
                pixels4 = 0;
                //playerChange();
              }
          }
          
          if (rollValue4 == 3)
          {
              if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][8])
                 {
                     p4.move(100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][7])
                 {
                     p4.move(200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(100);
                }
                pixels4 = 0;
                //playerChange();
              }
              if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                 if (p4.getX() == gridPositionX[9][0])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][1])
                 {
                     p4.move(-100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][2])
                 {
                     p4.move(-200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(-100);
                }
                pixels4 = 0;
                //playerChange();
              }
            }
            
          if (rollValue4 == 4)
          {
              if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][8])
                 {
                     p4.move(100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][7])
                 {
                     p4.move(200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][6])
                 {
                     p4.move(300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(100);
                }
                pixels4 = 0;
                //playerChange();
              }
              if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                 if (p4.getX() == gridPositionX[9][0])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][1])
                 {
                     p4.move(-100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][2])
                 {
                     p4.move(-200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][3])
                 {
                     p4.move(-300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(-100);
                }
                pixels4 = 0;
                //playerChange();
              }
          }
          
          if (rollValue4 == 5)
          {
              if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-400);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][8])
                 {
                     p4.move(100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][7])
                 {
                     p4.move(200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][6])
                 {
                     p4.move(300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][5])
                 {
                     p4.move(400);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(100);
                }
                pixels4 = 0;
                //playerChange();
              }
              if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                 if (p4.getX() == gridPositionX[9][0])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(400);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][1])
                 {
                     p4.move(-100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][2])
                 {
                     p4.move(-200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][3])
                 {
                     p4.move(-300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][4])
                 {
                     p4.move(-400);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(-100);
                }
                pixels4 = 0;
                //playerChange();
              }
          }
          
          if (rollValue4 == 6)
          {
              if ((p4.getX() + pixels4) > 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                 if (p4.getX() == gridPositionX[9][9])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-500);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][8])
                 {
                     p4.move(100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-400);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][7])
                 {
                     p4.move(200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][6])
                 {
                     p4.move(300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(-200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][5])
                 {
                     p4.move(400);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     p4.move(-100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][4])
                 {
                     p4.move(500);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() + pixels4) <= 1250 && (p4.getY() == gridPositionY[9]) || (p4.getY() == gridPositionY[7]) || (p4.getY() == gridPositionY[5]) || (p4.getY() == gridPositionY[3]) || (p4.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(100);
                }
                pixels4 = 0;
                //playerChange();
              }
              if ((p4.getX() - pixels4) < 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                 if (p4.getX() == gridPositionX[9][0])
                 {
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(500);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][1])
                 {
                     p4.move(-100);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(400);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][2])
                 {
                     p4.move(-200);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(300);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][3])
                 {
                     p4.move(-300);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(200);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][4])
                 {
                     p4.move(-400);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     Greenfoot.delay(25);
                     p4.move(100);
                     pixels4 = 0;
                     //playerChange();
                 }
                 if (p4.getX() == gridPositionX[9][5])
                 {
                     p4.move(-500);
                     Greenfoot.delay(25);
                     p4.setLocation(p4.getX(), p4.getY()-100);
                     pixels4 = 0;
                     //playerChange();
                 }
              }
              if ((p4.getX() - pixels4) >= 350 && (p4.getY() == gridPositionY[8]) || (p4.getY() == gridPositionY[6]) || (p4.getY() == gridPositionY[4]) || (p4.getY() == gridPositionY[2]) || (p4.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels4; i += 100)
                {
                    p4.move(-100);
                }
                pixels4 = 0;
                //playerChange();
              }
          }
          
            if (p4.getX() == gridPositionX[9][0] && p4.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[6][2], gridPositionY[6]);
            }
            if (p4.getX() == gridPositionX[9][3] && p4.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[8][6], gridPositionY[8]);
            }
            if (p4.getX() == gridPositionX[9][8] && p4.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[6][9], gridPositionY[6]);
            }
            if (p4.getX() == gridPositionX[8][3] && p4.getY() == gridPositionY[8])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[9][5], gridPositionY[9]);
            }
            if (p4.getX() == gridPositionX[7][0] && p4.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[5][1], gridPositionY[5]);
            }
            if (p4.getX() == gridPositionX[7][7] && p4.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[1][3], gridPositionY[1]);
            }
            if (p4.getX() == gridPositionX[4][9] && p4.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[3][6], gridPositionY[3]);
            }
            if (p4.getX() == gridPositionX[4][6] && p4.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[6][6], gridPositionY[6]);
            }
            if (p4.getX() == gridPositionX[3][1] && p4.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[8][1], gridPositionY[8]);
            }
            if (p4.getX() == gridPositionX[3][3] && p4.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[4][0], gridPositionY[4]);
            }
            if (p4.getX() == gridPositionX[2][8] && p4.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[0][9], gridPositionY[0]);
            }
            if (p4.getX() == gridPositionX[2][0] && p4.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[0][1], gridPositionY[1]);
            }
            if (p4.getX() == gridPositionX[1][6] && p4.getY() == gridPositionY[1])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[6][4], gridPositionY[6]);
            }
            if (p4.getX() == gridPositionX[0][7] && p4.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[2][7], gridPositionY[2]);
            }
            if (p4.getX() == gridPositionX[0][5] && p4.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[2][2], gridPositionY[2]);
            }
            if (p4.getX() == gridPositionX[0][2] && p4.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p4.setLocation(gridPositionX[2][1], gridPositionY[2]);
            }
        }
        if(Greenfoot.mouseClicked(dice5))
        {    
        int rollValue5 = dice5.roll();
        int pixels5 = rollValue5*100;
          //int remainingPixels = pixels5;
         JOptionPane.showMessageDialog(new JInternalFrame(), "You have rolled a: " + rollValue5,"Dice Roll", JOptionPane.INFORMATION_MESSAGE);
          if (rollValue5 == 1)
          {
            if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                  p5.setLocation(p5.getX(), p5.getY()-100);
                  pixels5 = 0;
                  //playerChange();
                 }
            }
            if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
            {
              for(int i = 0; i < pixels5; i += 100)
              {
                  p5.move(100);
              }
              pixels5 = 0;
              //playerChange();
            }
            if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
            {
                if (p5.getX() == gridPositionX[9][0])
                 {
                  p5.setLocation(p5.getX(), p5.getY()-100);
                  pixels5 = 0;
                  //playerChange();
                 }
            }
            if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
            {
               for(int i = 0; i < pixels5; i += 100)
               {
                  p5.move(-100);
              }
              pixels5 = 0;
              //playerChange();
              }
        }
        
          if (rollValue5 == 2)
          {
              if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][8])
                 {
                     p5.move(100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(100);
                }
                pixels5 = 0;
                //playerChange();
              }
              if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                 if (p5.getX() == gridPositionX[9][0])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][1])
                 {
                     p5.move(-100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 } 
              }
              if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(-100);
                }
                pixels5 = 0;
                //playerChange();
              }
          }
          
          if (rollValue5 == 3)
          {
              if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][8])
                 {
                     p5.move(100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][7])
                 {
                     p5.move(200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(100);
                }
                pixels5 = 0;
                //playerChange();
              }
              if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                 if (p5.getX() == gridPositionX[9][0])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][1])
                 {
                     p5.move(-100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][2])
                 {
                     p5.move(-200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(-100);
                }
                pixels5 = 0;
                //playerChange();
              }
            }
            
          if (rollValue5 == 4)
          {
              if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][8])
                 {
                     p5.move(100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][7])
                 {
                     p5.move(200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][6])
                 {
                     p5.move(300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(100);
                }
                pixels5 = 0;
                //playerChange();
              }
              if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                 if (p5.getX() == gridPositionX[9][0])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][1])
                 {
                     p5.move(-100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][2])
                 {
                     p5.move(-200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][3])
                 {
                     p5.move(-300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(-100);
                }
                pixels5 = 0;
                //playerChange();
              }
          }
          
          if (rollValue5 == 5)
          {
              if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-400);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][8])
                 {
                     p5.move(100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][7])
                 {
                     p5.move(200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][6])
                 {
                     p5.move(300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][5])
                 {
                     p5.move(400);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(100);
                }
                pixels5 = 0;
                //playerChange();
              }
              if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                 if (p5.getX() == gridPositionX[9][0])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(400);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][1])
                 {
                     p5.move(-100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][2])
                 {
                     p5.move(-200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][3])
                 {
                     p5.move(-300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][4])
                 {
                     p5.move(-400);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(-100);
                }
                pixels5 = 0;
                //playerChange();
              }
          }
          
          if (rollValue5 == 6)
          {
              if ((p5.getX() + pixels5) > 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                 if (p5.getX() == gridPositionX[9][9])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-500);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][8])
                 {
                     p5.move(100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-400);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][7])
                 {
                     p5.move(200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][6])
                 {
                     p5.move(300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(-200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][5])
                 {
                     p5.move(400);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     p5.move(-100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][4])
                 {
                     p5.move(500);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() + pixels5) <= 1250 && (p5.getY() == gridPositionY[9]) || (p5.getY() == gridPositionY[7]) || (p5.getY() == gridPositionY[5]) || (p5.getY() == gridPositionY[3]) || (p5.getY() == gridPositionY[1]))
              {
                for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(100);
                }
                pixels5 = 0;
                //playerChange();
              }
              if ((p5.getX() - pixels5) < 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                 if (p5.getX() == gridPositionX[9][0])
                 {
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(500);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][1])
                 {
                     p5.move(-100);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(400);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][2])
                 {
                     p5.move(-200);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(300);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][3])
                 {
                     p5.move(-300);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(200);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][4])
                 {
                     p5.move(-400);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     Greenfoot.delay(25);
                     p5.move(100);
                     pixels5 = 0;
                     //playerChange();
                 }
                 if (p5.getX() == gridPositionX[9][5])
                 {
                     p5.move(-500);
                     Greenfoot.delay(25);
                     p5.setLocation(p5.getX(), p5.getY()-100);
                     pixels5 = 0;
                     //playerChange();
                 }
              }
              if ((p5.getX() - pixels5) >= 350 && (p5.getY() == gridPositionY[8]) || (p5.getY() == gridPositionY[6]) || (p5.getY() == gridPositionY[4]) || (p5.getY() == gridPositionY[2]) || (p5.getY() == gridPositionY[0]))
              {
                  for(int i = 0; i < pixels5; i += 100)
                {
                    p5.move(-100);
                }
                pixels5 = 0;
                //playerChange();
              }
          }
          
            if (p5.getX() == gridPositionX[9][0] && p5.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[6][2], gridPositionY[6]);
            }
            if (p5.getX() == gridPositionX[9][3] && p5.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[8][6], gridPositionY[8]);
            }
            if (p5.getX() == gridPositionX[9][8] && p5.getY() == gridPositionY[9])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[6][9], gridPositionY[6]);
            }
            if (p5.getX() == gridPositionX[8][3] && p5.getY() == gridPositionY[8])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[9][5], gridPositionY[9]);
            }
            if (p5.getX() == gridPositionX[7][0] && p5.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[5][1], gridPositionY[5]);
            }
            if (p5.getX() == gridPositionX[7][7] && p5.getY() == gridPositionY[7])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[1][3], gridPositionY[1]);
            }
            if (p5.getX() == gridPositionX[4][9] && p5.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[3][6], gridPositionY[3]);
            }
            if (p5.getX() == gridPositionX[4][6] && p5.getY() == gridPositionY[4])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[6][6], gridPositionY[6]);
            }
            if (p5.getX() == gridPositionX[3][1] && p5.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[8][1], gridPositionY[8]);
            }
            if (p5.getX() == gridPositionX[3][3] && p5.getY() == gridPositionY[3])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[4][0], gridPositionY[4]);
            }
            if (p5.getX() == gridPositionX[2][8] && p5.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[0][9], gridPositionY[0]);
            }
            if (p5.getX() == gridPositionX[2][0] && p5.getY() == gridPositionY[2])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[0][1], gridPositionY[1]);
            }
            if (p5.getX() == gridPositionX[1][6] && p5.getY() == gridPositionY[1])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[6][4], gridPositionY[6]);
            }
            if (p5.getX() == gridPositionX[0][7] && p5.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[2][7], gridPositionY[2]);
            }
            if (p5.getX() == gridPositionX[0][5] && p5.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[2][2], gridPositionY[2]);
            }
            if (p5.getX() == gridPositionX[0][2] && p5.getY() == gridPositionY[0])
            {
                Greenfoot.delay(50);
                p5.setLocation(gridPositionX[2][1], gridPositionY[2]);
            }
        }
  }
}