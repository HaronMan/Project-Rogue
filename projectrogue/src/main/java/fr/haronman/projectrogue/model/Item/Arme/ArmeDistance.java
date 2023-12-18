package fr.haronman.projectrogue.model.Item.Arme;

public class ArmeDistance extends Arme{

    public ArmeDistance(String nom, double degats, int durabilite) {
        super(nom, "Arme Distance", degats, durabilite);
    }

    @Override
    public double attaquer() {
        // TODO
        return 0;
    }

    @Override
    public double lancer() throws WeaponException {
        throw new WeaponException("Ranged weapons not throwable");
    }
}
