import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Controller_14 {

    @FXML
    private ColorPicker myColorPicker;
    @FXML
    private Pane myPane;

    public void changeColor(ActionEvent event){

        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor , CornerRadii.EMPTY, Insets.EMPTY)));

    }
}
