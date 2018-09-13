package com.example.android.funtour;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funtour.Adapter.HistoricalHorizontalViewAdapter;
import com.example.android.funtour.Adapter.HorizontalViewAdapter;
import com.example.android.funtour.Adapter.HotelHorizontalViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class LocationDetails extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView textView;
    HorizontalViewAdapter horizontalViewAdapter;
    HistoricalHorizontalViewAdapter historicalHorizontalViewAdapter;
    HotelHorizontalViewAdapter hotelHorizontalViewAdapter;
    private List<Data> data;
    private List<Hotels> hotels;
    private List<HistoricalSites> historicalSites;
    RecyclerView photo_recyclerView;
    RecyclerView historical_recyclerView;
    RecyclerView hotels_recyclerView;
    LinearLayoutManager horizontalLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        photo_recyclerView = findViewById(R.id.photo_recyclerView);
        historical_recyclerView = findViewById(R.id.historical_recyclerView);
        hotels_recyclerView = findViewById(R.id.hotels_recyclerView);
        /*
         * Setting a horizontal recyclerView
         */
        data = fill_with_data();
        hotels = fill_with_hotels();
        historicalSites = fill_with_historical_sites();

        horizontalViewAdapter = new HorizontalViewAdapter(data, getApplication());
        historicalHorizontalViewAdapter = new HistoricalHorizontalViewAdapter(historicalSites, getApplication());
        hotelHorizontalViewAdapter = new HotelHorizontalViewAdapter(hotels, getApplication());

        horizontalLayoutManager = new LinearLayoutManager(LocationDetails.this, LinearLayoutManager.HORIZONTAL, false);
        photo_recyclerView.setLayoutManager(horizontalLayoutManager);
        photo_recyclerView.setAdapter(horizontalViewAdapter);
        horizontalLayoutManager = new LinearLayoutManager(LocationDetails.this, LinearLayoutManager.HORIZONTAL, false);
        historical_recyclerView.setLayoutManager(horizontalLayoutManager);
        historical_recyclerView.setAdapter(historicalHorizontalViewAdapter);
        horizontalLayoutManager = new LinearLayoutManager(LocationDetails.this, LinearLayoutManager.HORIZONTAL, false);
        hotels_recyclerView.setLayoutManager(horizontalLayoutManager);
        hotels_recyclerView.setAdapter(hotelHorizontalViewAdapter);
        details();
    }

    public void details() {
        /*
         *getting the location image and name of selected destination from the touractivity
         * and passing the to the imageView and textView on the Location details activity
         */
        final Intent info = getIntent();
        final Location location = info.getParcelableExtra("location");

        int locationImage = location.getLocationImage();
        String locationName = location.getLocationName();


        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundResource(locationImage);
        textView = findViewById(R.id.selected_name);
        textView.setText(locationName);
    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data(R.drawable.photos_1, getString(R.string.photos)));
        data.add(new Data(R.drawable.photos_2, getString(R.string.photos)));
        data.add(new Data(R.drawable.photos_3, getString(R.string.photos)));
        data.add(new Data(R.drawable.photos_1, getString(R.string.photos)));
        data.add(new Data(R.drawable.photos_2, getString(R.string.photos)));
        data.add(new Data(R.drawable.photos_3, getString(R.string.photos)));

        return data;
    }

    public List<Hotels> fill_with_hotels() {

        List<Hotels> hotels = new ArrayList<>();

        hotels.add(new Hotels(R.drawable.adina, getString(R.string.hotels)));
        hotels.add(new Hotels(R.drawable.melia, getString(R.string.hotels)));
        hotels.add(new Hotels(R.drawable.ramada, getString(R.string.hotels)));
        hotels.add(new Hotels(R.drawable.adina, getString(R.string.hotels)));
        hotels.add(new Hotels(R.drawable.melia, getString(R.string.hotels)));
        hotels.add(new Hotels(R.drawable.ramada, getString(R.string.hotels)));

        return hotels;
    }

    public List<HistoricalSites> fill_with_historical_sites() {

        List<HistoricalSites> historicalSites = new ArrayList<>();

        historicalSites.add(new HistoricalSites(R.drawable.musee_pergame_la_porte, getString(R.string.historical_site)));
        historicalSites.add(new HistoricalSites(R.drawable.museum_island, getString(R.string.historical_site)));
        historicalSites.add(new HistoricalSites(R.drawable.reichstag_building, getString(R.string.historical_site)));
        historicalSites.add(new HistoricalSites(R.drawable.brandenburg_gate, getString(R.string.historical_site)));
        historicalSites.add(new HistoricalSites(R.drawable.gendarmenmarkt, getString(R.string.historical_site)));
        historicalSites.add(new HistoricalSites(R.drawable.museum_island, getString(R.string.historical_site)));
        return historicalSites;
    }
}
