package com.example.theopsyphertxt.cyfapay;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by TheoPsyphertxt on 26/04/2017.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
        case 0:
            return new FTransHistory();
        case 1:
            return new FBuyAirtime();
        case 2:
            return new FMPayment();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Shows total number of pages currently 3.
        return 3 ;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.transaction_history).toUpperCase();
            case 1:
                return mContext.getString(R.string.purchase_airtime).toUpperCase();
            case 2:
                return mContext.getString(R.string.make_payment).toUpperCase();
        }
        return null;
    }
}