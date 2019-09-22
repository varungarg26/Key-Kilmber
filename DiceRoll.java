import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.Random;

public class DiceRoll extends Actor
{
   Random rand = new Random();
   
   public void act()
   {
      GreenfootImage image = getImage();
      image.scale(50, 50);
      setImage(image);
   }
   {
       roll();
   }
   public int roll() 
    {
        int randNumber = 1 + Greenfoot.getRandomNumber(6);
        return randNumber;
    }   
}
