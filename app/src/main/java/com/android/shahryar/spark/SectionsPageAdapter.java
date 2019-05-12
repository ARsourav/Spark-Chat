package com.android.shahryar.spark;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SectionsPageAdapter extends FragmentPagerAdapter {


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            /*case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;*/
            case 0:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;
            case 1:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            /*case 0:
                return "REQUESTS";*/
            case 0:
                return "CHATS";
            case 1:
                return "FRIENDS";
                default:
                    return null;

        }
    }
}
