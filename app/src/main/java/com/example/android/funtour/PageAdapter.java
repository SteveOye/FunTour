package com.example.android.funtour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.funtour.Fragment.EventFragment;
import com.example.android.funtour.Fragment.MuseumFragment;
import com.example.android.funtour.Fragment.RestaurantFragment;
import com.example.android.funtour.Fragment.TourFragment;

public class PageAdapter extends FragmentPagerAdapter {

    /*
     * Context of the app
     */
    private Context mContext;

    public PageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TourFragment();
        } else if (position == 1){
            return new EventFragment();
        } else if (position == 2){
            return new MuseumFragment();
        } else {
            return new RestaurantFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }
}
