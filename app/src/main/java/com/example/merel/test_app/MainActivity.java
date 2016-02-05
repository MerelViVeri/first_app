package com.example.merel.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText firstEntry;
    EditText secondEntry;
    TextView answer;

    RadioButton add;
    RadioButton sub;
    RadioButton mult;
    RadioButton div;

    Button comp;

    int calc;

    String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEntry = (EditText) findViewById(R.id.firstEntryNum);
        secondEntry = (EditText) findViewById(R.id.secondEntryNum);
        answer = (TextView) findViewById(R.id.answer);

        add = (RadioButton) findViewById(R.id.addButton);
        sub = (RadioButton) findViewById(R.id.subtractButton);
        mult = (RadioButton) findViewById(R.id.multiplyButton);
        div = (RadioButton) findViewById(R.id.divideButton);

        comp = (Button) findViewById(R.id.computeButton);
        /*
        add.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                selected = "add";
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = "sub";
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = "mult";
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected = "div";
            }
        });

        public void onRadioButtonClicked(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.addButton:
                    if (checked)
                        selected = "add";
                        break;
                case R.id.subtractButton:
                    if (checked)
                        selected = "sub";
                        break;
                case R.id.multiplyButton:
                    if (checked)
                        selected = "mult";
                        break;
                case R.id.divideButton:
                    if (checked)
                        selected = "div";
                        break;
            }
        }
        */

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstTemp = firstEntry.getText().toString();
                String secondTemp = secondEntry.getText().toString();
                int first = Integer.parseInt(firstTemp);
                int second = Integer.parseInt(secondTemp);

                if(Objects.equals(selected, "add")) {
                    calc = first + second;
                }else if(Objects.equals(selected, "sub")){
                    calc = first - second;
                }else if(Objects.equals(selected, "mult")){
                    calc = first * second;
                }else if(Objects.equals(selected, "div")) {
                    calc = first / second;
                }
                answer.setText("" + calc);
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.addButton:
                if (checked)
                    selected = "add";
                break;
            case R.id.subtractButton:
                if (checked)
                    selected = "sub";
                break;
            case R.id.multiplyButton:
                if (checked)
                    selected = "mult";
                break;
            case R.id.divideButton:
                if (checked)
                    selected = "div";
                break;
        }
    }
}
