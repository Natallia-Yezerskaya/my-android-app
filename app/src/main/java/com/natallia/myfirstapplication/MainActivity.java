package com.natallia.myfirstapplication;

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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            TextView textView  = (TextView)findViewById(R.id.textView);
            TextView textView2  = (TextView)findViewById(R.id.textView2);
                CharSequence text = textView2.getText();
                textView2.setText(textView.getText());
                textView.setText(text);
            }
        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                CharSequence text = textView2.getText();
                textView2.setText(textView.getText());
                textView.setText(text);
            }
        };

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(listener);


    }


    @Override
    public void onClick(View v) {
        TextView textView  = (TextView)findViewById(R.id.textView);
        TextView textView2  = (TextView)findViewById(R.id.textView2);
        CharSequence text = textView2.getText();
        textView2.setText(textView.getText());
        textView.setText(text);
    }
}
