
package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int times, looptimes = 0;
    TextView t1, t2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ArrayList<String> values = new ArrayList<>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        String name1 = getIntent().getStringExtra("name1");
        String name2 = getIntent().getStringExtra("name2");
        t1.setText(name1 + " (X): ");
        t2.setText(name2 + " (O): ");
        b1 =findViewById(R.id.btn1);
        b2 =findViewById(R.id.btn2);
        b3 =findViewById(R.id.btn3);
        b4 =findViewById(R.id.btn4);
        b5 =findViewById(R.id.btn5);
        b6 =findViewById(R.id.btn6);
        b7 =findViewById(R.id.btn7);
        b8 =findViewById(R.id.btn8);
        b9 =findViewById(R.id.btn9);
        values.add(b1.getText().toString());
        values.add(b2.getText().toString());
        values.add(b3.getText().toString());
        values.add(b4.getText().toString());
        values.add(b5.getText().toString());
        values.add(b6.getText().toString());
        values.add(b7.getText().toString());
        values.add(b8.getText().toString());
        values.add(b9.getText().toString());
        for(String name: values){
            if(name.isEmpty()){
                looptimes++;
            }
        }
        if(looptimes == 9){
            times = 0;
        }
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b1.getText().toString().isEmpty()){
                    if(times==0){
                        b1.setText("X");
                        times++;
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b2.getText().toString().isEmpty()){
                    if(times == 0){
                        b2.setText("X");
                        times++;
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b3.getText().toString().isEmpty()){
                    if(times == 0){
                        b3.setText("X");
                        times++;
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b4.getText().toString().isEmpty()){
                    if(times == 0){
                        b4.setText("X");
                        times++;
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b5.getText().toString().isEmpty()){
                    if(times == 0){
                        b5.setText("X");
                        times++;
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b6.getText().toString().isEmpty()){
                    if(times == 0){
                        b6.setText("X");
                        times++;
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b7.getText().toString().isEmpty()){
                    if(times == 0){
                        b7.setText("X");
                        times++;
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b8.getText().toString().isEmpty()){
                    if(times == 0){
                        b8.setText("X");
                        times++;
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b9.getText().toString().isEmpty()){
                    if(times == 0){
                        b9.setText("X");
                        times++;
                    }
                }
            }
        });
    }
}