package com.ubn.ubn;


import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class CarFragment extends android.support.v4.app.Fragment {

    public CarFragment() {
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

        final View rootView = inflater.inflate(R.layout.car_layout, container, false);

        return rootView;
    }
}
