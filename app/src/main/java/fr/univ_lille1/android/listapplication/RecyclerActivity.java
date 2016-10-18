package fr.univ_lille1.android.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import fr.univ_lille1.android.adapter.Item;
import fr.univ_lille1.android.adapter.ItemAdapterRecycler;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

       /* // Déclarer le recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.list);

        // Déclarer notre layoutManager
        mLayoutManager = new LinearLayoutManager(this);
        // Set le layoutManager à notre recycler
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Création de notre Adapter(list d'item, listener)
        mAdapter = new ItemAdapterRecycler(Item.getitems(), this);

        // Ajouter l'adapter à notre recycler view
        mRecyclerView.setAdapter(mAdapter);*/

    }
}
