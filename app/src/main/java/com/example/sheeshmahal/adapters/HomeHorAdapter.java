package com.example.sheeshmahal.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sheeshmahal.R;
import com.example.sheeshmahal.models.HomeHorModel;
import com.example.sheeshmahal.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.Viewholder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check){
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.lamb,"Lamb Chop","10:00 - 23:00","4.9","£4.95"));
            homeVerModels.add(new HomeVerModel(R.drawable.onion_bhaji,"Onion Bhaji","10:00 - 23:00","4.9","£3.95"));
            homeVerModels.add(new HomeVerModel(R.drawable.sheekkebab,"Sheek Kebab","10:00 - 23:00","4.9","£3.95"));
            homeVerModels.add(new HomeVerModel(R.drawable.prawnpuri,"King Prawn Puri","10:00 - 23:00","4.9","£4.95"));

            updateVerticalRec.callBack(position,homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    row_index = position;
                    notifyDataSetChanged();

                    if(position == 0){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.lamb,"Lamb Chop","10:00 - 23:00","4.9","£4.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.onion_bhaji,"Onion Bhaji","10:00 - 23:00","4.9","£3.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sheekkebab,"Sheek Kebab","10:00 - 23:00","4.9","£3.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.prawnpuri,"King Prawn Puri","10:00 - 23:00","4.9","£4.95"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position == 1){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.madras,"Madras","10:00 - 23:00","4.9","££6.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.masaala,"Masaala","10:00 - 23:00","4.9","£6.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.korma,"Korma","10:00 - 23:00","4.9","££6.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mgrill,"Tandoori Mixed Grill","10:00 - 23:00","4.9","£7.50"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 2){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pilaorice,"Pilau Rice","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.tikkapilao,"Tikka Pilau","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.mushroompilao,"Mushroom Pilay","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.vegpilao,"Vegetable Pilay","10:00 - 23:00","4.9","£2.95"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 3){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.plainnaan,"Plain Naan","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.keemanaan,"Keema Naan","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.garlicnaan,"Garlic Naan","10:00 - 23:00","4.9","£2.95"));
                        homeVerModels.add(new HomeVerModel(R.drawable.peshwarinaan,"Peshwari Naan","10:00 - 23:00","4.9","£2.95"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                    else if (position == 4){
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Chocolate Ice Cream","10:00 - 23:00","4.9","£5.50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Banana Ice Cream","10:00 - 23:00","4.9","£5.50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Vanilla Ice Cream","10:00 - 23:00","4.9","£5.50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"Strawberry Ice Cream","10:00 - 23:00","4.9","£5.50"));

                        updateVerticalRec.callBack(position, homeVerModels);
                    }

                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
