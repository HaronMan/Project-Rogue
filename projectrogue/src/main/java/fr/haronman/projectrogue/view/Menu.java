package fr.haronman.projectrogue.view;

import fr.haronman.projectrogue.controller.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader menu = new FXMLLoader(getClass().getResource("/fxml/menu.fxml"));
        Parent root = menu.load();

        Scene scene = new Scene(root);
        stage.setTitle("Project Rogue");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){launch(args);}
}
