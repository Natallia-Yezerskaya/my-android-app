package com.test.myapplicationtest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);


            }
        });

       Log.d("AAA", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAA", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAA", "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAA", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAA", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAA", "onDestroy");
    }
}
