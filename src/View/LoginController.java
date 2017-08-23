/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Pojo.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.media.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author JDonald
 */
public class LoginController implements Initializable {

    @FXML
    private Rectangle rctLogin;
    @FXML
    private Pane pnlSesion;
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnAccess;
    @FXML
    private MediaView viewVideo;
    @FXML
    private AnchorPane anchorMain;
    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        rctLogin.setOpacity(0);
        pnlSesion.setVisible(false);

        String urlVideo = "file:/C:/Users/JDonald/Documents/NetBeansProjects/ProjectDataBase/src/Resource/Plexus.mp4";
        Media media = new Media(urlVideo);

        viewVideo.setFitHeight(anchorMain.getHeight());

        MediaPlayer player = new MediaPlayer(media);
        viewVideo.setMediaPlayer(player);
        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.play();
    }

    @FXML
    private void SlideRigthLogin(ActionEvent event) {
        FadeTransition fade = new FadeTransition(Duration.millis(300), rctLogin);
        fade.setToValue(0.8);

        TranslateTransition side = new TranslateTransition(Duration.millis(300), rctLogin);
        side.setFromX(0);
        side.setToX(400);

        side.setInterpolator(Interpolator.LINEAR);

        ParallelTransition par = new ParallelTransition(side, fade);
        par.play();

        pnlSesion.setVisible(true);

    }

    @FXML
    private void SlideLeftLogin(ActionEvent event) {
        FadeTransition fade = new FadeTransition(Duration.millis(300), rctLogin);
        fade.setToValue(0.0);

        TranslateTransition side = new TranslateTransition(Duration.millis(300), rctLogin);
        side.setFromX(0);
        side.setToX(-400);

        side.setInterpolator(Interpolator.LINEAR);

        ParallelTransition par = new ParallelTransition(side, fade);
        par.play();

        pnlSesion.setVisible(false);

    }

    @FXML
    private void AccessMainWindow(ActionEvent event) throws IOException {

        Controller.LoginController user = new Controller.LoginController();
        if (!txtPassword.equals("") && !txtUser.equals("")) {

            System.out.println(txtPassword.getText() + " " + txtUser.getText());
            boolean key = user.AccessSystem(txtUser.getText().trim(), txtPassword.getText().trim());

            if (key == true) {

                Stage stage = new Stage();
                Parent root;

                root = FXMLLoader.load(getClass().getResource("Main.fxml"));
                Scene scene = new Scene(root);

                stage.setScene(scene);
                stage.setMaximized(true);
                stage.show();
                
                System.out.println("Donald Jose Munguia Guadamuz Ingresó con Exito...!");
            } else {
                System.out.println("Ni modo sos peluche");
            }

        }
    }

}
