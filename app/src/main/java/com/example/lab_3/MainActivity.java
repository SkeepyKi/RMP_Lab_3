package com.example.lab_3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLinear = findViewById(R.id.btn_linear);
        Button btnConstraint = findViewById(R.id.btn_constraint);

        btnLinear.setOnClickListener(v -> startActivity(new Intent(this, LinearLayoutActivity.class)));
        btnConstraint.setOnClickListener(v -> startActivity(new Intent(this, ConstraintLayoutActivity.class)));
    }
}