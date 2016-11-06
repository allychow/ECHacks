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
public class JoinTeamMenu extends Activity {

    private TextView textView4;
    private EditText editText;
    private Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_team_menu);
        editText = (EditText) findViewById(R.id.editText);
        button3 = (Button) findViewById(R.id.button3);
        textView4 = (TextView) findViewById(R.id.textView4);
    }

    public void goToMainScreenIndex(View view) {
        Intent getMainScreenIndex = new Intent(this, MainScreenIndex.class);
        startActivity(getMainScreenIndex);
    }


}
