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
    private Square sky;
    private Circle grass;
    private Circle sun;
    
    private Person player;
    private Triangle hat;
    
    private Square creeperHead;
    private Person creeperBody;
    
    private Square eyeLeft;
    private Square eyeRight;
    
    private Square mouthLeft;
    private Square mouthCenter;
    private Square mouthRight;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        grass = new Circle();
        sun = new Circle();
        player = new Person();
        hat = new Triangle();  
        creeperHead = new Square();
        creeperBody = new Person();
        eyeLeft = new Square();
        eyeRight = new Square();
        mouthLeft = new Square();
        mouthCenter = new Square();
        mouthRight = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.moveHorizontal(-400);
            sky.moveVertical(-200);
            sky.changeSize(600);
            sky.makeVisible();
            
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
            hat.moveHorizontal(-80);
            hat.moveVertical(-15);
            hat.changeSize(25, 60);
            hat.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-100);
            sun.moveVertical(-60);
            sun.changeSize(60);
            sun.makeVisible();
            
            creeperHead.changeColor("lightgreen");
            creeperHead.moveHorizontal(40);
            creeperHead.moveVertical(15);
            creeperHead.changeSize(50);
            creeperHead.makeVisible();
            
            creeperBody.changeColor("lightgreen");
            creeperBody.moveHorizontal(95);
            creeperBody.moveVertical(-20);
            creeperBody.changeSize(105, 30);
            creeperBody.makeVisible();
            
            eyeLeft.changeColor("black");
            eyeLeft.moveHorizontal(45);
            eyeLeft.moveVertical(25);
            eyeLeft.changeSize(13);
            eyeLeft.makeVisible();
            
            eyeRight.changeColor("black");
            eyeRight.moveHorizontal(70);
            eyeRight.moveVertical(25);
            eyeRight.changeSize(13);
            eyeRight.makeVisible();
            
            mouthCenter.changeColor("black");
            mouthCenter.moveHorizontal(60);
            mouthCenter.moveVertical(45);
            mouthCenter.changeSize(8);
            mouthCenter.makeVisible();
            
            mouthLeft.changeColor("black");
            mouthLeft.moveHorizontal(56);
            mouthLeft.moveVertical(50);
            mouthLeft.changeSize(6);
            mouthLeft.makeVisible();
            
            mouthRight.changeColor("black");
            mouthRight.moveHorizontal(66);
            mouthRight.moveVertical(50);
            mouthRight.changeSize(6);
            mouthRight.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        grass.changeColor("black");
        player.changeColor("black");
        hat.changeColor("black");
        sun.changeColor("black");
        
        creeperHead.changeColor("black");
        creeperBody.changeColor("black");
        eyeLeft.changeColor("white");
        eyeRight.changeColor("white");
        mouthLeft.changeColor("white");
        mouthCenter.changeColor("white");
        mouthRight.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        grass.changeColor("green");
        player.changeColor("black");
        hat.changeColor("orange");
        sun.changeColor("yellow");
        
        creeperHead.changeColor("lightgreen");
        creeperBody.changeColor("lightgreen");
        eyeLeft.changeColor("black");
        eyeRight.changeColor("black");
        mouthLeft.changeColor("black");
        mouthCenter.changeColor("black");
        mouthRight.changeColor("black");
    }
}
