package com.greek301.tabletdemo.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.greek301.tabletdemo.R;
import com.greek301.tabletdemo.fragments.BlankFragment;
import com.greek301.tabletdemo.fragments.ColorsFragment;
import com.greek301.tabletdemo.fragments.DetailsFragment;

public class MainActivity extends AppCompatActivity implements ColorsFragment.ColorsFragmentCallbacks {

    private boolean isTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.detailFragmentContainer) == null){
            //Mobile
            isTablet = false;
        }
        else{
            isTablet = true;
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.detailFragmentContainer,new DetailsFragment())
//                    .commit();
        }
    }

    public void changeColor(String colorName){
        if(isTablet){
            DetailsFragment detailsFragment = DetailsFragment.getInstace(colorName);
            getSupportFragmentManager()
                    .beginTransaction()
//                    .addToBackStack(null)
                    .replace(R.id.detailFragmentContainer,detailsFragment)
                    .commit();
        }
        else{
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("COLOR",colorName);
            startActivity(intent);
        }
    }
}
