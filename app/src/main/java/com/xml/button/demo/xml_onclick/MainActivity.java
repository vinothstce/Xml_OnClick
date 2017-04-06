package com.xml.button.demo.xml_onclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void performStuff(View v)
    {
        switch (v.getId())
        {
            case R.id.bFirstButton:
                Log.d("Button","First Button was clicked");
                break;
            case R.id.bSecondButton:
                Log.d("Button","Second Button was clicked");
                break;
        }

    }
}
