import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;

public class StagesClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Stage stage = new Stage();

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("logo.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setTitle("Stage Demo program ");
        primaryStage.setWidth(420);
        primaryStage.setHeight(420);
        primaryStage.setResizable(false);
//        primaryStage.setX(50);
//        primaryStage.setY(50);

        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("You can't Escape unless you press q");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q") );


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
