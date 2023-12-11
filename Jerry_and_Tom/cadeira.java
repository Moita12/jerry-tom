import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cadeira here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cadeira extends tom
{
    /**
     * Act - do whatever the cadeira wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
            turn(+4);
        acertaralbo();
    }
    public void moveAtaque()
    {
    int speed = 1;
    this.setLocation(this.getX() - speed, this.getY());
    }
    public void acertaralbo() {
        Actor b = getOneIntersectingObject(jerry.class);
        Actor a = getOneIntersectingObject(cadeira.class);
        if (b !=null){
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            tomganho world = new tomganho();
            Greenfoot.setWorld(world);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}

        
    
