package fr.univ_lille1.android.adapter;

import java.util.ArrayList;

/**
 * Created by CHARLIE on 14/10/2016.
 */

public class Item {

    public int numero;
    public String titre;

    public Item(int num, String titre) {
        this.numero = num;
        this.titre = titre;
    }

    public static ArrayList<Item> getitems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "First item"));
        items.add(new Item(2, "Second item"));
        items.add(new Item(3, "Third item"));
        return items;
    }

}