/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.calculadora;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 96486805234
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       try {
            Parent root = FXMLLoader.load(getClass().getResource("/br/edu/ifro/view/Login.fxml"));
            Scene scene = new Scene(root, 440, 165);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Calculadora");
            stage.show();
            stage.setResizable(false);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
