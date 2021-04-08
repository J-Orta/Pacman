import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Packman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Packman extends Actor
{
    private static final int OFFSET = 3;
    private int currentImage;
    private int counter;
    private int flipStatus;
    private int currentPoints;

    public Packman(){
        setImage("images/Pakman 1.png");
    }

    /**
     * Act - do whatever the Packman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        packmanAnimation();
        handleDirection();
    }
    
    public void handleDirection(){

        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("right")){
            setLocation(x + OFFSET, y);
            setRotation(0);
            flipStatus = 0;
            if(isTouching(Wall.class)){
                setLocation(x - OFFSET, y);
            }
            if(isAtEdge()){
                setLocation(718 - x, y);
            }
        }else if(Greenfoot.isKeyDown("left")){
            setLocation(x - OFFSET, y);
            setRotation(0);
            flipStatus = 1;
            if(isTouching(Wall.class)){
                setLocation(x + OFFSET, y);
            }
            if(isAtEdge()){
                setLocation(718 - x, y);
            }
        }else if(Greenfoot.isKeyDown("up")){
            setLocation(x, y - OFFSET);
            setRotation(270);
            flipStatus = 0;
            if(isTouching(Wall.class)){
                setLocation(x, y + OFFSET);
            }
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(x, y + OFFSET);
            setRotation(90);
            flipStatus = 0;
            if(isTouching(Wall.class)){
                setLocation(x, y - OFFSET);
            }
        }
    }

    public void packmanAnimation(){
        if(flipStatus == 0){

            if(counter == 0){

                if(currentImage == 0){
                    setImage("images/Pakman 1.png");
                }else if(currentImage == 1){
                    setImage("images/Pakman 2.png");
                }
                currentImage = (currentImage + 1) % 2;
            }
            counter = (counter + 1) % 5;

        }else if(flipStatus == 1){

            if(counter == 0){

                if(currentImage == 0){
                    setImage("images/Pakman flip 1.png");
                }else if(currentImage == 1){
                    setImage("images/Pakman flip 2.png");
                }
                currentImage = (currentImage + 1) % 2;
            }
            counter = (counter + 1) % 5;
        }
    }
}
