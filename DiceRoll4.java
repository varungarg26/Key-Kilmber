import greenfoot.*; 
public class DiceRoll4 extends Actor
{
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
