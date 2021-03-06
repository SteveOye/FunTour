package com.example.android.funtour;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ViewPager extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        getSupportActionBar().setElevation(0);
        // Find the view pager that will allow the user to swipe between fragments
        android.support.v4.view.ViewPager viewPager = findViewById(R.id.viewpager);

        PageAdapter adapter = new PageAdapter(this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // Find the tab layout that shows the tabs
        tabLayout = findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_weather, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_weather:
                Intent intent = new Intent(this, WeatherCondition.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_flight_land_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_event_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_museum_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_restaurant_black_24dp);
    }
}
