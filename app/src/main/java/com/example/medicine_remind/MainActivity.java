package com.example.medicine_remind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);
        btnRecord = (Button)findViewById(R.id.btn_record);
        btnToday = (Button)findViewById(R.id.btn_today);
        btnProgress = (Button)findViewById(R.id.btn_progress);
        btnTeam = (Button)findViewById(R.id.btn_team);
        btnMytreatment = (Button)findViewById(R.id.btn_my_treatment);

    }




}
