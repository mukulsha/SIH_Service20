package com.example.android.sih_service20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceIntent = new Intent(getApplicationContext(), MyService.class);

        Toast.makeText(this, "Main Thread :" + Thread.currentThread().getId(), Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v) {

        startService(serviceIntent);
    }
}