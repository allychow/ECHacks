package com.example.andrewseto.echacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.*;
import org.json.JSONArray;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONObject;


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
