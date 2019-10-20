package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{


    public TextView txtDisplay;
    public TextView txtResult;
    public RadioButton rdoBtnDecimal, rdoBtnHeximal;
    public List<Button> btnList = new ArrayList<Button>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVar();
    }

    private void setVar(){
        txtDisplay = (TextView)findViewById(R.id.txtViewDisplay);
        txtResult = (TextView)findViewById(R.id.txtViewResult);
        Button clearButton = (Button)findViewById(R.id.btnEdit);
        Button btnResult = (Button)findViewById(R.id.btnEnter);
        rdoBtnDecimal = (RadioButton)findViewById(R.id.rdoBtnDecimal);
        rdoBtnHeximal = (RadioButton)findViewById(R.id.rdoBtnHeximal);

        btnList.add((Button)findViewById(R.id.btnLeftParenthleses));
        btnList.add((Button)findViewById(R.id.btnRigntParenthleses));

        btnList.add((Button)findViewById(R.id.btnNum1));
        btnList.add((Button)findViewById(R.id.btnNum2));
        btnList.add((Button)findViewById(R.id.btnNum3));
        btnList.add((Button)findViewById(R.id.btnAdd));

        btnList.add((Button)findViewById(R.id.btnNum4));
        btnList.add((Button)findViewById(R.id.btnNum5));
        btnList.add((Button)findViewById(R.id.btnNum6));
        btnList.add((Button)findViewById(R.id.btnSub));

        btnList.add((Button)findViewById(R.id.btnNum7));
        btnList.add((Button)findViewById(R.id.btnNum8));
        btnList.add((Button)findViewById(R.id.btnNum9));
        btnList.add((Button)findViewById(R.id.btnMul));

        btnList.add((Button)findViewById(R.id.btnNum0));
        btnList.add((Button)findViewById(R.id.btnNumDot));
        btnList.add((Button)findViewById(R.id.btnDiv));

        for(Button b:btnList){
            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    Button b = (Button) view;
                    String result = txtDisplay.getText().toString() + b.getText().toString();
                    txtDisplay.setText(result);
                }
            });
        }


        btnResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        clearButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtDisplay.setText("");
            }
        });

        rdoBtnDecimal.setChecked(true);

    }

}


