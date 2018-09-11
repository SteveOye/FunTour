package com.example.android.funtour.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funtour.Event;
import com.example.android.funtour.Location;
import com.example.android.funtour.R;

import java.util.ArrayList;

public class EventsAdapter extends ArrayAdapter<Event> {

    public EventsAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.events_layout, parent, false);
        }
        // Get the {@link Event} object located at this position in the list
        Event currentEvent = getItem(position);

        // Find the ImageView in the events_layout.xml layout with the events_image.
        RelativeLayout eventImage = gridItemView.findViewById(R.id.event_image);
        // Get the EventImage from the currentEvent object and set the imageView.
        eventImage.setBackgroundResource(currentEvent.getEventImage());

        // Find the TextView in the events_layout.xml layout with the ID event_name.
        TextView eventName = gridItemView.findViewById(R.id.events_name);
        // Get the event name from the currentEvent object and set this text on
        // the event textView.
        eventName.setText(currentEvent.getEventName());

        // Return the whole events layout (containing ImageView, TextViews) so that it can be shown in
        // the GridView.
        return gridItemView;
    }
}
