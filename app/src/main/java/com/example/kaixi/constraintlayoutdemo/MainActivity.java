package com.example.kaixi.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void simple(View view) {
        startActivity(new Intent(this,SimpleActivity.class));
    }

    public void constraint(View view) {
        startActivity(new Intent(this,ConstraintActivity.class));
    }
}
