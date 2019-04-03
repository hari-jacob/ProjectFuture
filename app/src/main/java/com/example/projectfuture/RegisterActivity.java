package com.example.projectfuture;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText regnumber,verifyotp;
    Button sendotp;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regnumber=findViewById(R.id.regphoneno);
        verifyotp=findViewById(R.id.verifyotp);
        sendotp=findViewById(R.id.regmob);

        sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verifyotp.setWidth(350);
                verifyotp.setBackgroundColor(Color.RED);
                verifyotp.setHint("Enter OTP");
//                Intent i=new Intent(RegisterActivity.this,RegisterActivity.class);
//                startActivity(i);
            }
        });
    }

}
