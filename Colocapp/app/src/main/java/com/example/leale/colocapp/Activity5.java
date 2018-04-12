package com.example.leale.colocapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import android.view.View;

public class Activity5 extends AppCompatActivity {

    Button addPeople = null;

    EditText nameEnter = null;

    TextView textResult = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ///Code default
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ///Fin code defaut



        // On récupère le bouton par son identifiant
        addPeople = (Button) findViewById(R.id.ButtonValidEntryName);
        // On récupère le textedit par son identifiant
        nameEnter = (EditText)findViewById(R.id.EntryNameString);

        //test si le bouton marche
        textResult = (TextView)findViewById(R.id.textTestButton);


        // Puis on lui indique que cette classe sera son listener pour l'évènement Touch
        addPeople.setOnClickListener(envoyerListener);
    };

    // Uniquement pour le bouton "envoyer"
    private OnClickListener envoyerListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            textResult.setText(nameEnter.getText().toString());
        }
    };

}
