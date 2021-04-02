package com.example.tp0211_woactivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener {
    Button btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnThree = (Button) findViewById(R.id.btnActThree);
        btnThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnActThree:
                Intent intent1 = new Intent(this, ActivityThree.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}