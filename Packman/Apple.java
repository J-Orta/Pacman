import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Items
{
    private int points;
    private int collisionFlag;
    
    public Apple(){
        setImage("images/Fruit 2.png");
        points = 40;
    }
    
    public int getPoints(){
        return points;
    }
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(collisionFlag == 0){
            if(isTouching(Packman.class)){
               setImage("images/Void.png");
               Score.scorePoints += getPoints();
               collisionFlag = 1;
            }
        }
    }    
}
