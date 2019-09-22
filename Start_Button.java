import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.util.*;

public class Start_Button extends Actor
{
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    public static int players;
    public void act() 
    {
        /*GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);*/
        
        if (Greenfoot.mouseClicked(this))
        {
          String numOfPlayers = JOptionPane.showInputDialog("Please enter the number of players that will be playing (Max is 5)");
            
          int numberOfPlayers = Integer.parseInt(numOfPlayers);
           //getNumberOfPlayers();
          //Greenfoot.delay(500);
          
         JOptionPane.showMessageDialog(new JInternalFrame(), "Players, please click on your preselected Game Pieces to play","Choose Game Piece", JOptionPane.INFORMATION_MESSAGE);
          
        }    
    /*public int getNumberOfPlayers ()
    {
        Scanner in = new Scanner(System.in);
        String numOfPlayers = JOptionPane.showInputDialog("Please enter the number of players that will be playing (Max is 5)");
        int numberOfPlayers = Integer.parseInt(numOfPlayers);
        return numberOfPlayers;
    }*/
}
}
