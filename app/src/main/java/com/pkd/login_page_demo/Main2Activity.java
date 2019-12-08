package com.pkd.login_page_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.String;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Button submit_button = (Button)findViewById(R.id.id_submit);
//        EditText email = (EditText)findViewById(R.id.id_email);
//        EditText pw = (EditText)findViewById(R.id.id_pw);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView next_screen = (TextView)findViewById(R.id.id_login_succes);
        next_screen.setText(message);

//        String input_email = email.getText().toString();
//        String input_pw = pw.getText().toString();
//
//        if (input_email.equals("john.doe@example.com") && input_pw.equals("12345678")) {
//            next_screen.setText("Login Successful");
//        } else {
//            next_screen.setText("Incorrect Email or Password");
//        }
    }
}
