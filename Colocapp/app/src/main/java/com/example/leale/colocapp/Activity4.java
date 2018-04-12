package com.example.leale.colocapp;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {



    public class DataPerson {

        string m_name;
        int m_ID_name_text;
        int m_ID_button_minus;
        int m_ID_button_plus;
        int m_ID_button_delete;
        int m_ID_button_points;
        int m_points;
        bool m_inuse;

        public DataPerson();
        public DataPerson(String pname, int ptext, int pminus, int pplus, int pdelete, int pbpoints)
        {
            m_name = pname;
            m_ID_name_text = ptext;
            m_ID_button_points = pbpoints;
            m_ID_button_minus = pminus;
            m_ID_button_plus = pplus;
            m_ID_button_delete = pdelete;
            m_points = 0
            m_inuse = false;
        }
    }

    vector <DataPerson> v_Person;

    public void initialize(){
        v_Person.add(new DataPerson("Quentin", R.id.textView1_name, R.id.button1_minus, R.id.button1_plus, R.id.button1_delete, R.id.textView1_points));
    }

    initialize();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
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

        final EditText entry = (EditText) findViewById(R.id.editText);

        final TextView result = (TextView) findViewById(R.id.textView4);


        Button b = (Button) findViewById(R.id.button8);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(entry.getText());
            }
        });


            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
