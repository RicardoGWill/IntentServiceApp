package com.ricardogwill.intentserviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // This method is called by the onClick XML attribute.
    public void startTheService(View view) {
        Intent startServiceIntent = new Intent(this, MyService.class);
        startService(startServiceIntent);
    }
    // This method is called by the onClick XML attribute.
    public void stopTheService(View view) {
        Intent stopServiceIntent = new Intent(this, MyService.class);
        stopService(stopServiceIntent);
    }

}
