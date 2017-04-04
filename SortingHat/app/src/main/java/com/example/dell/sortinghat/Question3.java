package com.example.dell.sortinghat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Skeny on 12/04/2016.
 */
public class Question3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_3);

    }

    public void onButtonClick(View v) {
        RadioGroup group=(RadioGroup)findViewById(R.id.radio);
        SharedPreferences sharedData=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedData.edit();
        int value=group.indexOfChild(findViewById(group.getCheckedRadioButtonId()));
        editor.putString("Q3", String.valueOf(value));
        editor.commit();

        //int id=group.indexOfChild(findViewById(group.getCheckedRadioButtonId()));
        if(v.getId()==R.id.button2)
        {
            if(group.getCheckedRadioButtonId()==-1)
            {
                Toast.makeText(this, "Wizard/Witch needs to make a choice", Toast.LENGTH_SHORT).show();
            }
            else
            {
                //Toast.makeText(this,String.valueOf(id),Toast.LENGTH_LONG).show();
                Intent i = new Intent(Question3.this, Question4.class);
                startActivity(i);
            }
        }

    }
}