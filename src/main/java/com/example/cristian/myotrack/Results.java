package com.example.cristian.myotrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        getSupportActionBar().setTitle("Results");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //TextView textView = (TextView) findViewById(R.id.LevelOfEngagementTitle);
        //textView.setText("AbhiAndroid"); //set text for text view
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.results_menu, menu);
        return true;
    }
}