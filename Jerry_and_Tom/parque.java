import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parque extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("tema.mp3");
    public void started()
    {
    bgMusic.playLoop();
    }
 
    public void stopped()
    {
    bgMusic.pause();
    }
    public int timer = 2000;
    /**
     * Constructor for objects of class parque.
     * 
     */
    public parque()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 357, 1); 
        prepare();
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
        private void prepare()
        {
        jerry jerry = new jerry();
        addObject(jerry,59,286);
        tom tom = new tom();
        addObject(tom,515,255);
        }
        public void act()
        {
        timer--;
        if (timer <= 0) {
        jerryganhou world = new jerryganhou();
        Greenfoot.setWorld(world);
        }
    }
}
