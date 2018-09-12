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
import com.example.android.funtour.EventDetails;
import com.example.android.funtour.Museum;
import com.example.android.funtour.Adapter.MuseumAdapter;
import com.example.android.funtour.MuseumDetails;
import com.example.android.funtour.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }

    GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_museum, container, false);

        final ArrayList<Museum> museums = new ArrayList<>();
        museums.add(new Museum(R.drawable.national_gallery, getString(R.string.national_gallery)));
        museums.add(new Museum(R.drawable.museo_del_prado,getString(R.string.mdp)));
        museums.add(new Museum(R.drawable.vatican_museum, getString(R.string.vatican_museum)));
        museums.add(new Museum(R.drawable.metropolitan_museum_of_art, getString(R.string.mmoa)));
        museums.add(new Museum(R.drawable.national_gallery, getString(R.string.national_gallery)));
        museums.add(new Museum(R.drawable.museo_del_prado,getString(R.string.mdp)));
        museums.add(new Museum(R.drawable.vatican_museum, getString(R.string.vatican_museum)));
        museums.add(new Museum(R.drawable.metropolitan_museum_of_art, getString(R.string.mmoa)));

        gridView = rootView.findViewById(R.id.museum_view);

        MuseumAdapter itemAdapter = new MuseumAdapter(getActivity(), museums);

        gridView.setAdapter(itemAdapter);
        /* Setting onItemClickListener on the GridView item */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent currentMuseum = new Intent(getActivity(), MuseumDetails.class);
                currentMuseum.putExtra("details", museums.get(position));
                startActivity(currentMuseum);
            }
        });
        return rootView;
    }
}
