package com.example.lenovo.memelord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lenovo.memelord.BottomPictureFragment;
import com.example.lenovo.memelord.R;
import com.example.lenovo.memelord.TopSectionFragment;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void createMeme(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment7);
        bottomFragment.setMemeText(top, bottom);

    }
}
