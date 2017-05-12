package com.example.pial.newtonslaw;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;


public class problems extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    boolean flag4 = false;
    boolean flag5 = false;


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        EditText mass1 = (EditText) findViewById(R.id.mid);
        EditText Mass = (EditText) findViewById(R.id.Mid);
        EditText distance = (EditText) findViewById(R.id.rid);
        EditText gravity = (EditText) findViewById(R.id.Gid);
        EditText force = (EditText) findViewById(R.id.Fid);
        TextView mass = (TextView) findViewById(R.id.textid);
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radiomid:
                if (checked)
                {
                    mass1.setEnabled(false);
                    Mass.setEnabled(true);
                    distance.setEnabled(true);
                    gravity.setEnabled(true);
                    force.setEnabled(true);
                    flag1 = true;


                    mass.setText("shit happens !!!");
                }
                    break;
            case R.id.radioMid:
                if (checked)
                {
                    mass1.setEnabled(true);
                    Mass.setEnabled(false);
                    distance.setEnabled(true);
                    gravity.setEnabled(true);
                    force.setEnabled(true);


                    //EditText Mass = (EditText) findViewById(R.id.mid);
                    mass.setText("shit doesnt happens !!!");
                }
                    // Ninjas rule
                    break;

            case R.id.radiorid:
                if (checked)
                {
                    mass.setEnabled(true);
                    Mass.setEnabled(true);
                    distance.setEnabled(false);
                    gravity.setEnabled(true);
                    force.setEnabled(true);
                    //EditText Mass = (EditText) findViewById(R.id.mid);
                    mass.setText("life sucks!!!");
                }
                // Ninjas rule
                break;

            case R.id.radioGid:
                if (checked)
                {
                    mass.setEnabled(true);
                    Mass.setEnabled(true);
                    distance.setEnabled(true);
                    gravity.setEnabled(false);
                    force.setEnabled(true);
                    //EditText Mass = (EditText) findViewById(R.id.mid);
                    mass.setText("fjeios !!!");
                }
                // Ninjas rule
                break;

            case R.id.radioFid:
                if (checked)
                {
                    mass.setEnabled(true);
                    Mass.setEnabled(true);
                    distance.setEnabled(true);
                    gravity.setEnabled(true);
                    force.setEnabled(false);
                    //EditText Mass = (EditText) findViewById(R.id.mid);
                    mass.setText("orange !!!");
                }
                // Ninjas rule
                break;
        }


    }


    public void onClickFinal(View view)
    {
        //final EditText text = (EditText) findViewById(R.id.mid);
        /*String str = mass.getText().toString();
        int num = Integer.parseInt(str);
        num = num + 10;
        str = Integer.toString(num);
        TextView text = (TextView) findViewById(R.id.printResult);
        text.setText(str);*/


        EditText mass1 = (EditText) findViewById(R.id.mid);
        EditText Mass = (EditText) findViewById(R.id.Mid);
        EditText distance = (EditText) findViewById(R.id.rid);
        EditText gravity = (EditText) findViewById(R.id.Gid);
        EditText force = (EditText) findViewById(R.id.Fid);

        TextView text = (TextView) findViewById(R.id.textid);

        if(flag1)
        {


            String str = Mass.getText().toString();
            double M = Double.parseDouble(str);

            str = distance.getText().toString();
            double r = Double.parseDouble(str);

            str = gravity.getText().toString();
            double G = Double.parseDouble(str);

            str = force.getText().toString();
            double F = Double.parseDouble(str);

            double result = (r*r*F)/(G*M);

            str = Double.toString(result);
            text.setText(str);






        }
    }











}
