package com.example.sheeshmahal.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sheeshmahal.HomeActivity;
import com.example.sheeshmahal.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void SignIn(View view) {
        startActivity(new Intent( RegistrationActivity.this, LoginActivity.class));
    }


    public void homeActivity(View view) {
        startActivity(new Intent( RegistrationActivity.this, HomeActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent( RegistrationActivity.this, MainActivity.class));
    }
}