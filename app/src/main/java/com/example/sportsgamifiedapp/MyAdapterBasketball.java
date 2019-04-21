package com.example.sportsgamifiedapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

        import java.util.ArrayList;

public class MyAdapterBasketball extends RecyclerView.Adapter<MyAdapterBasketball.ItemHolder>{

    private ArrayList<ListItem> itemsList;
    private Context mContext;

    public MyAdapterBasketball(ArrayList<ListItem> itemsList, Context context) {
        this.itemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the layout view you have created for the list rows here
        View view = layoutInflater.inflate(R.layout.recycler_view, parent, false);
        return new ItemHolder(view);
    }

    @Override
    public int getItemCount() {
        return itemsList == null? 0: itemsList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, final int position) {
        final ListItem item = itemsList.get(position);

        // Set the data to the views here
        holder.setItemName(item.getItemName());
        holder.setLocked(item.getLocked());
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView txtItemName;
        private TextView txtLocked;

        public ItemHolder(View itemView) {
            super(itemView);
            txtItemName = itemView.findViewById(R.id.txt_itemName);
            txtLocked = itemView.findViewById(R.id.txt_locked);

            mContext = itemView.getContext();
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch(getAdapterPosition()) {
                case 0:
                    intent = new Intent(mContext, RulesActivity.class);
                    mContext.startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(mContext, TeamsActivity.class);
                    mContext.startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(mContext, QuizActivity.class);
                    mContext.startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(mContext, LiveScoreActivity.class);
                    mContext.startActivity(intent);
                    break;
                default:
                    break;
            }
        }

        public void setItemName(String name) {
            txtItemName.setText(name);
        }

        public void setLocked(String locked) {
            txtLocked.setText(locked);
        }

    }
}
