package fr.haronman.projectrogue.controller;

import fr.haronman.projectrogue.model.Jeu;
import fr.haronman.projectrogue.model.Joueur.Joueur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class CPController {

    private Stage stage;
    public TextField name;
    public Text erreur;

    @FXML
    public void verifTailleNom(KeyEvent event){
        if(!name.getText().isEmpty()){
            afficherErreur("");
        }
        int taille_max = 15;
        int curseur_pos = name.getCaretPosition();
        if (name.getText().length() > taille_max) {
            name.setText(name.getText().substring(0, taille_max));
            name.positionCaret(Math.min(curseur_pos, taille_max));
        }
    }

    @FXML
    public void genererNom(ActionEvent event) throws Exception {
        String nom_actuelle = name.getText();
        String nouveau_nom;
        while(true) {
            nouveau_nom = Jeu.getNomGeneree();
            if(!nouveau_nom.equals(nom_actuelle)){
                name.setText(nouveau_nom);
                if(!name.getText().isEmpty()){
                    afficherErreur("");
                }
                break;
            }
        }
    }

    @FXML
    public void creerJeu(ActionEvent event) throws Exception {
        if (!name.getText().matches(".*[a-zA-Z].*")) {
            afficherErreur("Entrez un nom valide !");
        } else {
            if(!name.getText().isEmpty()){
                afficherErreur("");
            }
            Jeu jeu = new Jeu(new Joueur(name.getText()));
            System.out.println(jeu.getJoueur().getNom());
        }
    }

    @FXML
    public void retourMenu(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("/fxml/menu.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);

        MenuController controller = loader.getController();
        controller.setStage(stage);

        stage.show();
    }

    public void afficherErreur(String message){
        erreur.setText(message);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
