package com.example.mobilecourse;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SquaresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Animations();
        SumOfNumbers();
    }

    protected void Animations() {
        setContentView(R.layout.activity_animation_squares);
        View view = findViewById(R.id.s1);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation anim = AnimationUtils.loadAnimation(SquaresActivity.this, R.anim.scale_translate);

                view.startAnimation(anim);
            }
        });
    }

    protected void SumOfNumbers() {
        setContentView(R.layout.activity_sum_of_numbers);

        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        Button confirmButton = findViewById(R.id.confirmButton);
        Button cancelButton = findViewById(R.id.cancelButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1String = editText1.getText().toString();
                String number2String = editText2.getText().toString();

                if (!number1String.isEmpty() && !number2String.isEmpty()) {
                    int number1 = Integer.parseInt(number1String);
                    int number2 = Integer.parseInt(number2String);
                    int sum = number1 + number2;

                    Toast.makeText(SquaresActivity.this, "Сумма чисел: " + sum, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SquaresActivity.this, "Введите оба числа", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");

                Toast.makeText(SquaresActivity.this, "Очищено", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

