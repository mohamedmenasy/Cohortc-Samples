package com.greek301.tabletdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.greek301.tabletdemo.R;
import com.greek301.tabletdemo.activites.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_colors, container, false);

        Button redButton = (Button) view.findViewById(R.id.redButton);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorFroFragment("RED");
            }
        });

        Button blueButton = (Button) view.findViewById(R.id.blueButton);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorFroFragment("BLUE");
            }
        });

        Button greenBtn = (Button) view.findViewById(R.id.greenButton);
        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorFroFragment("GREEN");
            }
        });


        return view;
    }

    private void changeColorFroFragment(String colorName) {
//        MainActivity mainActivity = ((MainActivity) getActivity());
//        mainActivity.changeColor(colorName);


        ColorsFragmentCallbacks colorsFragmentCallbacks
                = (ColorsFragmentCallbacks) getActivity();
        colorsFragmentCallbacks.changeColor(colorName);
    }

    public interface ColorsFragmentCallbacks{
        public void changeColor(String colorName);
    }

}
