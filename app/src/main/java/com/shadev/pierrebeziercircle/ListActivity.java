package com.shadev.pierrebeziercircle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shadev.pierrebeziercircle.q1.MainActivity;
import com.shadev.pierrebeziercircle.q2.Main3Activity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void onClick1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void onClick2(View view) {
        startActivity(new Intent(this, Main3Activity.class));
    }

    public void onClick3(View view) {
        startActivity(new Intent(this, com.shadev.pierrebeziercircle.q3qq.MainActivity.class));
    }

    public void onClick4(View view) {
        startActivity(new Intent(this, com.shadev.pierrebeziercircle.q4.MainActivity.class));
    }
}
