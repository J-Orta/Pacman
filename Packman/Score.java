import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public static int scorePoints;
    
    public Score(){
        scorePoints = 0;
        setImage(new GreenfootImage("Score: " + scorePoints, 20, Color.WHITE, new Color(0, 0, 0, 0)));
    }
  
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score: " + scorePoints, 20, Color.WHITE, new Color(0, 0, 0, 0)));
    }    
}
