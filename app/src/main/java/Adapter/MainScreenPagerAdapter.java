package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ubn.ubn.BusFragment;
import com.ubn.ubn.CarFragment;
import com.ubn.ubn.WalkFragment;

public class MainScreenPagerAdapter extends FragmentPagerAdapter {

    public MainScreenPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return new WalkFragment();
            case 1:
                return new BusFragment();
            case 2:
                return new CarFragment();
            default: return new BusFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0: return "WALK";
            case 1: return "BUS";
            case 2: return "CAR";
            default: return "default";
        }
    }

}
