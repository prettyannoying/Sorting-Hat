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
 * Created by Skeny on 13/04/2016.
 */
public class Question5 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_5);

    }

    public void onButtonClick(View v) {
        RadioGroup group=(RadioGroup)findViewById(R.id.radio);
        SharedPreferences sharedData=getSharedPreferences("UserInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedData.edit();
        editor.putString("Q5", String.valueOf(group.indexOfChild(findViewById(group.getCheckedRadioButtonId()))));
        editor.commit();
       /*String s=(sharedData.getString("Name",""));
        String s1=(sharedData.getString("Q1",""));
        String s2=(sharedData.getString("Q2",""));
        String s3=(sharedData.getString("Q3",""));
        String s4=(sharedData.getString("Q4",""));
        String s5=(sharedData.getString("Q5",""));
       */
        String[] store=new String[5];

        store[0]=(sharedData.getString("Q1",""));
        store[1]=(sharedData.getString("Q2",""));
        store[2]=(sharedData.getString("Q3",""));
        store[3]=(sharedData.getString("Q4",""));
        store[4]=(sharedData.getString("Q5",""));
        int max=0,flag=0;
        int[] count=new int[4];
        for(int i=0;i<5;i++)
        {
            char at=store[i].charAt(0);
            switch (at)
            {
                case '0':
                    count[0]++;
                    break;
                case '1':
                    count[1]++;
                    break;
                case '2':
                    count[2]++;
                    break;
                case '3':
                    count[3]++;
                    break;
            }
        }
        for(int i=0;i<4;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                flag=i;
            }
        }

        if(v.getId()==R.id.button2)
        {
           //Toast.makeText(this,String.valueOf(flag),Toast.LENGTH_LONG).show();
            if(group.getCheckedRadioButtonId()==-1)
            {
                Toast.makeText(this, "Wizard/Witch needs to make a choice", Toast.LENGTH_SHORT).show();
            }
           else if(flag==0)
            {
                Intent i = new Intent(Question5.this, GryffindorHouse.class);
                startActivity(i);
            }
            else if(flag==1)
            {
                Intent i=new Intent(Question5.this,RavenclawHouse.class);
                startActivity(i);
            }
            else if(flag==2)
            {
                Intent i=new Intent(Question5.this,HufflepuffHouse.class);
                startActivity(i);
            }
            else if (flag==3)
            {
                Intent i=new Intent(Question5.this,SlytherinHouse.class);
                startActivity(i);
            }
        }
    }
}
