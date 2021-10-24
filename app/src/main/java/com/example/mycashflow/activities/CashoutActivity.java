package com.example.mycashflow.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mycashflow.R;
import com.example.mycashflow.javaclass.DatePicker;
import com.google.android.material.textfield.TextInputLayout;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class CashoutActivity extends AppCompatActivity {

    TextInputLayout textInputLayout;
    SimpleDateFormat dateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        setContentView(R.layout.activity_cashout);

        textInputLayout = findViewById(R.id.tanggal_cashout);
        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.forLanguageTag("INDONESIA"));

        textInputLayout.getEditText().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker.showDateDialog(CashoutActivity.this, textInputLayout, dateFormat);
            }
        });
    }
}