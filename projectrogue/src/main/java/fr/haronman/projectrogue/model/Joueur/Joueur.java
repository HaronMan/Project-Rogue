package fr.haronman.projectrogue.model.Joueur;

import fr.haronman.projectrogue.model.Item.Item;

public class Joueur {
    final String nom;
    double pv_max;
    double pv;
    Inventaire<Item> inventaire;

    public Joueur(String nom){
        this.nom = nom;
        pv_max = 100;
        pv = 100;
        inventaire = new Inventaire<Item>();
    }

}
