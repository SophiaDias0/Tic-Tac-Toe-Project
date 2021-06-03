
package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    int times, winx, wino = 0;
    TextView t1, t2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    ImageButton res;
    ArrayList<String> values = new ArrayList<>();
    @SuppressLint("SetTextI18n")
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        t1.setTextColor(Color.BLUE);
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
        res = findViewById(R.id.btnRes);
        values.add(b1.getText().toString());
        values.add(b2.getText().toString());
        values.add(b3.getText().toString());
        values.add(b4.getText().toString());
        values.add(b5.getText().toString());
        values.add(b6.getText().toString());
        values.add(b7.getText().toString());
        values.add(b8.getText().toString());
        values.add(b9.getText().toString());
        res.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                b1.setClickable(true);
                b2.setClickable(true);
                b3.setClickable(true);
                b4.setClickable(true);
                b5.setClickable(true);
                b6.setClickable(true);
                b7.setClickable(true);
                b8.setClickable(true);
                b9.setClickable(true);
                t2.setTextColor(Color.parseColor("#FF9F65CC"));
                t1.setTextColor(Color.BLUE);
                times = 0;
            }
        });
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b1.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b1.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b1.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b2.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b2.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b2.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b3.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b3.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b3.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b4.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b4.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b4.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b5.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b5.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b5.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b6.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b6.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b6.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        t1.setText(name1 + " (X): " + winx);
                        res.setVisibility(View.VISIBLE);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b7.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b7.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b7.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        res.setVisibility(View.VISIBLE);
                        t1.setText(name1 + " (X): " + winx);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b8.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b8.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b8.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        res.setVisibility(View.VISIBLE);
                        t1.setText(name1 + " (X): " + winx);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b9.getText().toString().isEmpty()){
                    if(times == 1 || times == 3 || times == 5 || times == 7 || times == 9){
                        b9.setText("O");
                        t1.setTextColor(Color.BLUE);
                        t2.setTextColor(Color.parseColor("#FF9F65CC"));
                    }else{
                        b9.setText("X");
                        t2.setTextColor(Color.BLUE);
                        t1.setTextColor(Color.parseColor("#FF9F65CC"));
                    }
                    times++;
                    if(times == 9){
                        res.setVisibility(View.VISIBLE);
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                    }
                    if((b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X")) ||
                            (b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X")) ||
                            (b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X")) ||
                            (b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
                            || (b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X")) ||
                            (b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X")) ){
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        winx++;
                        res.setVisibility(View.VISIBLE);
                        t1.setText(name1 + " (X): " + winx);
                    }else if((b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O")) ||
                            (b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O")) ||
                            (b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O")) ||
                            (b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
                            || (b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O")) ||
                            (b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O")) ) {
                        b1.setClickable(false);
                        b2.setClickable(false);
                        b3.setClickable(false);
                        b4.setClickable(false);
                        b5.setClickable(false);
                        b6.setClickable(false);
                        b7.setClickable(false);
                        b8.setClickable(false);
                        b9.setClickable(false);
                        times = 0;
                        wino++;
                        t2.setText(name2 + " (O): " + wino);
                        res.setVisibility(View.VISIBLE);
                    }
                }
            }
        });


    }
    //int[][] win = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 8}, {3, 5, 7}};
}