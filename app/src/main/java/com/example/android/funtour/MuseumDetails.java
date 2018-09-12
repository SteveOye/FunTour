package com.example.android.funtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MuseumDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_details);

        details();
    }

    public void details(){
        /*
         *getting the museum image as the relative layout background
         */
        final Intent currentMuseum = getIntent();
        final Museum museum = currentMuseum.getParcelableExtra("details");
        int museumImage = museum.getImageResource();
        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundResource(museumImage);
    }
}
