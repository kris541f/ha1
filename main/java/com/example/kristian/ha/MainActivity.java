package com.example.kristian.ha;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kristian.ha.views.*;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {



    private Button minknap;
    private int x;
    private EditText mittal;
    private int huhu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mittal=(EditText)findViewById(R.id.editText);

        final custom2 nyt=(custom2)findViewById(R.id.custom2);
        minknap=(Button)findViewById(R.id.button3);
        minknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                huhu=Integer.parseInt(mittal.getText().toString());
                nyt.x=huhu;
                nyt.invalidate();
            }
        });

    }


}












