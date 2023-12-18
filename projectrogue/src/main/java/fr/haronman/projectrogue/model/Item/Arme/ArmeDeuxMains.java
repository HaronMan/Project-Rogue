package fr.haronman.projectrogue.model.Item.Arme;

public class ArmeDeuxMains extends Arme{

    public ArmeDeuxMains(String nom, double degats, int durabilite) {
        super(nom, "Arme 2 Mains", degats, durabilite);
    }

    @Override
    public double attaquer() {
        // TODO
        return 0;
    }

    @Override
    public double lancer() {
        // TODO
        return 0;
    }
}
