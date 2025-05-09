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
        addObject(elephant,389,72);
        elephant.setLocation(464,116);
        elephant.setLocation(497,95);
        Label label = new Label("Press<space> to Start", 40);
        addObject(label,226,288);
        label.setLocation(335,247);
        label.setLocation(335,247);
        label.setLocation(280,270);
        label.setLocation(318,287);
        label.setLocation(318,297);
        elephant.setLocation(494,78);
    }
}
