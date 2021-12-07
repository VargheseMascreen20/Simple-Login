package com.var.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = findViewById(R.id.txt);

        String email = getIntent().getExtras().getString("EMAIL");
        t1.setText(email+",\nYou have successfully logged in");

    }
}