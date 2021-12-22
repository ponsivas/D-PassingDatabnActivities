package com.example.passingdatabnactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText CT_ET;
    Button PS_DA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CT_ET = findViewById(R.id.ET);
        PS_DA = findViewById(R.id.PDSA);

        PS_DA.setOnClickListener(view -> {

            if(CT_ET.getHint().length() != 0) {
                if (CT_ET.getText().length() == 0) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter Your Name in the Text box and press Pass Data to Second Activity - Button", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    String NAME;
                    Toast toast = Toast.makeText(getApplicationContext(), "Moving to DataCollectorActivity - Exiting the MainActivity - Thank you", Toast.LENGTH_LONG);
                    toast.show();
                    NAME = CT_ET.getText().toString();
                    Intent i = new Intent(MainActivity.this, DataCollectorActivity.class);
                    i.putExtra("name", NAME);
                    startActivity(i);
                }
            }
        });
    }
}