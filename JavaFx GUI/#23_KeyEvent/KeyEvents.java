import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class KeyEvents extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene_23.fxml"));
        Parent root = loader.load();
        Controller_23 controller = new Controller_23();


        Scene scene = new Scene(root);
//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent keyEvent) {

                scene.setOnKeyPressed(keyEvent -> {
                    
                    switch (keyEvent.getCode()) {
                case UP:
                    controller.moveUp();
                    break;
                case DOWN:
                    controller.moveDown();
                    break;
                case RIGHT:
                    controller.moveRight();
                    break;
                case LEFT:
                    controller.moveLeft();
                    break;
                default:
                    break;
            }//switch

            switch (keyEvent.getCode()) {
                case W:
                    controller.moveUp();
                    break;
                case S:
                    controller.moveDown();
                    break;
                case D:
                    controller.moveRight();
                    break;
                case A:
                    controller.moveLeft();
                    break;
                default:
                    break;

            }//switch

        });


        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
