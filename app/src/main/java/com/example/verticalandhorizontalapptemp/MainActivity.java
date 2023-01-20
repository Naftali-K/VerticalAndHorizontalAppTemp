package com.example.verticalandhorizontalapptemp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.vertical_only_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), VerticalActivity.class));
            }
        });

        findViewById(R.id.horizontal_only_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), HorizontalActivity.class));
            }
        });

        findViewById(R.id.vertical_and_horizontal_only_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), VerticalAndHorizontalActivity.class));
            }
        });

        findViewById(R.id.tablet_horizontal_and_phone_vertical_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), TabletHorizontalAndPhoneVerticalActivity.class));
            }
        });
    }
}