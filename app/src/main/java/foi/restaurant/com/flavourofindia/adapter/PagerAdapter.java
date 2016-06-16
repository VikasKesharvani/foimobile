package foi.restaurant.com.flavourofindia.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import foi.restaurant.com.flavourofindia.fragment.CateringAndGroupFragment;
import foi.restaurant.com.flavourofindia.fragment.EventsFragment;
import foi.restaurant.com.flavourofindia.fragment.FoodAndSpecialFragment;
import foi.restaurant.com.flavourofindia.fragment.GalleryFragment;
import foi.restaurant.com.flavourofindia.fragment.GuestCommentFragment;
import foi.restaurant.com.flavourofindia.fragment.HomeFragment;

/**
 * Created by vikas on 4/18/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new HomeFragment();
                break;
            case 1:
                frag = new FoodAndSpecialFragment();
                break;
            case 2:
                frag = new GalleryFragment();
                break;
            case 3:
                frag = new HomeFragment();
                break;
            case 4:
                frag = new HomeFragment();
                break;
            case 5:
                frag = new GuestCommentFragment();
                break;
            case 6:
                frag = new CateringAndGroupFragment();
                break;
            case 7:
                frag = new EventsFragment();
                break;

        }
        return frag;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = " ";
        switch (position) {
            case 0:
                title = "Home";
                break;
            case 1:
                title = "Food Specials";
                break;
            case 2:
                title = "Gallery";

                break;
            case 3:
                title = "Reservation";
                break;
            case 4:
                title = "Menu & Ordering";
                break;
            case 5:
                title = "Guest Comments";
                break;
            case 6:
                title = "Catering & Groups";
                break;
            case 7:
                title = "Events";
                break;
        }

        return title;
    }
}
