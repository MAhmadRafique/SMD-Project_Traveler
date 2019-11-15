package com.example.smd_project_traveler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnSignUpFacebook;
    private Button btnSignUpTwitter;
    private Button btnSignUpEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUpFacebook = findViewById(R.id.btn_signUpWithFacebook);
        btnSignUpTwitter = findViewById(R.id.btn_signUpWithTwitter);
        btnSignUpEmail = findViewById(R.id.btn_signUpWithEmail);

        btnSignUpFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Facebook SignUp", Toast.LENGTH_SHORT).show();
            }
        });
        btnSignUpTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Twitter SignUp", Toast.LENGTH_SHORT).show();
            }
        });
        btnSignUpEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Email SignUp", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LanguageTranslator.class);
                startActivity(intent);
            }
        });
    }
}
