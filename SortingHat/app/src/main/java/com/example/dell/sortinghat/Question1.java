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
public class Question1 extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);

    }
    public void onButtonClick(View v)
    {
        RadioGroup group=(RadioGroup)findViewById(R.id.radio);
        SharedPreferences sharedData=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedData.edit();

        int option=group.indexOfChild(findViewById(group.getCheckedRadioButtonId()));

        editor.putString("Q1",String.valueOf(option));
        editor.commit();
        if(v.getId()==R.id.button2)
        {
            if(group.getCheckedRadioButtonId()==-1)
            {
                Toast.makeText(this,"Wizard/Witch needs to make a choice",Toast.LENGTH_SHORT).show();
            }
            else
            {

                Intent i = new Intent(Question1.this, Question2.class);
                i.putExtra("Something",group.getCheckedRadioButtonId());
                startActivity(i);
            }
        }
    }
}
