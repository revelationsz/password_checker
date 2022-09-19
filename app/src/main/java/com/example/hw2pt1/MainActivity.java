package com.example.hw2pt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView password1 = findViewById(R.id.editTextTextPassword);
                TextView password2 = findViewById(R.id.editTextTextPassword2);
                TextView label = findViewById(R.id.textView);
                System.out.println(password1.getText() + " "  + password2.getText());
                if(password1.getText().toString().equals(password2.getText().toString())) {
                    label.setText("THANK YOU");
                } else {
                    label.setText("PASSWORDS MUST MATCH");
                }

            }
        });

    }
}