package com.example.tutorial1;

import android.app.Activity;
import android.os.Bundle;


public class ActivityControls extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_textview);
    }
}
