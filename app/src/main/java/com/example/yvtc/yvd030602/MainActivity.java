package com.example.yvtc.yvd030602;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        MyClass c = new MyClass();
        btn.setOnClickListener(c);
    }
    class MyClass implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            Log.d("BTN", "Test1");
        }
    }
}
