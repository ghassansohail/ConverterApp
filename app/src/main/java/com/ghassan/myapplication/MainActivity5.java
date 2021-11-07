package com.ghassan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    Button option1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        option1=findViewById(R.id.buttonOption1);
        TextView display= findViewById(R.id.textDisplay);
        String letters[] = {"أ", "ة", "ع ", "ح", "غ", "خ", "ق", "ک", "ج", "ش", "ی", "ض", "ل", "ر", "ت", "د", "ط", "ظ", "ذ ", "ث", "ص", "ز", "س", "م", "ف", "ب", "و", "باَ", " بوُ ", "بىِ"};
        Random rand = new Random();
        int int_random = rand.nextInt(30);
        display.setText(letters[int_random]);
        switch (int_random){
            case 1:
                break;
            
        }


        option1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                option1.setBackgroundColor(Color.GREEN);
            }

        });

    }
}