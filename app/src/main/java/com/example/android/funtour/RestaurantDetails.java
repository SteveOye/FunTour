package com.example.android.funtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.funtour.Adapter.HorizontalViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDetails extends AppCompatActivity {

    HorizontalViewAdapter horizontalViewAdapter;
    private List<Data> data;
    RecyclerView photo_recyclerView;
    LinearLayoutManager horizontalLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);

        details();
        photo_recyclerView = findViewById(R.id.photo_recyclerView);
        data = fill_with_data();
        horizontalViewAdapter = new HorizontalViewAdapter(data, getApplication());
        horizontalLayoutManager= new LinearLayoutManager(RestaurantDetails.this, LinearLayoutManager.HORIZONTAL, false);
        photo_recyclerView.setLayoutManager(horizontalLayoutManager);
        photo_recyclerView.setAdapter(horizontalViewAdapter);
    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data(R.drawable.dish_1, getString(R.string.dish)));
        data.add(new Data(R.drawable.dish_2, getString(R.string.rice)));
        data.add(new Data(R.drawable.dish_3, getString(R.string.soup)));
        data.add(new Data(R.drawable.dish_4, getString(R.string.chicken)));
        data.add(new Data(R.drawable.dish_5, getString(R.string.paisa)));
        data.add(new Data(R.drawable.dish_6, getString(R.string.burger)));
        data.add(new Data(R.drawable.dish_7, getString(R.string.thieboudienne)));
        data.add(new Data(R.drawable.dish_8, getString(R.string.salad)));

        return data;
    }
    public void details(){
        /*
         *getting the museum image as the relative layout background
         * and name
         */
        final Intent currentRestuarant = getIntent();
        final Restaurant restaurant = currentRestuarant.getParcelableExtra("details");
        int imageResource = restaurant.getImageResource();
        String restaurantName = restaurant.getRestaurantName();
        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundResource(imageResource);
        TextView name = findViewById(R.id.name);
        name.setText(restaurantName);
    }
}
