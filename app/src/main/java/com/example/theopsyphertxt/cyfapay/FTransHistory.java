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
                "D_45.00",
                "C_65.05",
                "C_150.00",
                "C_300.10",
                "D_13.20",
                "D_5.00",
                "C_10.00"
        };

        //getActivity used instead of this because of its a List fragment
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
                setListAdapter(adapter);
        return rootView;
    }
}
