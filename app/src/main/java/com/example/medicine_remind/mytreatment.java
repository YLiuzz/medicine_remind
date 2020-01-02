package com.example.medicine_remind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mytreatment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mytreatment);
        Button btn_today = (Button)findViewById(R.id.btn_today);
        Button btn_progress = (Button)findViewById(R.id.btn_progress);
        Button btn_team = (Button)findViewById(R.id.btn_team);
        Button btn_mytreatment = (Button)findViewById(R.id.btn_my_treatment);
        btn_today.setOnClickListener(btnListener);
        btn_progress.setOnClickListener(btnListener);
        btn_team.setOnClickListener(btnListener);
        btn_mytreatment.setOnClickListener((btnListener));


    }
    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_today:
                    Intent intent = new Intent(mytreatment.this,MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_progress:
                    Intent intent_progress = new Intent(mytreatment.this,progress.class);
                    startActivity(intent_progress);
                    break;
                case  R.id.btn_team:
                    Intent intent_team = new Intent(mytreatment.this,team.class);
                    startActivity((intent_team));
                    break;
                case  R.id.btn_my_treatment:
                    Intent intent_mytreatment = new Intent(mytreatment.this,mytreatment.class);
                    startActivity((intent_mytreatment));
                    break;

            }
        }
    };

}
