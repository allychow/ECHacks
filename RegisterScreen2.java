package com.example.andrewseto.echacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterScreen2 extends Activity {
    private Button enterButton;
    private EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2_screen);
        enterButton = (Button) findViewById(R.id.enter_Button);
        username = (EditText) findViewById(R.id.get_Username);
        password = (EditText) findViewById(R.id.get_Password);

    }
    public void onEnterButtonClick(View view){
        try {
            String user = String.valueOf(username.getText());
            String pass = String.valueOf(password.getText());

        }catch (Exception e){
            Toast.makeText(this, "Please fill all boxes", Toast.LENGTH_SHORT).show();
        }



    }

    public void goToMain (View view){
        Intent getMainScreenIntent = new Intent(this, WelcomeScreen.class);

        startActivity(getMainScreenIntent);

    }

}
