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
import java.util.*;

public class Activity4 extends AppCompatActivity {

/*
    public class DataPerson {

        String m_name;
        int m_ID_name_text;
        int m_ID_button_minus;
        int m_ID_button_plus;
        int m_ID_button_delete;
        int m_ID_button_points;
        int m_points;
        Boolean m_inuse;


        public DataPerson(String pname, int ptext, int pminus, int pplus, int pdelete, int pbpoints)
        {
            m_name = pname;
            m_ID_name_text = ptext;
            m_ID_button_points = pbpoints;
            m_ID_button_minus = pminus;
            m_ID_button_plus = pplus;
            m_ID_button_delete = pdelete;
            m_points = 0;
            m_inuse = false;
        }
    }

    Vector <DataPerson> v_Person;

    public void initialize(){
        v_Person.add(new DataPerson("Quentin", R.id.textView1_name, R.id.button1_minus, R.id.button1_plus, R.id.button1_delete, R.id.textView1_points));
    }
*/





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

        String m_name = "Quentin";
        final TextView m_ID_name_text = (TextView) findViewById(R.id.textView1_name);
        Button addPoint = (Button) findViewById(R.id.button1_plus);
        Button supPoint = (Button) findViewById(R.id.button1_minus);
        Button delPerso = (Button) findViewById(R.id.button1_delete);
        int m_ID_button_plus =  R.id.button1_plus;
        int m_ID_button_delete = R.id.button1_delete;
        final int m_ID_button_points = R.id.textView1_points;
        final int[] m_points = {0};
        final Boolean[] m_inuse = {false};

        final EditText entry = (EditText) findViewById(R.id.editText);

        final TextView disp_point = (TextView) findViewById(R.id.textView1_points);
        disp_point.setText("0");



        Button b = (Button) findViewById(R.id.button8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_ID_name_text.setText(entry.getText());
                m_inuse[0] = true;
            }
        });

        addPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse[0]) {
                    m_points[0] = m_points[0] + 1;
                    String s_point = Integer.toString(m_points[0]);
                    disp_point.setText(s_point);
                }
            }
        });
        supPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse[0]) {
                    m_points[0] = m_points[0] - 1;
                    String s_point = Integer.toString(m_points[0]);
                    disp_point.setText(s_point);
                }
            }
        });

        delPerso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_points[0] = 0;
                String s_point = Integer.toString(m_points[0]);
                disp_point.setText(s_point);
                m_ID_name_text.setText("Pseudo");
                m_inuse[0] = false;
            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
