package com.example.administrator.applicationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/24.
 */

public class HomeActivity extends AppCompatActivity {

    private TextView bmi;
    private TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setViews();

        refreshViews();
    }

    private void refreshViews() {
        double heightDouble = getIntent().getDoubleExtra("height", 0D);
        double weightDouble = getIntent().getDoubleExtra("weight", 0D);

        double bmiDouble = weightDouble / heightDouble / heightDouble;
        bmi.setText("BMI: " + bmiDouble);
        if (bmiDouble > 18.5 && bmiDouble < 25) {
            result.setText("正常");
        }
    }

    private void setViews() {
        bmi = (TextView) findViewById(R.id.bmi);
        result = (TextView) findViewById(R.id.result);
    }
}
