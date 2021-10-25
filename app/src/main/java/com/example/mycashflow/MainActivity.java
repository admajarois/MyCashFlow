package com.example.mycashflow;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.mycashflow.activities.CashflowActivity;
import com.example.mycashflow.activities.CashinActivity;
import com.example.mycashflow.activities.CashoutActivity;
import com.example.mycashflow.activities.OptionsActivity;
import com.example.mycashflow.javaclass.DatabaseHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton pengaturan, cashIn, cashOut, detailCash;
    DatabaseHelper databaseHelper;
    TextView uangIn;
    TextView uangOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        uangIn = findViewById(R.id.uangMasuk);
        uangOut = findViewById(R.id.uangOut);
        pengaturan = findViewById(R.id.pengaturan);
        cashIn = findViewById(R.id.tambahCashIn);
        cashOut = findViewById(R.id.tambahCashOut);
        detailCash = findViewById(R.id.buttonDetail);
        databaseHelper = new DatabaseHelper(this);

        pengaturan.setOnClickListener(this);
        cashIn.setOnClickListener(this);
        cashOut.setOnClickListener(this);
        detailCash.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tambahCashIn:
                startActivity(new Intent(MainActivity.this, CashinActivity.class));
                break;
            case R.id.tambahCashOut:
                startActivity(new Intent(MainActivity.this, CashoutActivity.class));
                break;
            case R.id.buttonDetail:
                startActivity(new Intent(MainActivity.this, CashflowActivity.class));
                break;
            case R.id.pengaturan:
                startActivity(new Intent(MainActivity.this, OptionsActivity.class));
                break;
        }
    }
}