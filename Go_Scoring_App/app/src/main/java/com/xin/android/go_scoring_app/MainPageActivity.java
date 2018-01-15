package com.xin.android.go_scoring_app;

/**
 * Main page that is launched at start of app.
 * Should contain Text "Tap to continue" or a button to transition to the Settings Page
 * Also contains creator and creation name.
 * Not user-specific for now.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }
}
