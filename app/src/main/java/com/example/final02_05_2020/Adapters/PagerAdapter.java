package com.example.final02_05_2020.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.final02_05_2020.Fragments.Fragment_map;
import com.example.final02_05_2020.Fragments.Fragment_notification;
import com.example.final02_05_2020.Fragments.Fragment_shop;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) { super(fm);}

    @Override
    public Fragment getItem(int i) {
        if(i == 0)
            return new Fragment_shop();
        else if (i == 1)
            return new Fragment_map();
        else
            return new Fragment_notification();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
