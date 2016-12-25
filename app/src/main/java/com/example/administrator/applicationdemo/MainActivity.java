package com.example.administrator.applicationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "MainActivity";
    private EditText height;
    private EditText weight;
    private Button compute;
    private Button linearLayout;
    private Button relativeLayout;
    private Button views;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "on create...");

        setViews();
        setListeners();
    }

    private void setListeners() {
        compute.setOnClickListener(this);
        linearLayout.setOnClickListener(this);
        relativeLayout.setOnClickListener(this);
        views.setOnClickListener(this);
    }

    private void setViews() {
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        compute = (Button) findViewById(R.id.compute);
        linearLayout = (Button) findViewById(R.id.linearLayout);
        relativeLayout = (Button) findViewById(R.id.relativeLayout);
        views = (Button) findViewById(R.id.views);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.compute:
                double heightDouble = Double.valueOf(height.getText().toString());
                double weightDouble = Double.valueOf(weight.getText().toString());

                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra("height", heightDouble);
                intent.putExtra("weight", weightDouble);
                startActivity(intent);
                break;
            case R.id.linearLayout:
                startActivity(new Intent(this, LinearLayoutActivity.class));
                break;
            case R.id.relativeLayout:
                startActivity(new Intent(this, RelativeLayoutActivity.class));
                break;
            case R.id.views:
                startActivity(new Intent(this, ViewsActivity.class));
                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "on start...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "on resume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "on pause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "on stop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "on destroy...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "on restart...");
    }
}
