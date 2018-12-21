package com.example.maulana.kridaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView Recy;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Recy = findViewById(R.id.recy);
        btn = findViewById(R.id.btnlead);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, LeadActivity.class);
                MainActivity.this.startActivity(myIntent); } });

    }
}
