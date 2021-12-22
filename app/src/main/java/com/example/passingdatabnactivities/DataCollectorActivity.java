package com.example.passingdatabnactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
public class DataCollectorActivity extends AppCompatActivity {

    String getname;
    TextView DTV;
    EditText DET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collector);

        DTV = (TextView) findViewById(R.id.TV);
        DET = (EditText) findViewById(R.id.ET1);

        Intent j = getIntent();
        getname = j.getStringExtra("name");
        getSupportActionBar().setTitle(getname);
        DTV.setText(getname);
        DET.setText(getname);
    }
}