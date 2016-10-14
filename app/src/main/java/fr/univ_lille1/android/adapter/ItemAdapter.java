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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data row_item for this position
        Item item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_item, parent, false);
        }
        // Lookup view for data population
        TextView itemNumero = (TextView) convertView.findViewById(R.id.numero);
        TextView itemTitre = (TextView) convertView.findViewById(R.id.titre);
        // Populate the data into the template view using the data object
        itemNumero.setText(String.valueOf(item.numero));
        itemTitre.setText(String.valueOf(item.titre));
        // Return the completed view to render on screen
        return convertView;
    }}
