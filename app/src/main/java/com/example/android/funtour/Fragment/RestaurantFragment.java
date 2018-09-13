package com.example.android.funtour.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.funtour.Adapter.EventsAdapter;
import com.example.android.funtour.Adapter.RestaurantAdapter;
import com.example.android.funtour.Event;
import com.example.android.funtour.EventDetails;
import com.example.android.funtour.R;
import com.example.android.funtour.Restaurant;
import com.example.android.funtour.RestaurantDetails;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);

        final ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.le_train_bleu, getString(R.string.le_train_bleu)));
        restaurants.add(new Restaurant(R.drawable.upper_bloem_best_restaurants_cape_town, getString(R.string.upper_bloem)));
        restaurants.add(new Restaurant(R.drawable.ciao_italy, getString(R.string.ciao)));
        restaurants.add(new Restaurant(R.drawable.ristorante_la_sponda, getString(R.string.sponda)));
        restaurants.add(new Restaurant(R.drawable.tsentralny_dom_literatorov, getString(R.string.literatorov)));
        restaurants.add(new Restaurant(R.drawable.mauve_lounge_restaurant_ibadan, getString(R.string.mauve)));

        listView = rootView.findViewById(R.id.listView);

        RestaurantAdapter itemAdapter = new RestaurantAdapter(getActivity(), restaurants);

        listView.setAdapter(itemAdapter);

        /* Setting onItemClickListener on the GridView item */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent currentRestaurant = new Intent(getActivity(), RestaurantDetails.class);
                currentRestaurant.putExtra("details", restaurants.get(position));
                startActivity(currentRestaurant);
            }
        });
        return rootView;
    }
}
