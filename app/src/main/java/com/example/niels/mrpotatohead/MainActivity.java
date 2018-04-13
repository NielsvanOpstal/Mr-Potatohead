package com.example.niels.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkClicked(View v) {

        // Initializes the variables
        CheckBox checkBox = (CheckBox) v;
        String text = checkBox.getText().toString();
        int id = getResources().getIdentifier(text, "id", getPackageName());
        ImageView image = findViewById(id);

        // Makes the image visible or invisible
        if (checkBox.isChecked()) {
            image.setVisibility(VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //
        ImageView Arms = findViewById(R.id.Arms);
        ImageView Ears = findViewById(R.id.Ears);
        ImageView Eyebrows = findViewById(R.id.EyeBrows);
        ImageView Eyes = findViewById(R.id.Eyes);
        ImageView Glasses = findViewById(R.id.Glasses);
        ImageView Hat = findViewById(R.id.Hat);
        ImageView Mouth = findViewById(R.id.Mouth);
        ImageView Moustache = findViewById(R.id.Moustache);
        ImageView Nose = findViewById(R.id.Nose);
        ImageView Shoes = findViewById(R.id.Shoes);

        outState.putBoolean("ArmsVis", (Arms.getVisibility() == VISIBLE));
        outState.putBoolean("EarsVis", (Ears.getVisibility() == VISIBLE));
        outState.putBoolean("EyebrowsVis", (Eyebrows.getVisibility() == VISIBLE));
        outState.putBoolean("EyesVis", (Eyes.getVisibility() == VISIBLE));
        outState.putBoolean("GlassesVis", (Glasses.getVisibility() == VISIBLE));
        outState.putBoolean("HatVis", (Hat.getVisibility() == VISIBLE));
        outState.putBoolean("MouthVis", (Mouth.getVisibility() == VISIBLE));
        outState.putBoolean("MoustacheVis", (Moustache.getVisibility() == VISIBLE));
        outState.putBoolean("NoseVis", (Nose.getVisibility() == VISIBLE));
        outState.putBoolean("ShoesVis", (Shoes.getVisibility() == VISIBLE));


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState.getBoolean("ArmsVis")) {
            findViewById(R.id.Arms).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("EarsVis")) {
            findViewById(R.id.Ears).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("EyebrowsVis")) {
            findViewById(R.id.EyeBrows).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("EyesVis")) {
            findViewById(R.id.Eyes).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("GlassesVis")) {
            findViewById(R.id.Glasses).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("HatVis")) {
            findViewById(R.id.Hat).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("MouthVis")) {
            findViewById(R.id.Mouth).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("MoustacheVis")) {
            findViewById(R.id.Moustache).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("NoseVis")) {
            findViewById(R.id.Nose).setVisibility(VISIBLE);
        }
        if (savedInstanceState.getBoolean("ShoesVis")) {
            findViewById(R.id.Shoes).setVisibility(VISIBLE);
        }
    }
}
