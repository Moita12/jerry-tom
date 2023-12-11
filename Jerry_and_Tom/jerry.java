import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class jerry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jerry extends Actor
{
    public int speed = 2;
    public int lifes = 3;
    public int sTimer = 0;
    /**
     * Act - do whatever the jerry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
        lifes();
    }
    public void movimento(){
        // Add your action code here.
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }        
    }
    public void lifes(){
         Actor a = getOneIntersectingObject(jerry.class);
        if(a != null){
            lifes--;
            getWorld().removeObject(a);
        } else if(lifes == 0){
            getWorld().removeObject(this);
        }
    }
}
