import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller_11 {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("bulb_off.png"));
    Image myImage2 = new Image(getClass().getResourceAsStream("bulb_on.png"));

    public void change(ActionEvent event) {

        if (myCheckBox.isSelected()) {
            myLabel.setText("ON");
            System.out.println("ON");
            myImageView.setImage(myImage2);
        } else {

            myLabel.setText("OFF");
            System.out.println("OFF");
            myImageView.setImage(myImage1);
        }

    }

}
