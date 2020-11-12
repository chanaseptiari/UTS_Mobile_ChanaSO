package com.example.uts_chanaso_2018310078;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnLogin, btnRegis;
TextView user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button
        btnLogin = findViewById(R.id.btnLogin);
        btnRegis = findViewById(R.id.btnRegis);

        btnLogin.setOnClickListener(this);
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register Belum Tersedia", Toast.LENGTH_LONG).show();
            }}
        );

        // Get Field
        user = findViewById(R.id.inputUser);
        pass = findViewById(R.id.inputPass);


    }

    @Override
    public void onClick(View v) {
        String userName = user.getText().toString();
        String passWord = pass.getText().toString();
        if(v.getId() == R.id.btnLogin){
            if(userName.length() >= 7 && passWord.length() >= 5 ){
                Intent goHome = new Intent( this, homeActivity.class);
                goHome.putExtra("userName",userName.toUpperCase());
                startActivity(goHome);
            } else if(userName.length() < 7) {
                user.setError("Username Harus Lebih Dari 7 Kata");
            } else if(passWord.length() < 5){
                pass.setError("Password Harus Lebih Dari 5 Kata");
            }
        }
    }
}