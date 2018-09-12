package com.example.android.funtour.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funtour.Museum;
import com.example.android.funtour.R;

import java.util.ArrayList;

public class MuseumAdapter extends ArrayAdapter<Museum> {

    public MuseumAdapter(Context context, ArrayList<Museum> museums) {
        super(context, 0, museums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.museum_layout, parent, false);
        }
        // Get the {@link Museum} object located at this position in the list
        Museum currentMuseum = getItem(position);

        // Find the RelativeLayout in the museum_layout.xml layout with the museum_Inage.
        RelativeLayout relativeLayout = gridItemView.findViewById(R.id.museum_image);
        // Get the museum image from the currentMuseum object and set the relativeLayout.
        relativeLayout.setBackgroundResource(currentMuseum.getImageResource());

        // Find the TextView in the events_layout.xml layout with the ID event_name.
        TextView museumName = gridItemView.findViewById(R.id.museum_name);
        // Get the museum name from the currentMuseum object and set this text on
        // the event textView.
        museumName.setText(currentMuseum.getMuseumName());

        return gridItemView;
    }
}
