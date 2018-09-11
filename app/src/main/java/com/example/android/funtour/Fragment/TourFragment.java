package com.example.android.funtour.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.funtour.Adapter.LocationAdapter;
import com.example.android.funtour.Location;
import com.example.android.funtour.LocationDetails;
import com.example.android.funtour.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TourFragment extends Fragment {


    public TourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_tour, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.berlin,getString(R.string.berlin) ));
        locations.add(new Location(R.drawable.italy,getString(R.string.italy) ));
        locations.add(new Location(R.drawable.moscow,getString(R.string.moscow) ));
        locations.add(new Location(R.drawable.nigeria,getString(R.string.nigeria) ));
        locations.add(new Location(R.drawable.sa,getString(R.string.sa) ));
        locations.add(new Location(R.drawable.san,getString(R.string.san) ));
        locations.add(new Location(R.drawable.paris,getString(R.string.paris) ));
        locations.add(new Location(R.drawable.rome,getString(R.string.rome) ));

        ListView listView = rootView.findViewById(R.id.listView);
        //initialize the ArrayAdapter
        LocationAdapter itemAdapter = new LocationAdapter(getActivity(), locations);
        //implementing the adapter to the list veiw
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlaying = new Intent(getActivity(), LocationDetails.class);
                nowPlaying.putExtra("location", locations.get(position));
                startActivity(nowPlaying);
            }
        });

        return rootView;
    }
}
