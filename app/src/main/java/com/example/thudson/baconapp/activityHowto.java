package com.example.thudson.baconapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activityHowto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.howto);
        /** Create an object of our buttons that we are using in the code
         * I found the tutorial here: https://www.youtube.com/watch?v=YT1FTwygdCM*/
        Button btnRecipes = (Button)findViewById(R.id.btnRecipes);
        Button btnHowtos = (Button)findViewById(R.id.btnHow);
        Button btnHistory = (Button)findViewById(R.id.btnHist);
        Button btnCredits = (Button)findViewById(R.id.btnCred);
        Button btnHome = (Button)findViewById(R.id.btnHome);

        /** We are setting up our button to change activities.
         * I have set this up before adding the activites to the java portion. I do have the layouts though...
         * */
        btnRecipes.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), activityRecipes.class);
                    }
                }
        );

        btnHowtos.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), activityHowto.class);
                    }
                }
        );
        btnHistory.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), activityHistory.class);
                    }
                }
        );
        btnCredits.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), activityCredit.class);
                    }
                }
        );
        btnCredits.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Intent myIntent = new Intent(v.getContext(), MainActivity.class);
                        startActivity(myIntent);
                    }
                }
        );





    }

}
