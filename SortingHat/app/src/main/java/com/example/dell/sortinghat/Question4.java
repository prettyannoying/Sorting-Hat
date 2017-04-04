package com.example.dell.sortinghat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Skeny on 12/04/2016.
 */
public class Question4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_4);

    }

    public void onButtonClick(View v) {
        RadioGroup group=(RadioGroup)findViewById(R.id.radio);
        SharedPreferences sharedData=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedData.edit();
        editor.putString("Q4",String.valueOf(group.indexOfChild(findViewById(group.getCheckedRadioButtonId()))));
        editor.commit();
        if(v.getId()==R.id.button2)
        {
            if(group.getCheckedRadioButtonId()==-1)
            {
                Toast.makeText(this, "Wizard/Witch needs to make a choice", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent i = new Intent(Question4.this, Question5.class);
                startActivity(i);
            }
        }
    }
}