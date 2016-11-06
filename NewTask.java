package allisonchow.greengreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by allis on 11/6/2016.
 */
public class NewTask extends Activity {

    private EditText objectiveName, tasks;
    private Button newSaveButton;
    private Button taskSaveButton;
    private int total = 0;
    private Button[] objectives = new Button[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_task);
        newSaveButton = (Button) findViewById(R.id.newSaveButton);
        objectiveName = (EditText) findViewById(R.id.objectiveName);
        tasks = (EditText) findViewById(R.id.tasks);
        taskSaveButton = (Button) findViewById(R.id.taskSaveButton);
        tasks.setEnabled(true);
        objectiveName.setEnabled(true);

    }

    public void saveTask() {
        ((MyApplication) this.getApplication()).addTask(tasks.getText().toString());
        tasks.setText("");
    }

    public void goToMainScreenIndex(View view) {
        Intent getMainScreenIntent = new Intent(this, MainScreenIndex.class);
        startActivity(getMainScreenIntent);
        saveObjective();
    }

    public void saveObjective() {
        objectives[total].setText(objectiveName.getText());
        ((MyApplication) this.getApplication()).addTitle(objectives[total]);
        total++;
        if (!(tasks.getText().equals(""))) {
            saveTask();
        }
        objectiveName.setEnabled(false);
        tasks.setEnabled(false);
    }


}
