package com.secondservestudios.carter_caves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // The GPS permissions have a line in the android Manifest


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Begin gps coordinates method
        // nofityUserMethod();

    }
}
