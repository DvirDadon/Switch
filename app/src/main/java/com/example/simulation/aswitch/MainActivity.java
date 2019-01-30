package com.example.simulation.aswitch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton toogleB;
Switch Switching;
LinearLayout Linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toogleB=(ToggleButton)findViewById(R.id.toggleB);
        Switching=(Switch)findViewById(R.id.Switching);
        Linear=(LinearLayout)findViewById(R.id.Linear);


        }
    public void btn1(View view) {
        if ((Switching.isChecked())&&(toogleB.isChecked())) {
            Linear.setBackgroundColor(Color.GRAY);
        }
        else if((toogleB.isChecked())) {
            Linear.setBackgroundColor(Color.YELLOW);
        }
        else if (Switching.isChecked())
            Linear.setBackgroundColor(Color.GREEN);
        else
            Linear.setBackgroundColor(Color.WHITE);
    }

}
