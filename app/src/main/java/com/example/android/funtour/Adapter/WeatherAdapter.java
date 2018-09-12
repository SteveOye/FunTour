package com.example.android.funtour.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.funtour.Location;
import com.example.android.funtour.R;
import com.example.android.funtour.Weather;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    public WeatherAdapter(@NonNull Context context, ArrayList<Weather> weathers) {
        super(context, 0, weathers);

    }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.weather_layout, parent, false);
            }

            // Get the {@link Location} object located at this position in the list
            Weather currentWeather = getItem(position);

            TextView tempText = listItemView.findViewById(R.id.temp);
            tempText.setText(currentWeather.getTemperature());

            ImageView conditionImage = listItemView.findViewById(R.id.conditionImage);
            conditionImage.setImageResource(currentWeather.getConditionImage());

            TextView condition = listItemView.findViewById(R.id.condition);
            condition.setText(currentWeather.getCondition());

            TextView location = listItemView.findViewById(R.id.location);
            location.setText(currentWeather.getLocation());

            // Return the whole list item layout (containing ImageView, TextViews) so that it can be shown in
            // the ListView.
            return listItemView;
        }
}
