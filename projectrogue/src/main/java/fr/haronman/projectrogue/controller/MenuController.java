package fr.haronman.projectrogue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class MenuController {
    private Stage stage;

    @FXML
    public void quitter(ActionEvent event){
        stage.close();
    }

    public void setStage(Stage stage) {this.stage = stage;}
}
