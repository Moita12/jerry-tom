import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tom extends Actor
{
    public int sTimer = 0;
    public int speed = 2;
    GreenfootSound bgMusic = new GreenfootSound("jogar.mp3");
    /**
     * Act - do whatever the tom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act()
    {   
        movimento();
    }
    public void movimento(){
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
        }
        else if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
        }
         if(Greenfoot.isKeyDown("space")&&(sTimer == 0)){
         sTimer ++;
         getWorld().addObject(new cadeira(), getX() -100,
         getY() -30);
         bgMusic.play();
        }
        else{
         if(!Greenfoot.isKeyDown("space" ))
         sTimer = 0;
        }
    }
}

