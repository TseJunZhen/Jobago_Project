package com.example.vip.jobago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
     public void FirstMethod(View view){

         Toast.makeText(Register.this, "FIrst !~", Toast.LENGTH_LONG).show();
     }
}
