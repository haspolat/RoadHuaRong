package com.example.roadhuarong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {
public static final String LEVEL_EXTRA = "com.example.roadhuarong.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void select_level(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        switch (view.getId()){
            case R.id.level1_button:
                intent.putExtra(LEVEL_EXTRA, 0);
                break;
            case R.id.level2_button:
                intent.putExtra(LEVEL_EXTRA, 1);
                break;
                default:
                    return;
        }
        startActivity(intent);
    }
}
