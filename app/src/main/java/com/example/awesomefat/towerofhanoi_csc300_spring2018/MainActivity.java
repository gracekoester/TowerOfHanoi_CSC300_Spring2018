package com.example.awesomefat.towerofhanoi_csc300_spring2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    private ViewGroup tower_1;
    private ViewGroup tower_2;
    private ViewGroup tower_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.tower_1 = (ViewGroup)this.findViewById(R.id.tower_1);
        this.tower_2 = (ViewGroup)this.findViewById(R.id.tower_2);
        this.tower_3 = (ViewGroup)this.findViewById(R.id.tower_3);
    }

    public void setTower_1Pressed(View v)
    {

            View tower = this.tower_1.getChildAt(0);
            this.tower_1.removeViewAt(0);

    }
    public void setTower_2Pressed(View v)
    {

        View tower = this.tower_2.getChildAt(0);
        this.tower_3.removeViewAt(0);

    }

    public void setTower_3Pressed(View v)
    {

        View tower = this.tower_1.getChildAt(0);
        this.tower_3.removeViewAt(0);

    }
}
