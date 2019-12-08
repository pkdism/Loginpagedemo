package com.pkd.login_page_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.text.Editable;
import android.widget.TextView;

import java.lang.String;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.pkd.login_page_demo.MESSAGE";
//    private Button submit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        submit_button = (Button) findViewById(R.id.id_submit);
//        submit_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivity2();
//            }
//        });
    }


    public void nextAct(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        EditText email = (EditText)findViewById(R.id.id_email);
        EditText pw = (EditText)findViewById(R.id.id_pw);
        String input_email = email.getText().toString();
        String input_pw = pw.getText().toString();
        String message = "";
        if (input_email.equals("john.doe@example.com") && input_pw.equals("12345678")) {
            message = "Login Successful";
        } else {
            message = "Incorrect Email or Password";
        }
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}
