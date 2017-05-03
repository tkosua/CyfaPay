package com.example.theopsyphertxt.cyfapay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by TheoPsyphertxt on 27/04/2017.
 */

public class FBuyAirtime extends Fragment {

    protected Button mSignUpButton;
    protected Button mLogInButton;
    protected TextView mPaynGoTV;
    protected TextView mForgotPWTV;
    protected EditText mMobileNumber;
    protected EditText mPassword;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_buyairtime, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.purchase_airtime));

        return rootView;
    }
}
