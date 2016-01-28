package com.example.stallions.exercise06;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity   {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView output= (TextView)findViewById(R.id.output);
        final Button add = (Button)findViewById(R.id.add);
        final Button sub = (Button)findViewById(R.id.sub);
        final Button reset = (Button)findViewById(R.id.reset);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int output1 =Integer.valueOf(output.getText().toString());
                Values value = new Values(output1);
                String output2 = String.valueOf(value.increment());
                output.setText(output2);
            }
        });

        add.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                int output1 = Integer.valueOf(output.getText().toString());
                Values value = new Values(output1);
                String output2 = String.valueOf(value.Longincrement());
                output.setText(output2);
                return true;
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int output1 = Integer.valueOf(output.getText().toString());
                Values value = new Values(output1);
                String output2 = String.valueOf(value.decrement());
                output.setText(output2);
            }
        });

        sub.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                int output1 = Integer.valueOf(output.getText().toString());
                Values value = new Values(output1);
                String output2 = String.valueOf(value.Longdecrement());
                output.setText(output2);
                return true;
            }

        });

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int output1 = Integer.valueOf(output.getText().toString());
                Values value = new Values(output1);
                String output2 = String.valueOf(value.reset());
                output.setText(output2);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
