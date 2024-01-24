package com.example.gstcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView txt_gst_amount, txt_total_amount, txt_turnover1, txt_days, txt_interest;
    EditText txt_amount, txt_gst_percent;
    Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_amount = findViewById(R.id.txt_amount);
        txt_gst_amount = findViewById(R.id.txt_gst_amount);
        txt_gst_percent = findViewById(R.id.txt_gst_percent);
        txt_total_amount = findViewById(R.id.txt_total_amount);
        txt_turnover1 = findViewById(R.id.txt_turnover1);
        txt_days= findViewById(R.id.txt_days);
        txt_interest = findViewById(R.id.txt_interest);
        btn_calculate = findViewById(R.id.btn_calculate);



        btn_calculate.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                float amount = Float.parseFloat(txt_amount.getText().toString());
                float gst_percent = Float.parseFloat(txt_gst_percent.getText().toString());



                txt_interest.setText(" GST percent : " + gst_percent);


                float gst_amount = (gst_percent / 100) * amount;
                txt_gst_amount.setText("GST Amount is : " + gst_amount);
                float total_amount = amount + gst_amount;
                txt_total_amount.setText("The Total Amount: " + total_amount);
            }
        });
    }}