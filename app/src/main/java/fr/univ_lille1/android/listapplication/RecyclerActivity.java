package fr.univ_lille1.android.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

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
/*
        // Récupérer la liste d'item
        List<Item> myItems = Item.getitems();

        // Définir le recycler view et le layout manager
        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Adapter pour la liste d'items
        mAdapter = new ItemAdapterRecycler(myItems, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);
        */

    }
}
