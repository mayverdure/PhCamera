package com.example.a30032758.phcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CameraActivity extends AppCompatActivity {

    public final static String EXTRA_MYLABEL = "com.example.a30032758.phcamera.MYLABEL";
    TextView nameLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        nameLabel = (TextView) findViewById(R.id.nameLabel);

        Intent intent = getIntent();
        String label = intent.getStringExtra(MainActivity.EXTRA_MYITEM);
        TextView labelView = (TextView) findViewById(R.id.nameLabel);
        labelView.setText(label);

    }

    public void onTrendViewButtonClicked(View view) {
        Intent intent = new Intent(getApplicationContext(), HistData.class);
        String text1 = nameLabel.getText().toString();
        intent.putExtra(EXTRA_MYLABEL, text1);
        startActivity(intent);
    }

}
