package com.ghassan.myapplication;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;

public class MainActivity3 extends AppCompatActivity {
    Button convApp;
    Button arabicApp;
    Toolbar toolbar;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_fav:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.action_one:
                TextView textView = findViewById(R.id.textView2);
                textView.setText("Action task was clicked");
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        convApp= findViewById(R.id.buttonConvApp);
        arabicApp=findViewById(R.id.buttonArabicApp);
        toolbar= findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        convApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToMain= new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intentToMain);
            }
        });
        arabicApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentToArabic= new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intentToArabic);
            }
        });



        
        
    }


    public void gitLog(View view) {
        Intent intent= new Intent (MainActivity3.this,MainActivity7.class);
        startActivity(intent);
    }

    public void gitProfile(View view) {
        String url="https://github.com/ghassansohail/ConverterApp.git";

            Uri webpage = Uri.parse(url);
            Intent i = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(i);

    }
}