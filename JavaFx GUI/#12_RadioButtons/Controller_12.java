import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller_12 {

    @FXML
    private Label myLabel;
    @FXML
    private RadioButton  rButton1 , rButton11 , rButton12
                        ,rButton2 , rButton21 , rButton22
                        ,rButton3 , rButton31 , rButton32;


    public void getFood(ActionEvent event){

        if(rButton1.isSelected()){
            myLabel.setText(rButton1.getText());
        }
        else if(rButton2.isSelected()){
            myLabel.setText(rButton2.getText());
        }
        else if(rButton3.isSelected()){
            myLabel.setText(rButton3.getText());
        }
        else if(rButton11.isSelected()){
            myLabel.setText(rButton11.getText());
        }
        else if(rButton21.isSelected()){
            myLabel.setText(rButton21.getText());
        }
        else if(rButton31.isSelected()){
            myLabel.setText(rButton31.getText());
        }
        else if(rButton12.isSelected()){
            myLabel.setText(rButton12.getText());
        }
        else if(rButton22.isSelected()){
            myLabel.setText(rButton22.getText());
        }
        else if(rButton32.isSelected()){
            myLabel.setText(rButton32.getText());
        }
    }

}
