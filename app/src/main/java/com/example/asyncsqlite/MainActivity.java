package com.example.asyncsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
String name,number;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPersonName2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name=et1.getText().toString();
                 number=et2.getText().toString();
               DbHelp dh= new DbHelp(MainActivity.this,name,number);
               Background b1=new Background(dh);

            }
        });
    }
}