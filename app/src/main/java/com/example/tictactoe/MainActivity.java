package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name1, name2;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name1 = findViewById(R.id.edtN);
        name2 = findViewById(R.id.edtN2);
        start = findViewById(R.id.btnStart);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               if(name1.getText().toString().isEmpty()|| name2.getText().toString().isEmpty() || name1.getText().toString().trim().isEmpty() || name2.getText().toString().trim().isEmpty()) {
                   Toast.makeText(getApplicationContext(), "Missing Data", Toast.LENGTH_LONG).show();
               }else if(name1.getText().toString().equals(name2.getText().toString())){
                   Toast.makeText(getApplicationContext(), "The names cannot be the same!", Toast.LENGTH_LONG).show();
               }else{
                   Intent n = new Intent(getApplicationContext(), MainActivity2.class);
                   n.putExtra("name1", name1.getText().toString().trim());
                   n.putExtra("name2", name2.getText().toString().trim());
                   startActivity(n);
               }
            }
        });
    }
}