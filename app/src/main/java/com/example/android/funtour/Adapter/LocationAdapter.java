package com.example.android.funtour.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.funtour.Location;
import com.example.android.funtour.R;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Location} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the ImageView in the list_item.xml layout with the location_image.
        ImageView locationImage = listItemView.findViewById(R.id.location_image);
        // Get the LocationImage from the currentLocation object and set the imageView.
        locationImage.setImageResource(currentLocation.getLocationImage());

        // Find the TextView in the list_item.xml layout with the ID locstion_name.
        TextView locationName = listItemView.findViewById(R.id.location_name);
        // Get the location name from the currentLocation object and set this text on
        // the location textView.
        locationName.setText(currentLocation.getLocationName());

        // Return the whole list item layout (containing ImageView, TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
