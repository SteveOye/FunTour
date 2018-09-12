package com.example.android.funtour;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.funtour.Adapter.WeatherAdapter;

import java.util.ArrayList;

public class WeatherCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String temp = "24";
        String temperature = temp + "\u2109";
        setContentView(R.layout.activity_weather_condition);
        final ArrayList<Weather> weathers = new ArrayList<>();
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_day_2671737, getString(R.string.cloudy),  getString(R.string.sa)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_rainy_snowy_night_2671747, getString(R.string.clouldy_rainy_snowy),  getString(R.string.san)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_snowy_night_2671745, getString(R.string.cloudy_snowy),  getString(R.string.berlin)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_storm_2671744, getString(R.string.cloudy_storm),  getString(R.string.moscow)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_sunny_2671740, getString(R.string.sunny),  getString(R.string.nigeria)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_day_2671737, getString(R.string.cloudy),  getString(R.string.vernice)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_rainy_snowy_night_2671747, getString(R.string.clouldy_rainy_snowy),  getString(R.string.italy)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_snowy_night_2671745, getString(R.string.cloudy_snowy),  getString(R.string.rome)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_cloudy_storm_2671744, getString(R.string.cloudy_storm),  getString(R.string.paris)));
        weathers.add(new Weather(temperature, R.drawable.ic_if_sunny_2671740, getString(R.string.sunny),  getString(R.string.sa)));
        ListView listView = findViewById(R.id.listView);
        //initialize the ArrayAdapter
        WeatherAdapter itemAdapter = new WeatherAdapter(this, weathers);
        //implementing the adapter to the list veiw
        listView.setAdapter(itemAdapter);
    }
}
