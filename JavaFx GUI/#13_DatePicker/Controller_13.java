import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Controller_13 {

    @FXML
    private Label myLabel;
    @FXML
    private javafx.scene.control.DatePicker myDatePicker;

    public void getDate(ActionEvent event){

        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
//         myLabel.setText(myDate.toString());
        myLabel.setText(myFormattedDate);
    }


}
