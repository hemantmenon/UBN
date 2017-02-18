package com.ubn.ubn;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BusFragment extends Fragment {

    public BusFragment() {
        /**
         * NO ARGUMENTS CONSTRUCTOR
         */
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    @TargetApi(23)
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        final View rootView = inflater.inflate(R.layout.bus_layout, container, false);

        return rootView;
    }

}
