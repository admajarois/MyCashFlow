package com.example.mycashflow.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mycashflow.R;

public class CashflowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashflow);
        setTitle("Detail Cash Flow");
    }
}