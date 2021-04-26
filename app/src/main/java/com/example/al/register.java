package com.example.al;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {
    private Button regButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regButton = (Button) findViewById(R.id.regButton);
    }
    public void onRegButtonClick (View view) {
        Intent intent = new Intent (register.this, glav1.class);
        startActivity(intent);
    }
}