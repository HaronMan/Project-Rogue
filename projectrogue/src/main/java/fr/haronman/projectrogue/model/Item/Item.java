package fr.haronman.projectrogue.model.Item;

public abstract class Item implements Comparable<Item> {
    String nom;
    final String type;

    public Item(String nom, String type){
        this.nom = nom;
        this.type = type;
    }

    public String getNom(){
        return nom;
    }

    @Override
    public String toString() {
        return nom+" <"+type+">";
    }

    @Override
    public int compareTo(Item o) {
        return nom.compareTo(o.nom);
    }

    @Override
    public int hashCode() {
        return (nom.length() * type.length()) + nom.hashCode();
    }
}
