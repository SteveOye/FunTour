package com.example.android.funtour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.funtour.Fragment.EventFragment;
import com.example.android.funtour.Fragment.TourFragment;
import com.example.android.funtour.R;

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
        } else {
            return new EventFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.destination);
        } else {
            return mContext.getString(R.string.event);
        }
    }
}
