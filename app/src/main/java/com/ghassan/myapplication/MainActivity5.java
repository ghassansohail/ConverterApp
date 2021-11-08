package com.ghassan.myapplication;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    Button option1, option2, option3, option4, option5,quit,next ;
    TextView timer,score;
    public int i=0,answer=0;
    public double counter=0;
    public int check(int int_rand){
    int answr=0;
        if(int_rand >=0 && int_rand<6)
        {
            answr=1;//throat

        }
        else if(int_rand>=6 && int_rand<23)
        {
            answr=2;//tongue

        }
        else if(int_rand==23)
        {
            answr=4;//Nose

        }
        else if(int_rand>=24 && int_rand<27)
        {
            answr=3;//Lips

        }
        else if(int_rand>=27 && int_rand<30)
        {
            answr=5;//Mouth
        }
        return answr;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        option1=findViewById(R.id.buttonOption1);
        option2=findViewById(R.id.buttonOption2);
        option3=findViewById(R.id.buttonOption3);
        option4=findViewById(R.id.buttonOption4);
        option5=findViewById(R.id.buttonOption5);

        quit=findViewById(R.id.buttonQuit);
        TextView display= findViewById(R.id.textDisplay);
         score= findViewById(R.id.textViewScore);
        String letters[] = {"أ", "ة", "ع ", "ح", "غ", "خ", "ق", "ک", "ج", "ش", "ی", "ض", "ل", "ر", "ت", "د", "ط", "ظ", "ذ ", "ث", "ص", "ز", "س", "م", "ف", "ب", "و", "باَ", " بوُ ", "بىِ"};

            Random rand = new Random();
            int int_random = rand.nextInt(30);
            display.setText(letters[int_random]);
            answer=check(int_random);


                    option1.setOnClickListener(new View.OnClickListener(){
                        @Override
                                public void onClick(View v) {
                            if (answer == 1) {
                                option1.setBackgroundColor(Color.GREEN);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                score.setText(Double.toString(counter));
                                counter += 10.0;
                            } else {
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option1.setBackgroundColor(Color.BLACK);

                            }
                        }
                });

                    option2.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==2)
                            {
                            option2.setBackgroundColor(Color.GREEN);

                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                score.setText(Double.toString(counter));
                                counter += 10.0;
                            } else {
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option2.setBackgroundColor(Color.BLACK);
                            }
                        }
                    });

                    option3.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==3)
                            {
                            option3.setBackgroundColor(Color.GREEN);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                score.setText(Double.toString(counter));
                                counter += 10.0;
                            } else {
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option3.setBackgroundColor(Color.BLACK);
                            }
                        }
                    });

                    option4.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==4)
                            {
                            option4.setBackgroundColor(Color.GREEN);

                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                score.setText(Double.toString(counter));
                                counter += 10.0;
                            } else {
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option4.setBackgroundColor(Color.BLACK);

                            }
                        }
                    });

                    option5.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==5)
                            {
                            option5.setBackgroundColor(Color.GREEN);


                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                score.setText(Double.toString(counter));
                                counter += 10.0;

                            } else {
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option5.setBackgroundColor(Color.BLACK);
                            }
                        }
                    });



        quit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentToMain4= new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(intentToMain4);
            }
        });


        }

    }



