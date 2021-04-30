import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchingScenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene1 = new Scene(root);

            //Parent root1 = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            primaryStage.setScene(scene1);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
