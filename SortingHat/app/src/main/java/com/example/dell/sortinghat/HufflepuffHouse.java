package com.example.dell.sortinghat;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Skeny on 15/04/2016.
 */
public class HufflepuffHouse extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hufflepuff_house);

        SharedPreferences sharedData=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        String name=(sharedData.getString("Name",""));
        TextView tv1=(TextView) findViewById(R.id.tv1);
        tv2.setText(name);
        Typeface myFont=Typeface.createFromAsset(getAssets(),"harrypotter.TTF");
        tv1.setTypeface(myFont);
        tv2.setTypeface(myFont);
    }
}
