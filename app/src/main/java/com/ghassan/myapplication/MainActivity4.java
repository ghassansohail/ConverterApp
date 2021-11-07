package com.ghassan.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {


    String letters[]={"أ","ة","ع ","ح","غ" ,"خ","ق","ک","ج" ,"ش","ی","ض","ل","ن","ر","ت","د","ط","ظ","ذ ","ث","ص","ز","س","م" , "ن","ف","ب","م","و","باَ"," بوُ ","بىِ"};




    String halqiyah[]={"أ","ة","ع ","ح","غ" ,"خ"};
    String Lahatiyah[]={"ق","ک"};
    String shajariyahHaafiyah[]={"ج" ,"ش","ی","ض"};
    String Tarfiyah[]={"ل","ن","ر"};
    String Niteeyah[]={"ت","د","ط"};
    String Lisaveyah[]={"ظ","ذ ","ث","ص","ز","س"};
    String Ghunna[]={"م" , "ن","ف","ب","م","و","باَ"," بوُ ","بىِ"};

    String throatEnd[]={"أ","ة"};
    String throatMiddle[]={"ع ","ح"};
    String throatStart[]={"غ" ,"خ"};

    String tongue1[]={"ق"};
    String tongue2[]={"ک"};

    String tongue3[]={"ج" ,"ش","ی"};
    String tongue4[]={"ض"};
    String tongue5[]={"ل"};
    String tongue6[]={"ن"};
    String tongue7[]={"ر"};

    String tongue8[]={"ت","د","ط"};

    String tongue9[]={"ظ","ذ ","ث"};
    String tongue10[]={"ص","ز","س"};

    String nose1[]={"م" , "ن"};
    String lip1[]={"ف"};
    String lip2[]={"ب"};
    String lip3[]={"م"};
    String lip4[]={"و"};
    String mouth[]={"باَ"," بوُ ","بىِ"};
    EditText letter;
    TextView result;
    EditText letter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        letter=findViewById(R.id.editTextLetter);
        result=findViewById(R.id.textViewResult);


    }

    public void onSubmit(View view) {
        int check=0;
        while (true){
        for(int i=0;i<throatStart.length;i++)
        {if (letter.getText().toString().equals("g"))
            {result.setText(letter.getText().toString());
             check=1;
             break;}
        }

        for(int i=0;i<throatMiddle.length;i++) {
            if (letter.getText().toString().equals(throatMiddle[i])) ;
            {
                result.setText("Middle of Throat");
                break;
            }
        }

        for(int i=0;i<throatEnd.length;i++)
        {if (letter.getText().toString() ==throatEnd[i])
            {result.setText("End of Throat");
            break;}
        }

        for(int i=0;i<tongue1.length;i++)
        {if (letter.getText().toString()==tongue1[i])
            {
                result.setText("");
                break;}
        }

        for(int i=0;i<tongue2.length;i++) {
            if (letter.getText().toString() == tongue2[i])
            {
                result.setText("");
                break;}
        }

        for(int i=0;i<tongue3.length;i++)
        {
            if (letter.getText().toString()==tongue3[i])
        {
            result.setText("");
            break;}
        }

        for(int i=0;i<tongue4.length;i++)
        {
            if (letter.getText().toString()==tongue4[i])
            {
                result.setText("");
                break;
            }
        }
        for(int i=0;i<tongue5.length;i++)
        {
            if (letter.getText().toString()==tongue5[i])
            {
                result.setText("");
                break;
            }
        }
        for(int i=0;i<tongue6.length;i++)
        {
            if (letter.getText().toString()==tongue6[i])
            {
                result.setText("");
                break;
            }
        }
        for(int i=0;i<tongue7.length;i++)
        {
            if (letter.getText().toString()==tongue7[i])
            {
                result.setText("");
                break;
            }
        }
        for(int i=0;i<tongue8.length;i++)
        {
            if (letter.getText().toString()==tongue8[i])
            {
                result.setText("");
                break;
            }
        }

        for(int i=0;i<tongue9.length;i++)
        {
            if (letter.getText().toString()==tongue9[i])
            {
                result.setText("");
                break;
            }
        }

        for(int i=0;i<tongue10.length;i++)
        {
            if (letter.getText().toString()==tongue10[i])
            {
                result.setText("");
                break;
            }
        }
            for(int i=0;i<lip1.length;i++)
            {
                if (letter.getText().toString()==tongue10[i])
                {
                    result.setText("");
                    break;
                }
            }

        }
}
}