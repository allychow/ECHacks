package com.example.andrewseto.echacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends Activity {
    private Button joinTeamButton;
    private TextView joinTeamView, nameView;
    private EditText joinTeamEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        joinTeamView = (TextView) findViewById(R.id.joinTeamView);
        joinTeamButton = (Button) findViewById(R.id.joinTeamButton);
        joinTeamEdit = (EditText) findViewById(R.id.joinTeamEdit);
        nameView = (TextView) findViewById(R.id.nameView);

        gotoRewardScreen(view);
    }
    public void gotoRewardScreen(View view) {
        Intent getRewardScreenIntent = new Intent(this, RewardScreen.class);
        startActivity(getRewardScreenIntent);
    }

}
