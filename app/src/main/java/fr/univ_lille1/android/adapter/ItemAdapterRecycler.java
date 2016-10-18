package fr.univ_lille1.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

import fr.univ_lille1.android.listapplication.R;

/**
 * Created by Charlie on 17/10/2016.
 */

public class ItemAdapterRecycler extends RecyclerView.Adapter<ItemAdapterRecycler.MyViewHolder> {

        private List<Item> itemsList;
        private Context context;

        public class MyViewHolder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener{
            public TextView numero, titre ;

            public MyViewHolder(View view) {
                super(view);
                numero = (TextView) view.findViewById(R.id.numero_recycler);
                titre = (TextView) view.findViewById(R.id.titre_recycler);
                view.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {

                Toast.makeText(context, "titre : " + titre.getText() , Toast.LENGTH_SHORT).show();

            }
        }

        public ItemAdapterRecycler(List<Item> itemsList, Context ctx) {
            this.itemsList = itemsList;
            this.context = ctx;
        }


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Item item = itemsList.get(position);
            holder.numero.setText(String.valueOf(item.numero));
            holder.titre.setText(String.valueOf(item.titre));
        }

        @Override
        public int getItemCount() {
            return itemsList.size();
        }
}
