package fr.univ_lille1.android.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import fr.univ_lille1.android.listapplication.R;


/**
 * Created by CHARLIE on 14/10/2016.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }



 /*   @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Récupère l'item à un position précise
        Item item = getItem(position);

        // Vérifie s'il existe une view, si oui récupère la vue de la ligne pour l'item
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_item, parent, false);
        }

        // Déclare les différents champs de la vue
        TextView itemNumero = (TextView) convertView.findViewById(R.id.numero);
        TextView itemTitre = (TextView) convertView.findViewById(R.id.titre);

        // Met les éléments demandés dans les champs (NB : cela doit être une string)
        itemNumero.setText(String.valueOf(item.numero));
        itemTitre.setText(String.valueOf(item.titre));

        // Retourne la vue de la ligne
        return convertView;
    }*/

}
