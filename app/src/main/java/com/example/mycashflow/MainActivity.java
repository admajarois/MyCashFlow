package com.example.mycashflow;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mycashflow.activities.CashflowActivity;
import com.example.mycashflow.activities.CashinActivity;
import com.example.mycashflow.activities.CashoutActivity;
import com.example.mycashflow.activities.OptionsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void handleTambah(View view) {
        Intent intent = new Intent(this, CashinActivity.class);
        startActivity(intent);
    }

    public void handlePengeluaran(View view) {
        Intent intent = new Intent(this, CashoutActivity.class);
        startActivity(intent);
    }

    public void handlePengaturan(View view) {
        Intent intent = new Intent(this, OptionsActivity.class);
        startActivity(intent);
    }

    public void handleDetail(View view) {
        Intent intent = new Intent(this, CashflowActivity.class);
        startActivity(intent);
    }
}