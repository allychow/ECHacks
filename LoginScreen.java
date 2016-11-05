package com.example.andrewseto.echacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends Activity {

    private TextView username, password;
    private Button loginButton;
    private EditText userText, passText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        loginButton = (Button) findViewById(R.id.loginButton);
        userText = (EditText) findViewById(R.id.get_User_Text);
        passText = (EditText) findViewById(R.id.get_Pass_Text);
        username = (TextView) findViewById(R.id.user_name);
        password = (TextView) findViewById(R.id.pass_word);

    }

    public void validate(boolean a) {
        if (a) {
            goToProfile();
        } else {
            Toast.makeText(LoginScreen.this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToProfile(View view) {
        Intent getLoginScreenIntent = new Intent(this, LoginScreen.class);
        startActivity(getLoginScreenIntent);
    }


}
