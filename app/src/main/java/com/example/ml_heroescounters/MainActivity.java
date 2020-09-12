package com.example.ml_heroescounters;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hide Actiona bar just for Main activity
        getSupportActionBar().hide();

        //Title action bar
        ((TextView) findViewById(R.id.main_toolbar_title)).setText("HEROES COUNTERS");

    }

    //Activity to go to role tank activity
    public void TANK(View view) {
        Intent activity_tank = new Intent(MainActivity.this, activity_role_tank.class);
        startActivity(activity_tank);
    }
}