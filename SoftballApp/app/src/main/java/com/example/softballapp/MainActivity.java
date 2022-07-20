package com.example.softballapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SecondClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Second Clicked", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void ThirdClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Third Clicked", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void FirstClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "First Clicked", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void HomeClicked(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Home Clicked", Toast.LENGTH_SHORT);
        toast.show();
    }
}