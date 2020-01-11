package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    Button btn1,btn2,btn3,btn4;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=findViewById(R.id.edittext1);
        edt2=findViewById(R.id.edittext2);

        btn1=findViewById(R.id.button1);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button3);
        btn4=findViewById(R.id.button4);
        textView=findViewById(R.id.text1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {

                int first, second,result;
                first= Integer.valueOf(edt1.getText().toString());
                second= Integer.valueOf(edt2.getText().toString());
                result=first+second;
                textView.setText("your massage ="+result);
            }
        });
    }
}
