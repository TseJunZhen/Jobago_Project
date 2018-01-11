package com.example.vip.jobago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validated(Name.getText().toString(), Password.getText().toString());
            }
        });

    }

    private void validated(String userName, String userPassword) {
        if ((userName.equals("Admin")) && (userPassword.equals("0000"))) {
            Intent intent = new Intent(MainActivity.this, Menu.class);
            startActivity(intent);
        } else if (counter == 0) {
            Login.setEnabled(false);
        } else {
            counter--;
            Info.setText("No of attempts remaining: " + String.valueOf(counter));
        }
    }
}