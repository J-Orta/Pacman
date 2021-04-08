import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Big_Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Big_Item extends Items
{
    private int points;
    private int collisionFlag;
    
    public Big_Item(){
        setImage("images/Big C.png");
        points = 50;
    }
    
    public int getPoints(){
        return points;
    }
    /**
     * Act - do whatever the Big_Item wants to do. This method is called whenever
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
