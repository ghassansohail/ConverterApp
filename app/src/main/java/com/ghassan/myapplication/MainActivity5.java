package com.ghassan.myapplication;



import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {
    Button option1, option2, option3, option4, option5,quit,next ;
    TextView timer,score,display;
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_fav:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                return true;

            case R.id.action_one:
                Toast.makeText(getApplicationContext(),"Quiz",Toast.LENGTH_LONG).show();

            default:
                return super.onOptionsItemSelected(item);
        }
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
         display= findViewById(R.id.textDisplay);
         score= findViewById(R.id.textViewScore);


        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        String letters[] = {"??", "??", "?? ", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "??", "?? ", "??", "??", "??", "??", "??", "??", "??", "??", "??????", " ?????? ", "??????"};

            Random rand = new Random();
            int int_random = rand.nextInt(30);
            display.setText(letters[int_random]);
            answer=check(int_random);


                    option1.setOnClickListener(new View.OnClickListener(){
                        @Override
                                public void onClick(View v) {
                            if (answer == 1) {
                                score.setBackgroundColor(Color.GREEN);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                counter += 10.0;
                                score.setText(Double.toString(counter));
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }

                            } else {
                                score.setBackgroundColor(Color.RED);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option1.setBackgroundColor(Color.BLACK);

                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }

                            }
                        }
                });

                    option2.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==2)
                            {
                                score.setBackgroundColor(Color.GREEN);

                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                counter += 10.0;
                                score.setText(Double.toString(counter));
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            } else {
                                score.setBackgroundColor(Color.RED);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option2.setBackgroundColor(Color.BLACK);
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            }
                        }
                    });

                    option3.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==3)
                            {
                                score.setBackgroundColor(Color.GREEN);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                counter += 10.0;
                                score.setText(Double.toString(counter));
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            } else {
                                score.setBackgroundColor(Color.RED);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option3.setBackgroundColor(Color.BLACK);
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            }
                        }
                    });

                    option4.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==4)
                            {
                                score.setBackgroundColor(Color.GREEN);

                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                counter += 10.0;
                                score.setText(Double.toString(counter));
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            } else {
                                score.setBackgroundColor(Color.RED);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option4.setBackgroundColor(Color.BLACK);
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }
                            }
                        }
                    });

                    option5.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v){

                            if(answer==5)
                            {
                                score.setBackgroundColor(Color.GREEN);


                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                counter += 10.0;
                                score.setText(Double.toString(counter));
                                i=i+1;
                                if(i==10){

                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);
                                }

                            } else {
                                score.setBackgroundColor(Color.RED);
                                int int_random = rand.nextInt(30);
                                answer=check(int_random);
                                display.setText(letters[int_random]);
                                option5.setBackgroundColor(Color.BLACK);
                                i=i+1;
                                if(i==10){
                                    Intent intentToMain6= new Intent(MainActivity5.this,MainActivity6.class);
                                    intentToMain6.putExtra("value", Double.toString(counter));
                                    startActivity(intentToMain6);

                                }
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



