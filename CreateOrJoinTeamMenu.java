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
public class CreateOrJoinTeamMenu extends AppCompatActivity {
    private TextView textView2, textView3;
    private Button button2,button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_or_join_team_menu);
        button2 = (Button) findViewById(R.id.button2);
        button = (Button) findViewById(R.id.button);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
    }

    public void goToMakeTeamMenuCodegen(View view) {
        Intent getMakeTeamIntent = new Intent(this, MakeTeamMenuCodegen.class);
        startActivity(getMakeTeamIntent);
    }

    public void goToJoinTeamMenu(View view) {
        Intent getJoinTeamIntent = new Intent(this, JoinTeamMenu.class);
        startActivity(getJoinTeamIntent);
    }
}
