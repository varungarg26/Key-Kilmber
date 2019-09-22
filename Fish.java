import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fish extends Actor
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
         {
             setLocation(120, 1000);
         }
    }    
}
