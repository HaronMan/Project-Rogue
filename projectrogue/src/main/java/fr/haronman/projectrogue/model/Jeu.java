package fr.haronman.projectrogue.model;

import fr.haronman.projectrogue.model.Joueur.Joueur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public final class Jeu {

    Joueur joueur;

    public Jeu(Joueur joueur){
        this.joueur = joueur;
    }

    public static String getNomGeneree() throws IOException {
        String nom = "";
        ArrayList<String> lst_nom = new ArrayList<>();
        InputStream is = Jeu.class.getResourceAsStream("/names/names.txt");

        if(is != null){
            try(BufferedReader lecteur = new BufferedReader(
                    new InputStreamReader(is)
            )) {
                String ligne;
                while((ligne = lecteur.readLine()) != null){
                    lst_nom.add(ligne);
                }
                return lst_nom.get(
                        new Random().nextInt(lst_nom.size())
                );
            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            System.err.println("Fichier non recupere");
        }
        return nom;
    }

    public Joueur getJoueur() {
        return joueur;
    }
}
