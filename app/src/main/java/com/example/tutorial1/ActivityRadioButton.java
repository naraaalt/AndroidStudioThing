package com.example.tutorial1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ActivityRadioButton extends Activity{
    RadioGroup rg1;
    RadioButton rb1;
    Button b1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_radiobutton);
    }

    private void addListenerRadioButton(){
        rg1 = (RadioGroup) findViewById(R.id.radioGroup);
        b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected = rg1.getCheckedRadioButtonId();
                rb1 = (RadioButton) findViewById(selected);
                Toast.makeText(ActivityRadioButton.this, rb1.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
