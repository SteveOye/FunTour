package com.example.android.funtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button startBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBt = findViewById(R.id.started);
        startBt.setOnClickListener(this);
        }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.started:
                Intent intent = new Intent(this, ViewPager.class);
                startActivity(intent);
                break;
        }
    }

}
