import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CSS_Style extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CSS_Style.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("aplication.css").toExternalForm());
            //for multiply scenes
//            String css = this.getClass().getResource("aplication.css").toExternalForm();
//            scene.getStylesheets().add(css);
//            scene2.getStylesheets().add(css);
//            scene3.getStylesheets().add(css);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
