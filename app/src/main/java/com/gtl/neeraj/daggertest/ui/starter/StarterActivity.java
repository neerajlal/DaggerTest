package com.gtl.neeraj.daggertest.ui.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.gtl.neeraj.daggertest.R;
import com.gtl.neeraj.daggertest.ui.main.MainActivity;
import com.gtl.neeraj.daggertest.ui.main2.ScrollingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StarterActivity extends AppCompatActivity {

    @BindView(R.id.nse)
    Button nse;

    @BindView(R.id.bse)
    Button bse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ButterKnife.bind(this);

        nse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoNSE();
            }
        });

        bse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoBSE();
            }
        });

    }

    public void gotoNSE() {
        Intent intent = new Intent(StarterActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void gotoBSE() {
        Intent intent = new Intent(StarterActivity.this, ScrollingActivity.class);
        startActivity(intent);
    }
}
