package com.example.roadhuarong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import java.security.PublicKey;


public class MainActivity extends AppCompatActivity {
    public int step = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = getLayoutInflater();
        Intent intent = getIntent();
        switch (intent.getIntExtra(SelectActivity.LEVEL_EXTRA, 0)) {
            case 0:
                inflater.inflate(R.layout.level1, (ViewGroup) findViewById(R.id.game_layout));
                break;
            case 1:
                inflater.inflate(R.layout.level2, (ViewGroup) findViewById(R.id.game_layout));
                break;
            case 2:
                inflater.inflate(R.layout.level3, (ViewGroup) findViewById(R.id.game_layout));
                break;
            default:
                Log.d("test intent", "err in intent");
                break;
        }
        Log.d("test intent", Integer.toString(intent.getIntExtra(SelectActivity.LEVEL_EXTRA, 0)));
        GridLayout layout = findViewById(R.id.grid_layout);
        View.OnTouchListener touchListener = new OnTouchListener(this);
        for (int i = 0; i < layout.getChildCount(); i++) {
            View v = layout.getChildAt(i);
            v.setOnTouchListener(touchListener);
        }
    }

}
