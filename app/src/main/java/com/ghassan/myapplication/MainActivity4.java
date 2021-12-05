package com.ghassan.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    String letters[] = {"أ", "ة", "ع ", "ح", "غ", "خ", "ق", "ک", "ج", "ش", "ی", "ض", "ل", "ن", "ر", "ت", "د", "ط", "ظ", "ذ ", "ث", "ص", "ز", "س", "م", "ن", "ف", "ب", "م", "و", "باَ", " بوُ ", "بىِ"};


    String halqiyah[] = {"أ", "ة", "ع ", "ح", "غ", "خ"};
    String Lahatiyah[] = {"ق", "ک"};
    String shajariyahHaafiyah[] = {"ج", "ش", "ی", "ض"};
    String Tarfiyah[] = {"ل", "ن", "ر"};
    String Niteeyah[] = {"ت", "د", "ط"};
    String Lisaveyah[] = {"ظ", "ذ ", "ث", "ص", "ز", "س"};
    String Ghunna[] = {"م", "ن", "ف", "ب", "م", "و", "باَ", " بوُ ", "بىِ"};

    String throatEnd[] = {"أ", "ة"};
    String throatMiddle[] = {"ع", "ح"};
    String throatStart[] = {"غ", "خ"};

    String tongue1[] = {"ق"};
    String tongue2[] = {"ک"};

    String tongue3[] = {"ج", "ش", "ی"};
    String tongue4[] = {"ض"};
    String tongue5[] = {"ل"};
    String tongue6[] = {"ن"};
    String tongue7[] = {"ر"};

    String tongue8[] = {"ت", "د", "ط"};

    String tongue9[] = {"ظ", "ذ ", "ث"};
    String tongue10[] = {"ص", "ز", "س"};

    String nose1[] = {"م", "ن"};
    String lip1[] = {"ف"};
    String lip2[] = {"ب"};
    String lip3[] = {"م"};
    String lip4[] = {"و"};
    String mouth[] = {"باَ", " بوُ ", "بىِ"};
    EditText letter;
    TextView result;
    EditText letter1;
    Button test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        letter = findViewById(R.id.editTextLetter);
        result = findViewById(R.id.textViewResult);
        test = findViewById(R.id.buttonTest);
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);




        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentToTest= new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intentToTest);
            }
        });

    }

    public void onSubmit(View view) {
int c=0;
        while (c==0) {
            for (String s : throatStart) {
                if (letter.getText().toString().equals(s))
                {
                    result.setText("Halqiyah." +"\n Throat Start");
                    c = 1;
                    break;
                }
            }
            if (c == 1)
                break;

            for (String s : throatMiddle) {
                if (letter.getText().toString().equals(s))
                {
                    result.setText("Halqiyah." +"\nMiddle of Throat");
                    c = 1;
                    break;
                }
            }
            if (c == 1)
                break;

            for (String s : throatEnd) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Halqiyah." +"\nEnd of Throat");
                    c = 1;
                    break;
                }
            }
                if (c == 1)
                    break;

            for (String s : tongue1) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Lahatiyah." +"\nBase of Tongue which is near touching the mouth roof ");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;


            for (String s : tongue2) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Lahatiyah." +"\nPortion of Tongue near its base touching the roof of mouth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;


            for (String s : tongue3) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Shajariyah-Haafiyah." +"\nTongue touching the center of the mouth roof");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;


            for (String s : tongue4) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Shajariyah-Haafiyah." +"\nOne side of the tongue touching the molar teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : tongue5) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Tarfiyah." +"\nRounded tip of the tongue touching the base of the frontal 8 teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : tongue6) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Tarfiyah." +"\nRounded tip of the tongue touching the base of the frontal 6 teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : tongue7) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Tarfiyah." +"\nRounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth ");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : tongue8) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Nit-eeyah." +"\nTip of the tongue touching the base of the front 2 teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;


            for (String s : tongue9) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Lisaveyah." +"\nTip of the tongue touching the tip of the frontal 2 teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;


            for (String s : tongue10) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Lisaveyah." +"\nTip of the tongue comes between the front top and bottom teeth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : lip1) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Tip of the two upper jaw teeth touches the inner part of the lower lip");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : lip2) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Inner part of the both lips touch each other");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : lip3) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Outer part of both lips touch each other ");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : lip4) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Rounding both lips and not closing the mouth");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : nose1) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Ghunna." +"\nWhile pronouncing the ending sound of م or ن , bring the vibration to the nose");
                    c=1;
                    break;
                }
            }if (c == 1)
                break;

            for (String s : mouth) {
                if (letter.getText().toString().equals(s)) {
                    result.setText("Mouth empty space while speaking words like باَ بوُ بىِ");
                    c=1;
                    break;
                }
            }
                break;


        }
    }


}