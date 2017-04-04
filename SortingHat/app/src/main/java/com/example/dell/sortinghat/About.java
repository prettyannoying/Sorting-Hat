package com.example.dell.sortinghat;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Skeny on 18/04/2016.
 */
public class About extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        //TextView t1=(TextView)findViewById(R.id.text1);
        TextView t2=(TextView)findViewById(R.id.text2);
        Typeface myFont=Typeface.createFromAsset(getAssets(),"harrypotter.TTF");
       // t1.setTypeface(myFont);
        t2.setTypeface(myFont);
    }
}
