package com.example.android.funtour.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funtour.Event;
import com.example.android.funtour.R;
import com.example.android.funtour.Restaurant;

import java.util.ArrayList;

public class RestaurantAdapter extends ArrayAdapter<Restaurant> {
    public RestaurantAdapter(@NonNull Context context, ArrayList<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant_layout, parent, false);
        }
        // Get the {@link Restaurant} object located at this position in the list
        Restaurant currentRestaurant = getItem(position);

        // Find the ImageView in the restaurant_layout.xml.
        RelativeLayout restaurantImage = listItemView.findViewById(R.id.relativeLayout);
        // Get the Restaurant from the currentRestaurant object and set the imageView.
        restaurantImage.setBackgroundResource(currentRestaurant.getImageResource());

        // Find the TextView in the restaurant_layout.xml
        TextView restaurantName = listItemView.findViewById(R.id.restaurant_name);
        // Get the restaurantName from the currentRestaurant object and set this text on
        // the restaurant textView.
        restaurantName.setText(currentRestaurant.getRestaurantName());

        return listItemView;
    }
}
