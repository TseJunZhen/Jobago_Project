package com.example.vip.jobago;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class AdminView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button findjob;
    String itemStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);



        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.education_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

<<<<<<< HEAD
=======

        //*******
        //city
        //*******
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.city_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        spinner2.setOnItemSelectedListener(this);

        //*******
        //job
        //*******
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.job_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(this);

        itemStr = spinner1.getSelectedItem().toString();

        findjob = (Button) findViewById(R.id.button);
        findjob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //put selected vale and start new activity
                Intent mIntent = new Intent(AdminView.this, FindJob.class);
                startActivity(mIntent);
            }
        });
>>>>>>> d0b20e6d60a4afb70cda7758a77d27272c7f03ef
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String sSelected = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this,sSelected,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
