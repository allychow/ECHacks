package allisonchow.greengreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by allis on 11/6/2016.
 */
public class MainScreenIndex extends Activity {
    private TextView textView;
    private Button NewTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_index);
        NewTaskButton = (Button) findViewById(R.id.NewTaskButton);
        textView = (TextView) findViewById(R.id.textView);
    }

}
