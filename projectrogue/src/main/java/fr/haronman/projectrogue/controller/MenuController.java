package fr.haronman.projectrogue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class MenuController {
    private Stage stage;

    @FXML
    public void nouvellePartie(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(getClass().getResource("/fxml/creation_perso.fxml"))
        );

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    public void quitter(ActionEvent event){
        stage.close();
    }

    public void setStage(Stage stage) {this.stage = stage;}
}
