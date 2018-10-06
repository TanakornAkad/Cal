package com.example.fluks.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String resultC;
    TextView symbo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText showA = findViewById(R.id.show_a);
        final EditText showB = findViewById(R.id.show_b);
        symbo = findViewById(R.id.show_mark);
        final TextView showCal = findViewById(R.id.show_cal);
        Button btPlus = findViewById(R.id.bt_Plus);
        Button btMinus = findViewById(R.id.bt_Minus);
        Button btMulti = findViewById(R.id.bt_Multi);
        Button btDidive = findViewById(R.id.bt_Didive);

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultC = String.valueOf(calPlus(Integer.parseInt(String.valueOf(showA.getText())), Integer.parseInt(String.valueOf(showB.getText()))));
                showCal.setText(resultC);
            }
        });
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultC = String.valueOf(calMinus(Integer.parseInt(String.valueOf(showA.getText())), Integer.parseInt(String.valueOf(showB.getText()))));
                showCal.setText(resultC);
            }
        });
        btMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultC= String.valueOf(calMulti(Integer.parseInt(String.valueOf(showA.getText())), Integer.parseInt(String.valueOf(showB.getText()))));
                showCal.setText(resultC);
            }
        });
        btDidive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultC = String.valueOf(calDidive(Integer.parseInt(String.valueOf(showA.getText())), Integer.parseInt(String.valueOf(showB.getText()))));
                showCal.setText(resultC);
            }
        });
    }

    public int calPlus(int A, int B){
        symbo.setText("+");
        return A + B;
    }
    public int calMinus(int A, int B){
        symbo.setText("-");
        return A - B;
    }
    public int calMulti(int A, int B){
        symbo.setText("×");
        return A * B;
    }
    public  int calDidive(int A, int B){
        symbo.setText("/");
        return A / B;
    }
}
