package com.example.bootcampapp.Screens.Screens.Helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bootcampapp.R;

public class FlutterActivity extends AppCompatActivity {
    private String[] questionArray = {"Q.1 Which company developed android?", "Q2. What is the current version of android studio?", "Q.3 Official language of android?", "Q.4 Who is the enemy of Android?"};

    private String[] btn1_text = {"Google", "Flamingo", "Swift", "Windows"};
    private String[] btn2_text = {"Microsoft", "Giraffe", "Java", "Blackberry"};
    private String[] btn3_text = {"JetBrains", "Hedgehog", "Cpp", "iOS"};
    private String[] btn4_text = {"Amazon", "Monkey", "Kotlin", "Linux"};

    private boolean[] validateOpt1 = {true, false, false, false};
    private boolean[] validateOpt2 = {false, false, false, false};
    private boolean[] validateOpt3 = {false, true, false, true};
    private boolean[] validateOpt4 = {false, false, true, false};


    private int index = 0;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);

        TextView question = findViewById(R.id.question);

        Button btn1 = findViewById(R.id.opt1);
        Button btn2 = findViewById(R.id.opt2);
        Button btn3 = findViewById(R.id.opt3);
        Button btn4 = findViewById(R.id.opt4);

        question.setText(questionArray[index]);

        btn1.setText(btn1_text[index]);
        btn2.setText(btn2_text[index]);
        btn3.setText(btn3_text[index]);
        btn4.setText(btn4_text[index]);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index <= questionArray.length - 1){
                    boolean[] currentValidation = null;
                    Button clickedButton = (Button) view;

                    if(view == btn1) {
                        currentValidation = validateOpt1;
                    } else if (view == btn2) {
                        currentValidation = validateOpt2;
                    }else if (view == btn3) {
                        currentValidation = validateOpt3;
                    }else if (view == btn4) {
                        currentValidation = validateOpt4;
                    }

                    if(currentValidation != null){
                        if(currentValidation[index]){
                            score++;
                        }
                        index++;
                        if(index <= questionArray.length-1){

                            question.setText(questionArray[index]);

                            btn1.setText(btn1_text[index]);
                            btn2.setText(btn2_text[index]);
                            btn3.setText(btn3_text[index]);
                            btn4.setText(btn4_text[index]);
                        }else {
                            Toast.makeText(FlutterActivity.this, "Score : "+ score, Toast.LENGTH_SHORT).show();

                        }
                    }
                }
            }
        };

        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);

    }
}