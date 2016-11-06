package com.example.andrewseto.echacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ImageButton;

public class EditGoal extends Activity implements OnItemSelectedListener {

    private EditText goalName;
    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    spinner.setOnItemSelectedListener(this);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
      R.array.edit_array, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    List<String> teamList;
    teamList.add("Team Members");
    List<String> taskList;
    taskList.add("Tasks");
    private Button saveButton;
    private ImageButton addButton, editButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_goal);
        goalName = (EditText) findViewById(R.id.goal_name);
        teamList = new ArrayList<String>();
        taskList = new ArrayList<String>();
        saveButton = (Button) findViewById(R.id.save_button);
        addButton = (ImageButton) findViewById(R.id.add_button);
        editButton = (ImageButton) findViewById(R.id.edit_button);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
      if (pos == 0) {
        goToTeam();
      } else if (pos == 1) {
        goToTasks();
      }
    }

    public void onNothingSelected(Adapterview<?> parent) {

    }

    public void goToMainScreenIndex(View view) {
      Intent getMain_Screen_Index = new Intent(this, Main_Screen_Index.class);
      startActivity(getMain_Screen_Index);
    }

    public void makeEditable() {
      
    }



}
