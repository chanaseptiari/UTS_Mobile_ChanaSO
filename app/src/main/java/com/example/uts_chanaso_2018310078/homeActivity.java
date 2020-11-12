package com.example.uts_chanaso_2018310078;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homeActivity extends AppCompatActivity implements View.OnClickListener {
Button btnLogout;
TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(this);

        name = findViewById(R.id.name);
        String data = getIntent().getStringExtra("userName");
        name.setText(data);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogout){
            Intent goLogin = new Intent(this, MainActivity.class);
            startActivity(goLogin);
        }

    }
}