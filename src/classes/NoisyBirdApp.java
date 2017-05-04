package classes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;


/**
 * Created by timmitommi on 2017-05-04.
 */
public class NoisyBirdApp extends Application{

    /**
     * Settings for scene
     * @return scene with settings you want
     */
    protected Scene makeScene(){
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout, 640, 760);
        scene.getStylesheets().add(NoisyBirdApp.class.getResource("assets/stylesheets/bg.css").toExternalForm());
        return scene;
    }


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryScene) throws Exception {
        primaryScene.setTitle("Noisy Bird");
        primaryScene.setScene(makeScene());
        primaryScene.setMaximized(true);
        primaryScene.show();
    }
}
