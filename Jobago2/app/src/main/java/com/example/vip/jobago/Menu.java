package com.example.vip.jobago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    ImageButton search;
    ImageButton search2;
    ImageButton search3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        search = (ImageButton)findViewById(R.id.imageButton);
        search2 = (ImageButton)findViewById(R.id.imageButton2);
        search3 = (ImageButton)findViewById(R.id.imageButton3);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, AdminView.class);
                startActivity(intent);
            }
        });
        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Job.class);
                startActivity(intent);
            }
        });
        search3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Mail.class);
                startActivity(intent);
            }
        });
    }
}
