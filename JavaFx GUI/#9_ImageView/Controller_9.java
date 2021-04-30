import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller_9 {

    //ImageView is a Node used for painting images loaded with Images

    //Image = photography

    //ImageView = picture in frame

    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("shrek2.png"));

    public void displayImage(){
        myImageView.setImage(myImage);

    }


}
