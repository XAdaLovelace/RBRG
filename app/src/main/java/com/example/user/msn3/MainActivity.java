
package com.example.user.msn3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button CLR, CBG;
    RadioButton Rgb, rGb, rgB;
    RadioGroup RG;
    LinearLayout LY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RG = (RadioGroup) findViewById(R.id.RG);
        CLR = (Button) findViewById(R.id.CLR);
        CBG = (Button) findViewById(R.id.CBG);
        Rgb = (RadioButton) findViewById(R.id.Rgb);
        rGb = (RadioButton) findViewById(R.id.rGb);
        rgB = (RadioButton) findViewById(R.id.rgB);
        LY = (LinearLayout) findViewById(R.id.LY);
    }


    public void CLR(View view){
        RG.clearCheck();
        LY.setBackgroundResource(R.drawable.white);

    }

    public void CBG(View view){
        if(Rgb.isChecked()){
            LY.setBackgroundResource(R.drawable.red);
        }
        else if(rgB.isChecked()){
            LY.setBackgroundColor(R.drawable.blue);
        }
        else if(rGb.isChecked()){
            LY.setBackgroundColor(R.drawable.green);
        }
    }
}
