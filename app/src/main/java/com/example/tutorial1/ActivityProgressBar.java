package com.example.tutorial1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class ActivityProgressBar extends Activity{
    Button b1;
    private ProgressDialog progress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_progressbar);
        b1 = (Button) findViewById(R.id.button2);
    }

    public void download (View view){
        progress =  new ProgressDialog(this);
        progress.setMessage("Downloading Music");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setIndeterminate(true);
        progress.setProgress(0);
        progress.show();

        final int totalProgressTime = 100;
        final Thread t = new Thread() {
            @Override
            public void run (){
                int jumpTime = 0;

                while (jumpTime < totalProgressTime){
                    try{
                        sleep(200);
                        jumpTime += 5;
                        progress.setProgress(jumpTime);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
    }
}
