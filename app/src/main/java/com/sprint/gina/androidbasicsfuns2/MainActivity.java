



package com.sprint.gina.androidbasicsfuns2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// an activity is a screen in your app
// AppCompatActivity is the super class, makes our app backwards compatible

public class MainActivity extends AppCompatActivity {

    // there is no main() in an Android app
    // multiple entry points to the android app

    // onCreate() is a "callback"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}