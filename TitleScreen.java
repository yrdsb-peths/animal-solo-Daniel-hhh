import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant",60);
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2,200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,459,67);
        elephant.setLocation(508,79);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,269,233);
        label.setLocation(356,239);
        label.setLocation(329,236);
        Label label2 = new Label("Press < space> to Start", 40);
        addObject(label2,309,298);
        label2.setLocation(351,301);
        label2.setLocation(329,302);
    }
}
