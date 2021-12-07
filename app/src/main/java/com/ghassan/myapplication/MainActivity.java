package com.ghassan.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonMK, buttonKM, buttonCF,
            buttonFC, buttonC, buttonMin;
    TextView cnvTextView;


    float mValue;

    boolean MK, KM, CF, FC;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_fav:
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
                return true;

            case R.id.action_one:
                Toast.makeText(getApplicationContext(),"Git",Toast.LENGTH_LONG).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonKM = (Button) findViewById(R.id.buttonKM);
        buttonMK = (Button) findViewById(R.id.buttonMK);
        buttonFC = (Button) findViewById(R.id.buttonFC);
        buttonCF = (Button) findViewById(R.id.buttonCF);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonMin = (Button) findViewById(R.id.buttonMin);
        cnvTextView = (TextView) findViewById(R.id.textView);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(cnvTextView.getText() + "0");
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= (String) cnvTextView.getText();
                if(s.length()>0)
                    s=s.substring(0, s.length() - 1);
                cnvTextView.setText(s);

            }
        });



        buttonMK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnvTextView.getText() == "") {
                    cnvTextView.setText("");
                } else {

                mValue = Float.parseFloat(cnvTextView.getText() + "");
                cnvTextView.setText(mValue*1.60934+ "");
            }
        }});



        buttonKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnvTextView.getText() == "") {
                    cnvTextView.setText("");}
                else {
                    mValue = Float.parseFloat(cnvTextView.getText() + "");
                    cnvTextView.setText(mValue/1.60934+ "");
                }
            }
        });



        buttonFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnvTextView.getText() == "") {
                    cnvTextView.setText("");}
                else {
                    mValue = Float.parseFloat(cnvTextView.getText() + "");
                    cnvTextView.setText((mValue-32)*0.55  + "");
                }
            }
        });


        buttonCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cnvTextView.getText() == "") {
                    cnvTextView.setText("");}
                else {
                    mValue = Float.parseFloat(cnvTextView.getText() + "");
                    cnvTextView.setText((mValue*1.8)+32 + "");
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnvTextView.setText(null);

                                   }
        });



    }

}