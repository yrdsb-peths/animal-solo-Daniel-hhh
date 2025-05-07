import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle = new GreenfootImage("images/idle0.png");
    
    public Elephant()
    {
        setImage(idle); 
    }
    public void act()
    {
        setImage("images/elephant.png");
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
