package com.example.firstappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add;
    TextView result;
    EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.add);
        num1=findViewById(R.id.e1);
        num2=findViewById(R.id.e2);
        result = findViewById(R.id.result);


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String temp = num1.getText().toString();
                String temp2 = num2.getText().toString();

                int res = Integer.parseInt(temp) - Integer.parseInt(temp2);

                result.setText("Answer : "+res);
            }
        });
    }
}