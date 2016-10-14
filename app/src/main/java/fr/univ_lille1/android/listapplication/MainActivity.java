package fr.univ_lille1.android.listapplication;

import android.content.Intent;
import android.os.Bundle;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import fr.univ_lille1.android.recyler.ItemFragment;


public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            Déclaration de mes boutons
         */
        Button listSimpleButton = (Button) findViewById(R.id.btn_list_simple);
        Button listAdapterButton = (Button) findViewById(R.id.btn_list_adapter);
        Button recyclerButton = (Button) findViewById(R.id.btn_recycler_adapter);

        listSimpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
            }
        });

        listAdapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListAdapterActivity.class);
                startActivity(intent);
            }
        });

        recyclerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecyclerActivity.class);
                startActivity(intent);
            }
        });

    }



}
