package fr.univ_lille1.android.listapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.univ_lille1.android.adapter.Item;
import fr.univ_lille1.android.adapter.ItemAdapter;

public class ListAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter);


        ArrayList<Item> items = Item.getitems();
        ItemAdapter adapter = new ItemAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.my_adapter_list);
        listView.setAdapter(adapter);

    }
}
