package com.example.dell.sortinghat;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity
{
    //Button b;
    String enteredName;
    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface myFont=Typeface.createFromAsset(getAssets(),"harrypotter.TTF");
        TextView myText=(TextView)findViewById(R.id.textView2);
        TextView enterName=(TextView)findViewById(R.id.textView);
        Button sort=(Button)findViewById(R.id.button);
        Button about=(Button)findViewById(R.id.b);
        myText.setTypeface(myFont);
        enterName.setTypeface(myFont);
        sort.setTypeface(myFont);
        about.setTypeface(myFont);

        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));
        //b=(Button)findViewById(R.id.button);
        //b.setOnClickListener((View.OnClickListener) this);
    }

    public void onButtonClick(View v)
    {
        SharedPreferences sharedData=getSharedPreferences("UserInfo",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedData.edit();
        EditText name=(EditText)findViewById(R.id.editText);
        enteredName=name.getText().toString();
        editor.putString("Name", name.getText().toString());
        editor.commit();
        //String channel=(sharedData.getString("Name",""));
        if(v.getId()==R.id.button && !enteredName.equals(""))
        {
            //Toast.makeText(this, channel,Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Question1.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.b)
        {
            Intent i=new Intent(MainActivity.this,About.class);
            startActivity(i);
        }

        else
        {

                Toast.makeText(this,"Witch/Wizard needs a name!",Toast.LENGTH_SHORT).show();

        }

    }
}

