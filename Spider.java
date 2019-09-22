import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spider extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
         {
             setLocation(80, 1000);
         }
    }    
}
