/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * I modified this class to draw a picture representing a Minecraft player
 * and a Creeper encountering each other on a sunny day.
 * 
 * @author  Michael Biondi
 * @version 2024.09.10
 */
public class Picture
{
    private Circle grass;
    private Circle sun;
    
    private Person player;
    private Triangle hat;
    
    private Square creeperHead;
    private Square creeperBody;
    private Square creeperLegs;
    
    private Square mouthLeft;
    private Square mouthMiddle;
    private Square mouthRight;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        grass = new Circle();
        sun = new Circle();
        player = new Person();
        hat = new Triangle();  
        creeperHead = new Square();
        creeperBody = new Square();
        creeperLegs = new Square();
        mouthLeft = new Square();
        mouthMiddle = new Square();
        mouthRight = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-420);
            grass.moveVertical(100);
            grass.changeSize(900);
            grass.makeVisible();
            
            player.changeColor("black");
            player.moveHorizontal(-150);
            player.moveVertical(-20);
            player.changeSize(100, 50);
            player.makeVisible();
            
            hat.changeColor("orange");
            hat.moveHorizontal(20);
            hat.moveVertical(-60);
            hat.changeSize(30, 60);
            hat.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-100);
            sun.moveVertical(-40);
            sun.changeSize(60);
            sun.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        grass.changeColor("black");
        player.changeColor("black");
        hat.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        grass.changeColor("green");
        player.changeColor("black");
        hat.changeColor("orange");
        sun.changeColor("yellow");
    }
}
