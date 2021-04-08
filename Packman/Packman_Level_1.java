import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Packman_Level_1 extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Packman_Level_1()
    {    

        super(720, 585, 1);
        
        generateMap();
        generateItems();
        
        this.addObject(new Packman(),50,360);
        this.addObject(new Score(),675,15);

    }
    
    public void generateItems(){
        this.addObject(new Cherry(),135,180);
        this.addObject(new Cherry(),585,180);
        
        this.addObject(new Big_Item(),135,270);
        this.addObject(new Big_Item(),585,270);
        
        this.addObject(new Apple(),315,270);
        
        for(int i= 135; i <= 585 ; i += 45){
            this.addObject(new Small_Item(),i,90);
        }
        
        for(int i= 135; i <= 585 ; i += 45){
            this.addObject(new Small_Item(),i,450);
        }
    }
    
    public void generateMap(){
        this.addObject(new Wall(), 675, 540);
        this.addObject(new Wall(), 675, 450);
        this.addObject(new Wall(), 675, 270);
        this.addObject(new Wall(), 675, 180);
        this.addObject(new Wall(), 675, 90);
        this.addObject(new Wall(), 675, 0);

        this.addObject(new Wall(), 45, 540);
        this.addObject(new Wall(), 45, 450);
        this.addObject(new Wall(), 45, 270);
        this.addObject(new Wall(), 45, 180);
        this.addObject(new Wall(), 45, 90);
        this.addObject(new Wall(), 45, 0);

        this.addObject(new Wall(), 135, 540);
        this.addObject(new Wall(), 225, 540);
        this.addObject(new Wall(), 315, 540);
        this.addObject(new Wall(), 405, 540);
        this.addObject(new Wall(), 495, 540);
        this.addObject(new Wall(), 585, 540);

        this.addObject(new Wall(), 135, 0);
        this.addObject(new Wall(), 225, 0);
        this.addObject(new Wall(), 315, 0);
        this.addObject(new Wall(), 405, 0);
        this.addObject(new Wall(), 495, 0);
        this.addObject(new Wall(), 585, 0);

        this.addObject(new Wall(), 495, 360);
        this.addObject(new Wall(), 405, 360);
        this.addObject(new Wall(), 315, 360);
        this.addObject(new Wall(), 225, 360);

        this.addObject(new Wall(), 495, 270);
        this.addObject(new Wall(), 225, 270);
        this.addObject(new Wall(), 495, 180);
        this.addObject(new Wall(), 225, 180);
        this.addObject(new Wall(), 315, 180);
    }
}
