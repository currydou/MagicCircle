package com.shadev.pierrebeziercircle.qw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.shadev.pierrebeziercircle.R;

public class Main3Activity extends AppCompatActivity {

    private BezierLinearPointsView view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        view2 = (BezierLinearPointsView) findViewById(R.id.ttn);

    }

    public void onClick(View view) {
        view2.selectPre();
    }

    public void onClick2(View view) {
        view2.selectNext();
    }
}
