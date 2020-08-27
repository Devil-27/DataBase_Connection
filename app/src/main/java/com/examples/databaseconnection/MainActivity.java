package com.examples.databaseconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,rollno;
    Button insert;
    DB_helper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DB_helper( this);
        name=(EditText)findViewById(R.id.name);
        rollno=(EditText)findViewById(R.id.rollno);
        insert=(Button)findViewById(R.id.insert);
        Toast.makeText(this,"DB created",Toast.LENGTH_SHORT).show();

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=name.getText().toString();
                String s2=rollno.getText().toString();
                db.insert_data(s1 , s2);
                Toast.makeText(getApplicationContext(),"Data inserted",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
