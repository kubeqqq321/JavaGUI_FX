import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_25 implements Initializable {

    @FXML
    private Button playButton, pauseButton, resetButton;
    @FXML
    private MediaView mediaView;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;



    public void playMedia(){
        mediaPlayer.play();
    }
    public void pauseMedia(){
        mediaPlayer.pause();
    }
    public void resetMedia(){
        if(mediaPlayer.getStatus() != MediaPlayer.Status.READY){
            mediaPlayer.seek(Duration.seconds(0.0));
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        file = new File("dinozaurPimpus.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        
    }
}
