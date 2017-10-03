package com.example.william.interfaceslide;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class Tutorial extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Money Title")
                .setContent("Money Content")
                .setSummary("Money Summary")
                .setDrawable(R.drawable.ic_attach_money_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());

        addFragment(new Step.Builder().setTitle("Music Title")
                .setContent("Music Content")
                .setSummary("Music Summary")
                .setDrawable(R.drawable.ic_audiotrack_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());

        addFragment(new Step.Builder().setTitle("Time Title")
                .setContent("Time Content")
                .setSummary("Time Summary")
                .setDrawable(R.drawable.ic_av_timer_black_24dp)
                .setBackgroundColor(R.color.colorPrimary)
                .build());

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.prev:
                Toast.makeText(this, "Back Button Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next:
                Toast.makeText(this, "Next Button Cliked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
