



package com.sprint.gina.androidbasicsfuns2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

// an activity is a screen in your app
// AppCompatActivity is the super class, makes our app backwards compatible

// app icon from: <div>Icons made by <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivityTag";

    // there is no main() in an Android app
    // multiple entry points to the android app

    // onCreate() is a "callback"
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hello from onCreate()"); // not the androidy way
        // use Log class
        Log.d(TAG, "onCreate: hello from Log.d");

        // layout: invisible container that organizes GUI components (Views)
        // layouts inherit from ViewGroup
        // we will start with LinearLayout
        // orientation: vertical (one col)
        // horizontal (one row)
        // you can nest them

        // if we want to refer to a View we defined in XML at runtime
        // it has to have an id
        View view = findViewById(R.id.firstTextView);
        TextView textView = (TextView) view;
        Log.d(TAG, "onCreate: " + textView.getText().toString());

        // task 1: via Java, update the text to say HAPPY TUESDAY
        String text = textView.getText().toString();
        textView.setText(text.toUpperCase());
        // task 2: fix the string warning in activity_main.xml

        // task 3: try to change the app bars color to green

        // lets set a custom app icon
    }
}