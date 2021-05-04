import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_16 implements Initializable {

    @FXML
    private Label myLabel, myLabelCom;
    @FXML
    private Slider mySlider;

    int myTemperature;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myTemperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemperature) + " °C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                myTemperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature) + " °C");
                if (myTemperature >= 100 && myTemperature <= 120)
                    myLabelCom.setText("You boiled the water!");
                else if (myTemperature >= 1 && myTemperature <= 99)
                    myLabelCom.setText("Boiling!!!");
                else if (myTemperature <= 0 && myTemperature >= -20)
                    myLabelCom.setText("Tou freeze the water!");
                else
                    myLabelCom.setText("");
            }
        });

    }
}
