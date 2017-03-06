package com.example.yvtc.yvd030602;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener
    {
    Button btn, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.button:
                    Log.d("BTN", "Test1");
                    break;
                case R.id.button2:
                    Log.d("BTN", "Test2");
                    break;
            }
        }
    }
