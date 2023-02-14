package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnCapturedPointerListener, View.OnClickListener {
    private TextView signintext;
    private EditText emailtext;
    private EditText passwordtext;
    private Button signinbutton;
    private Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signintext = findViewById(R.id.signin);
        emailtext= findViewById(R.id.email);
        passwordtext= findViewById(R.id.password);
        signinbutton= findViewById(R.id.signinbutton);
        signupbutton= findViewById(R.id.signupbutton);
        signinbutton.setOnClickListener(this);
        signupbutton.setOnClickListener(this);
    }

    @Override
    public boolean onCapturedPointer(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onClick(View view) {
        if(view==signupbutton)
        {
            emailtext.setText(view.getTooltipText());
            passwordtext.setText(view.getTooltipText());
        }


    }
}