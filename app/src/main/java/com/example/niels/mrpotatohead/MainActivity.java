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

        // Saves the a TRUE in outState when visible and FALSE when invisible
        outState.putBoolean("ArmsVis", (findViewById(R.id.Arms).getVisibility() == VISIBLE));
        outState.putBoolean("EarsVis", (findViewById(R.id.Ears).getVisibility() == VISIBLE));
        outState.putBoolean("EyebrowsVis", (findViewById(R.id.EyeBrows).getVisibility() == VISIBLE));
        outState.putBoolean("EyesVis", (findViewById(R.id.Eyes).getVisibility() == VISIBLE));
        outState.putBoolean("GlassesVis", (findViewById(R.id.Glasses).getVisibility() == VISIBLE));
        outState.putBoolean("HatVis", (findViewById(R.id.Hat).getVisibility() == VISIBLE));
        outState.putBoolean("MouthVis", (findViewById(R.id.Mouth).getVisibility() == VISIBLE));
        outState.putBoolean("MoustacheVis", (findViewById(R.id.Moustache).getVisibility() == VISIBLE));
        outState.putBoolean("NoseVis", (findViewById(R.id.Nose).getVisibility() == VISIBLE));
        outState.putBoolean("ShoesVis", (findViewById(R.id.Shoes).getVisibility() == VISIBLE));


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Checks and restores the visibility of the images when device is turned
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
