package fr.haronman.projectrogue.model.Joueur;

import java.util.ArrayList;

public class Inventaire <Elt extends Comparable<Elt>> {
    ArrayList<Elt> items;

    public Inventaire(){
        items = new ArrayList<Elt>();
    }

    public void add(Elt item){
        items.add(item);
    }

    public void remove(Elt item){
        items.remove(item);
    }
}
