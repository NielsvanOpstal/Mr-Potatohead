package com.example.niels.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        CheckBox checkBox = (CheckBox) v;
        String text = "";

        Log.d("potato", "checkClicked: ");
        if (checkBox.isChecked()) {
            text = checkBox.getText().toString();
        }

        System.out.println(text);
    }
}
