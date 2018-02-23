package com.example.a30032758.phcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HistData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hist_data);

        Intent intent = getIntent();
        String label = intent.getStringExtra(CameraActivity.EXTRA_MYLABEL);
        TextView labelView = (TextView) findViewById(R.id.labelView);
        labelView.setText(label);

    }
}
