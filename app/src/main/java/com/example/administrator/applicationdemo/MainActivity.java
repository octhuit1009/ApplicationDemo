package com.example.administrator.applicationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private EditText height;
    private EditText weight;
    private Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
        setListeners();
    }

    private void setListeners() {
        compute.setOnClickListener(this);
    }

    private void setViews() {
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        compute = (Button) findViewById(R.id.compute);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.compute:
                double heightDouble = Double.valueOf(height.getText().toString());
                double weightDouble = Double.valueOf(weight.getText().toString());

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("height", heightDouble);
                intent.putExtra("weight", weightDouble);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
