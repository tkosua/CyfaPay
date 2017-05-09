package com.example.theopsyphertxt.cyfapay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TheoPsyphertxt on 27/04/2017.
 */

public class FTransHistory extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_transhistory, container, false);

        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.transaction_history));


        String[] data = {
                "+45.00",
                "-65.05",
                "+150.00",
                "+300.10",
                "-13.20",
                "-5.00",
                "+10.00",
                "+20.00"
        };

        //getActivity used instead of this because of its a List fragment
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
                setListAdapter(adapter);
        return rootView;
    }
}
