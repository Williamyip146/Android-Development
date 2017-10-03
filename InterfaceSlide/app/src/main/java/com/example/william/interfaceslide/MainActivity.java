package com.example.william.interfaceslide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnShow = (Button)findViewById(R.id.btnTutorial);
        btnShow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
             Intent tutorial = new Intent(MainActivity.this, Tutorial.class);
             startActivity(tutorial);
            }
        });

    }
}
