package com.example.mycashflow.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mycashflow.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        setContentView(R.layout.activity_login);
    }
}