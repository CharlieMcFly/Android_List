package fr.univ_lille1.android.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Déclarer notre liste
/*
        ListView listView = (ListView) findViewById(R.id.my_simple_list);
*/

        // Donner des valeurs aux éléments de notre liste
       /* String[] values = new String[] { "Item n°1",
                "Item n°2",
                "Item n°3",
                "Item n°4",
                "Item n°5",
                "Item n°6",
                "Item n°7",
                "Item n°8",
        };*/

        // Definir un nouveau adapter
        // Premier paramètre - Context
        // Deuxième paramètre - Layout pour la ligne (par défaut, celui de base)
        // Troisième paramètre - ID du text du layout
        // Quatrième - Le tableau des données
        /*final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);*/

        // Assigner l'adapter à la liste
/*
        listView.setAdapter(adapter);
*/

        // Autoriser le click sur la liste
/*
        listView.setClickable(true);
*/

        // Définir le click sur la liste
       /* listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Création d'un toast
                Toast.makeText(getApplicationContext(), "Titre : " + adapterView.getItemAtPosition(i).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
