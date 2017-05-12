package com.example.pial.newtonslaw;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class exploreNewton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_newton);
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


    }

    public void onClickLaw(View view)
    {
        Intent i = new Intent(this,laws.class);
        startActivity(i);

    }


    public void onClickExplain(View view)
    {
        Intent i = new Intent(this,explanation.class);
        startActivity(i);
    }

    public void onClickProblem(View view)
    {
        Intent i = new Intent(this,problems.class);
        startActivity(i);
    }

}
