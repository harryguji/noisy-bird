package code;


import javafx.animation.RotateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * Created by Kristoffer on 2017-05-08.
 */
public class Bird {
    protected ImageView bird;
    protected Image birdImage;
    protected double startingX;
    protected double startingY;
    protected double currentY;
    protected double speedY;
    private double gravity;
    protected boolean falling;
    private double maxSpeedY;

    public Bird(){
        birdImage = new Image("/assets/pictures/bird.png", 0, 120, true,true,true);
        bird = new ImageView(birdImage);

        startingY = Game.SCREEN_HEIGHT/6;
        startingX = Game.SCREEN_HEIGHT/6;
        currentY = startingY;
        gravity = 1;
        falling = true;
        maxSpeedY = 15;

    }

    public void fall(){
        if (falling){
            speedY += gravity;
            if (speedY > maxSpeedY){
                speedY = maxSpeedY;
            }
            currentY += speedY;

        }
    }

    public void jump(){
        if (!falling){
            speedY -= gravity;
            if(speedY < maxSpeedY){
                speedY = maxSpeedY;
            }

            currentY -= speedY;
        }
    }


}
