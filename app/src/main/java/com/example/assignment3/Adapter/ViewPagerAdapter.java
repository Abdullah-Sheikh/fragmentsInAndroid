package com.example.assignment3.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.assignment3.StudentFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new StudentFragment();
        }
        else if (position == 1)
        {
            fragment = new StudentFragment();
        }
        else if (position == 2)
        {
            fragment = new StudentFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Section A";
        }
        else if (position == 1)
        {
            title = "Section B";
        }
        else if (position == 2)
        {
            title = "Section c";
        }
        return title;
    }
}
