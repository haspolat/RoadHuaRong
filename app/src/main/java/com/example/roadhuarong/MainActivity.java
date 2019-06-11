package com.example.roadhuarong;

import android.app.ActionBar;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TOUCH_TEST = "touch test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout layout = findViewById(R.id.grid_layout);
        View.OnTouchListener touchListener = new OnTouchListener(this);
        for(int i =0; i < layout.getChildCount(); i++){
            View v = layout.getChildAt(i);
            v.setOnTouchListener(touchListener);
        }
    }
}
