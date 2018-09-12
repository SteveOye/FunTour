package com.example.android.funtour.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.funtour.Adapter.EventsAdapter;
import com.example.android.funtour.Event;
import com.example.android.funtour.EventDetails;
import com.example.android.funtour.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_popular_events, container, false);

        final ArrayList<Event> events = new ArrayList<>();
        events.add(new Event(R.drawable.berlin,getString(R.string.festival)));
        events.add(new Event(R.drawable.nigeria,getString(R.string.event)));
        events.add(new Event(R.drawable.moscow,getString(R.string.festival)));
        events.add(new Event(R.drawable.reichstag_building,getString(R.string.event)));
        events.add(new Event(R.drawable.rome,getString(R.string.festival)));
        events.add(new Event(R.drawable.brandenburg_gate,getString(R.string.event)));
        events.add(new Event(R.drawable.adina,getString(R.string.festival)));
        events.add(new Event(R.drawable.gendarmenmarkt,getString(R.string.event)));
        events.add(new Event(R.drawable.italy,getString(R.string.festival)));
        events.add(new Event(R.drawable.melia,getString(R.string.event)));

        gridView = rootView.findViewById(R.id.popular_events);

        EventsAdapter itemAdapter = new EventsAdapter(getActivity(), events);

        gridView.setAdapter(itemAdapter);

        /* Setting onItemClickListener on the GridView item */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent currentEvent = new Intent(getActivity(), EventDetails.class);
                currentEvent.putExtra("details", events.get(position));
                startActivity(currentEvent);
            }
        });
        return rootView;
    }

}
