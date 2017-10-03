package com.example.william.searchbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();
    SpinnerDialog spinnerDialog;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();

        spinnerDialog = new SpinnerDialog(MainActivity.this, items, "Select item");
        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String s, int i) {
                Toast.makeText(MainActivity.this, "Selected : "+s, Toast.LENGTH_SHORT).show();

            }
        });
        btnShow = (Button)findViewById(R.id.btnShow);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinnerDialog.showSpinerDialog();
            }
        });
    }

    private void initItems() {
        for(int i=0; i<10000; i++){
            items.add("Item "+(i+1));
        }
    }
}
