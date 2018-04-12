package com.example.leale.colocapp;

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

    public void planning (View view) {
        startActivity(new Intent(this, Activity2.class));
    }
    public void liste_course (View view) {

        startActivity(new Intent(this, Activity3.class));
    }
    public void money (View view) {
        startActivity(new Intent(this, Activity4.class));
    }
    public void scoreboard (View view) {
        startActivity(new Intent(this, Activity5.class));
    }
    public void nous (View view) {
        startActivity(new Intent(this, Activity6.class));
    }
}
