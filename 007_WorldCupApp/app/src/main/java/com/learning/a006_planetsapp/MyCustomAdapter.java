package com.learning.a006_planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Country> {
    /* Custom Layout demands Custom Adapter
     * Custom Object (Planet) demands ArrayAdapter, instead of Base Adapter (for primitives)
     */
    private ArrayList<Country> countryArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Country> data, Context context1) {
        super(context1, R.layout.item_list_layout, data);
        this.countryArrayList = data;
        this.context = context1;
    }

    private static class MyViewHolder{
        /* Used to cache references to view within an item layout, so that
         * they don't need to be repeatedly looked up during scrolling.
         * This is needed because we are using Customer Adapter
         */

        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        Country countries = getItem(position);

        // Check if an existing view is recycled or if it needs to be inflated
        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.countryName);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.numberOfWins);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.countryFlag);

            result = convertView;

            convertView.setTag(myViewHolder);
        }
        else{
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        // Get the data from the model class
        myViewHolder.planetName.setText(countries.getCountryName());
        myViewHolder.moonCount.setText(countries.getWins());
        myViewHolder.planetImg.setImageResource(countries.getFlagImg());

        return result;

    }
}
