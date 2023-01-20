package com.example.verticalandhorizontalapptemp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

/*
https://developer.android.com/guide/topics/large-screens/support-different-screen-sizes
https://stackoverflow.com/questions/9627774/android-allow-portrait-and-landscape-for-tablets-but-force-portrait-on-phone
https://stackoverflow.com/questions/9627774/android-allow-portrait-and-landscape-for-tablets-but-force-portrait-on-phone/39302787#39302787
 */

public class TabletHorizontalAndPhoneVerticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_horizontal_and_phone_vertical);

        if (getResources().getBoolean(R.bool.portrait_only)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }
}