import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Items
{
    private int points;
    private int collisionFlag;

    public Cherry(){
        setImage("images/Fruit 1.png");
        points = 30;
    }
    
    public int getPoints(){
        return points;
    }

    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
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
