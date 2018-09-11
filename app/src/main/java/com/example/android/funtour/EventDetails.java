package com.example.android.funtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class EventDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);
        details();
    }

    public void details(){
        /*
         *getting the event imageselected event from the popular event activity
         * and set it as the relative layout background
         */
        final Intent currentEvent = getIntent();
        final Event event = currentEvent.getParcelableExtra("details");
        int eventImage = event.getEventImage();
        RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundResource(eventImage);
    }
}
