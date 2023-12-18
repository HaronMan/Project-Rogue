package fr.haronman.projectrogue.model.Item.Arme;

import fr.haronman.projectrogue.model.Item.Item;

public abstract class Arme extends Item {
    double degats;
    int durabilite_max;
    int durabilite;

    public Arme(String nom, String type, double degats, int durabilite) {
        super(nom, type);
        this.degats = degats;
        this.durabilite_max = durabilite;
        this.durabilite = durabilite;
    }

    public abstract double attaquer();
    public abstract double lancer() throws WeaponException;
}
