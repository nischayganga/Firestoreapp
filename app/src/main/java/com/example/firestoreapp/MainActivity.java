package com.example.firestoreapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.BufferUnderflowException;

public class MainActivity extends AppCompatActivity {
    Button additem, viewitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         additem=(Button) findViewById(R.id.additem);
        viewitem =  (Button) findViewById(R.id.viewitem);


        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AddItemActivity.class);
                startActivity(intent);

            }
        });

        viewitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ItemsList.class);
                startActivity(intent);

            }
        });
    }
}