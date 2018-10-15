package com.example.pet.orderfoods280918;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {
    FButton btnSignUp, btnSignIn;
    TextView txtSologan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSologan = findViewById(R.id.txtSologan);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignup);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/NABILA.TFF");
        txtSologan.setTypeface(typeface);
    }
}
