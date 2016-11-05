package com.example.andrewseto.echacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.PopupMenu;
import android.widget.ActionMenuView;
import android.view.MenuInflater;
import android.view.MenuItem;

import org.w3c.dom.Text;

public class Profile extends Activity {
    private Button joinTeamButton;
    private TextView joinTeamView, nameView;
    private EditText joinTeamEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_screen);
        joinTeamView = (TextView) findViewById(R.id.joinTeamView);
        joinTeamButton = (Button) findViewById(R.id.joinTeamButton);
        joinTeamEdit = (EditText) findViewById(R.id.joinTeamEdit);
        nameView = (TextView) findViewById(R.id.nameView);

    }


    /*public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.actions, popup.getMenu());
        popup.show();
    }*/


}
