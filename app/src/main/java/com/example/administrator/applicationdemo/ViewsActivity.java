package com.example.administrator.applicationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Administrator
 * 2016/12/25
 */
public class ViewsActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView progressText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        progressText = (TextView) findViewById(R.id.progress_text);

        seekBar.setMax(100);
        seekBar.setProgress(95);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.e(MainActivity.TAG, "changed: " + progress);
                progressText.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e(MainActivity.TAG, "start...");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.e(MainActivity.TAG, "stop...");
            }
        });
    }
}
