package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
EditText number1;
EditText number2;
TextView add;
Button button;
int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.n1);
        number2=findViewById(R.id.n2);
        add = findViewById(R.id.add);
        button=findViewById(R.id.button);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1,val2;
                val1 = Integer.parseInt(number1.getText().toString());
                val2 = Integer.parseInt(number2.getText().toString());
                Addition(val1,val2);
                //Toast.makeText(add.getContext(), "Addition!");

        });}*/

    }
    public void Addition(View view) {
        int val1,val2;
        val1 = Integer.parseInt(number1.getText().toString());
        val2 = Integer.parseInt(number2.getText().toString());
        result = val1 /*+ val2*/;
       // add.setText("Result : " + result);
        String s = "";

        String table = val1 + " * ";
        for (int i=1;i<=val2;i++)
        {
            result = val1 * i;
            s=s + table + i + " = " +String.valueOf(result)+"\n";
        }
        add.setText(s);
        Toast.makeText(view.getContext(), "Table of : "+val1,Toast.LENGTH_LONG).show();
        Toast.makeText(view.getContext(),"HELLO",Toast.LENGTH_SHORT).setDuration(Toast.LENGTH_LONG);
    }
}