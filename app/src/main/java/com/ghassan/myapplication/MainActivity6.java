package com.ghassan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView marks;
    Button share;
    String score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        marks= findViewById(R.id.textViewMarks);
        share= findViewById(R.id.buttonShare);
        Intent intent=getIntent();
        score=intent.getStringExtra("value");
        marks.setText(score);
        score="I scored "+score+" out of 100.0 in Makharij ul Huroof. Think you could do better?";

        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, score);
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
            }
        });






    }
}