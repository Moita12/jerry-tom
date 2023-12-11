import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    public int temp = 10;
    public int temp1 = 10;
    public int temp2 = 10;
    public int temp3 = 10;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act(){
        temp--;
        if(Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("dialogo1.png"));
            temp1--;
        }
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("dialogo2.png"));
            temp2--;
        }
        if(Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            parque world = new parque();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}


