package com.var.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _email = email.getText().toString().trim();
                String _pass = password.getText().toString().trim();
                if(TextUtils.isEmpty(_email)){
                    email.setError("Email is required");
                    return;
                }
                if(_pass.length() <= 8 ){
                    password.setError("Password Must be >= 8 Characters");
                    return;
                }
                if(_pass.length() >= 20 ){
                    password.setError("Password Must be <= 20 Characters");
                    return;
                }

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("EMAIL",_email);
                startActivity(intent);

            }
        });
    }
}