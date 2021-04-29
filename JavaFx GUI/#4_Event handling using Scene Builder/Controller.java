import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(javafx.event.ActionEvent e) {
//        System.out.println("UP");
        myCircle.setCenterY(y-=2);
    }

    public void down(javafx.event.ActionEvent e) {
//        System.out.println("DOWN");
        myCircle.setCenterY(y+=2);
    }

    public void left(javafx.event.ActionEvent e) {
//        System.out.println("LEFT");
        myCircle.setCenterX(x-=2);
    }

    public void right(javafx.event.ActionEvent e) {
//        System.out.println("RIGHT");
        myCircle.setCenterX(x+=2);
    }


}
