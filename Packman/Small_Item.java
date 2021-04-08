import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Small_Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Small_Item extends Items
{
    private int points;
    private int collisionFlag;
    
    public Small_Item(){
        setImage("images/Small C.png");
        points = 10;
    }
    
    public int getPoints(){
        return points;
    }
    /**
     * Act - do whatever the Small_Item wants to do. This method is called whenever
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
