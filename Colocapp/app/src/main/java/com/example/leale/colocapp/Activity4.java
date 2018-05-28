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

        //Premier
        String m_name = "Quentin";
        final TextView m_ID_name_text = (TextView) findViewById(R.id.textView1_name);
        Button addPoint = (Button) findViewById(R.id.button1_plus);
        Button supPoint = (Button) findViewById(R.id.button1_minus);
        Button delPerso = (Button) findViewById(R.id.button1_delete);
        int m_ID_button_plus =  R.id.button1_plus;
        int m_ID_button_delete = R.id.button1_delete;
        final int m_ID_button_points = R.id.textView1_points;
        final int[] m_points_1 = {0};
        final Boolean[] m_inuse_1 = {false};
        final TextView disp_point = (TextView) findViewById(R.id.textView1_points);
        disp_point.setText("0");

        //Deuxième
        //String m_name = "Gaultier";
        final TextView m_ID_name_text_2 = (TextView) findViewById(R.id.textView2_name);
        Button addPoint_2 = (Button) findViewById(R.id.button2_plus);
        Button supPoint_2 = (Button) findViewById(R.id.button2_minus);
        Button delPerso_2 = (Button) findViewById(R.id.button2_delete);
        int m_ID_button_plus_2 =  R.id.button2_plus;
        int m_ID_button_delete_2 = R.id.button2_delete;
        final int m_ID_button_points_2 = R.id.textView2_points;
        final int[] m_points_2 = {0};
        final Boolean[] m_inuse_2 = {false};
        final TextView disp_point_2 = (TextView) findViewById(R.id.textView2_points);
        disp_point_2.setText("0");

        //Troisieme
       // String m_name = "Carl-Antoni";
        final TextView m_ID_name_text_3 = (TextView) findViewById(R.id.textView3_name);
        Button addPoint_3 = (Button) findViewById(R.id.button3_plus);
        Button supPoint_3 = (Button) findViewById(R.id.button3_minus);
        Button delPerso_3 = (Button) findViewById(R.id.button3_delete);
        int m_ID_button_plus_3 =  R.id.button3_plus;
        int m_ID_button_delete_3 = R.id.button3_delete;
        final int m_ID_button_points_3 = R.id.textView3_points;
        final int[] m_points_3 = {0};
        final Boolean[] m_inuse_3 = {false};
        final TextView disp_point_3 = (TextView) findViewById(R.id.textView3_points);
        disp_point_3.setText("0");

        //Quatrieme
       // String m_name = "Cloutier";
        final TextView m_ID_name_text_4 = (TextView) findViewById(R.id.textView4_name);
        Button addPoint_4 = (Button) findViewById(R.id.button4_plus);
        Button supPoint_4 = (Button) findViewById(R.id.button4_minus);
        Button delPerso_4 = (Button) findViewById(R.id.button4_delete);
        int m_ID_button_plus_4 =  R.id.button4_plus;
        int m_ID_button_delete_4 = R.id.button4_delete;
        final int m_ID_button_points_4 = R.id.textView4_points;
        final int[] m_points_4 = {0};
        final Boolean[] m_inuse_4 = {false};
        final TextView disp_point_4 = (TextView) findViewById(R.id.textView4_points);
        disp_point_4.setText("0");


        final EditText entry = (EditText) findViewById(R.id.editText);





        Button b = (Button) findViewById(R.id.button8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if(!m_inuse_1[0]){
                    m_ID_name_text.setText(entry.getText());
                    m_inuse_1[0] = true;
                }
                else if(!m_inuse_2[0]){
                    m_ID_name_text_2.setText(entry.getText());
                    m_inuse_2[0] = true;
                }
                else if(!m_inuse_3[0]){
                    m_ID_name_text_3.setText(entry.getText());
                    m_inuse_3[0] = true;
                }
                else if(!m_inuse_4[0]){
                    m_ID_name_text_4.setText(entry.getText());
                    m_inuse_4[0] = true;
                }

                //m_ID_name_text.setText(entry.getText());
                //m_inuse_1[0] = true;
            }
        });


        ///1
        addPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_1[0]) {
                    m_points_1[0] = m_points_1[0] + 1;
                    String s_point = Integer.toString(m_points_1[0]);
                    disp_point.setText(s_point);
                }
            }
        });
        supPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_1[0]) {
                    m_points_1[0] = m_points_1[0] - 1;
                    String s_point = Integer.toString(m_points_1[0]);
                    disp_point.setText(s_point);
                }
            }
        });

        delPerso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_points_1[0] = 0;
                String s_point = Integer.toString(m_points_1[0]);
                disp_point.setText(s_point);
                m_ID_name_text.setText("Pseudo");
                m_inuse_1[0] = false;
            }
        });

        ///2

        addPoint_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_2[0]) {
                    m_points_2[0] = m_points_2[0] + 1;
                    String s_point = Integer.toString(m_points_2[0]);
                    disp_point_2.setText(s_point);
                }
            }
        });
        supPoint_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_2[0]) {
                    m_points_2[0] = m_points_2[0] - 1;
                    String s_point = Integer.toString(m_points_2[0]);
                    disp_point_2.setText(s_point);
                }
            }
        });

        delPerso_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_points_2[0] = 0;
                String s_point = Integer.toString(m_points_2[0]);
                disp_point_2.setText(s_point);
                m_ID_name_text_2.setText("Pseudo");
                m_inuse_2[0] = false;
            }
        });

        ///3
        addPoint_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_3[0]) {
                    m_points_3[0] = m_points_3[0] + 1;
                    String s_point = Integer.toString(m_points_3[0]);
                    disp_point_3.setText(s_point);
                }
            }
        });
        supPoint_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_3[0]) {
                    m_points_3[0] = m_points_3[0] - 1;
                    String s_point = Integer.toString(m_points_3[0]);
                    disp_point_3.setText(s_point);
                }
            }
        });

        delPerso_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_points_3[0] = 0;
                String s_point = Integer.toString(m_points_3[0]);
                disp_point_3.setText(s_point);
                m_ID_name_text_3.setText("Pseudo");
                m_inuse_3[0] = false;
            }
        });

        ///4
        addPoint_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_4[0]) {
                    m_points_4[0] = m_points_4[0] + 1;
                    String s_point = Integer.toString(m_points_4[0]);
                    disp_point_4.setText(s_point);
                }
            }
        });
        supPoint_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m_inuse_4[0]) {
                    m_points_4[0] = m_points_4[0] - 1;
                    String s_point = Integer.toString(m_points_4[0]);
                    disp_point_4.setText(s_point);
                }
            }
        });

        delPerso_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_points_4[0] = 0;
                String s_point = Integer.toString(m_points_4[0]);
                disp_point_4.setText(s_point);
                m_ID_name_text_4.setText("Pseudo");
                m_inuse_4[0] = false;
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
