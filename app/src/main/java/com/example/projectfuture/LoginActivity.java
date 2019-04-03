package com.example.projectfuture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText phno,pwd;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phno=findViewById(R.id.loginphoneno);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneno=phno.getText().toString();
            }
        });

    }
    public void notHaveAcc(View view){
        Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(i);
    }
}
