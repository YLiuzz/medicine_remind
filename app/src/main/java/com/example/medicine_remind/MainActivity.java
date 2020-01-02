package com.example.medicine_remind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  Button btnRecord;
    private  Button btnToday;
    private  Button btnProgress;
    private  Button btnTeam;
    private  Button btnMytreatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);
        btnRecord = (Button)findViewById(R.id.btn_record);
        btnToday = (Button)findViewById(R.id.btn_today);
        btnProgress = (Button)findViewById(R.id.btn_progress);
        btnTeam = (Button)findViewById(R.id.btn_team);
        btnMytreatment = (Button)findViewById(R.id.btn_my_treatment);

        btnRecord.setOnClickListener(btnListener);
        btnToday.setOnClickListener(btnListener);
        btnProgress.setOnClickListener(btnListener);
        btnTeam.setOnClickListener(btnListener);
        btnMytreatment.setOnClickListener(btnListener);





    }
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_today:
                    Intent intent = new Intent(MainActivity.this,MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_progress:
                    Intent intent1 = new Intent(MainActivity.this,progress.class);
                    startActivity(intent1);
            }
        }
    };




}
