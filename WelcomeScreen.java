package com.example.andrewseto.echacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WelcomeScreen extends AppCompatActivity {

    public Button logButton, registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        logButton = (Button) findViewById(R.id.logButton);
        registerButton = (Button) findViewById(R.id.registerButton);

    }

    public void goToLogin(View view) {
        Intent getLoginScreenIntent = new Intent(this, LoginScreen.class);
        startActivity(getLoginScreenIntent);
    }

    public void goToRegister(View view) {
        Intent getRegisterScreenIntent = new Intent(this, RegisterScreen.class);
        startActivity(getRegisterScreenIntent);
    }

}
