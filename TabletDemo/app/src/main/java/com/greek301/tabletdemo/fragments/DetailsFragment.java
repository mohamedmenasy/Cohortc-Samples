package com.greek301.tabletdemo.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greek301.tabletdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    private static final java.lang.String ARG_PARAM1 = "COLOR_NAME";
    private String mParam1;

    public DetailsFragment() {
        // Required empty public constructor
    }


    public static DetailsFragment getInstace(String colorName){
        Bundle bundle = new Bundle();
        bundle.putString(ARG_PARAM1,colorName);
        DetailsFragment detailsFragment = new DetailsFragment();
        detailsFragment.setArguments(bundle);
        return detailsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        if(getArguments().getString(ARG_PARAM1).equalsIgnoreCase("RED")){
            getView().setBackgroundColor(Color.RED);
        }
        else if(getArguments().getString(ARG_PARAM1).equalsIgnoreCase("GREEN")){
            getView().setBackgroundColor(Color.GREEN);
        }
    }

    public void setColor(String colorName){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }
}
