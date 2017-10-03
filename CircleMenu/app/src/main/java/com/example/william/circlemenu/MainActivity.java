package com.example.william.circlemenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayName[] = {  "Facebook",
                            "Twitter",
                            "Youtube",
                            "Whatsapp",
                            "Instagram"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleMenu circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add, R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.facebook)
                .addSubMenu(Color.parseColor("#09A7F6"),R.drawable.twitter)
                .addSubMenu(Color.parseColor("#FD6262"),R.drawable.youtube)
                .addSubMenu(Color.parseColor("#267132"),R.drawable.whatsapp)
                .addSubMenu(Color.parseColor("#E6ACDB"),R.drawable.instagram)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(MainActivity.this, "You selected " + arrayName[i], Toast.LENGTH_SHORT ).show();
                    }
                });
    }
}
