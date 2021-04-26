package com.example.al;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    private Button startButton;
    private Button regButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        startButton = (Button) findViewById(R.id.startButton);
        regButton = (Button) findViewById(R.id.regButton);
    }
    public void onStartButtonClick (View view) {
        Intent intent = new Intent (MainActivity2.this, glav1.class);
        startActivity(intent);
    }
    public void onRegButtonClick (View view) {
        Intent intent = new Intent (MainActivity2.this, register.class);
        startActivity(intent);
    }
}