/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author JDonald
 */
public class Login extends Application{

    public static void main(String[] args) {
        launch(args);     

        Model.NewHibernateUtil.StopConnectionProvider();
    }

    @Override
    public void start(Stage stage) throws Exception {
       

        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));


        Scene scene = new Scene(root);

        stage.setMaximized(true);
        stage.setTitle("Login Centro Medico");
        stage.setScene(scene);
        stage.show();
    }
}
