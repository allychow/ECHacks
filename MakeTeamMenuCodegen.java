package allisonchow.greengreen;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by allis on 11/6/2016.
 */
public class MakeTeamMenuCodegen extends AppCompatActivity {
    private TextView textView6, textView7;
    private EditText editText11;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.make_team_menu_codegen);
        button5 = (Button) findViewById(R.id.button5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        editText11 = (EditText) findViewById(R.id.editText11);
    }

    public void genCode() {
        Random rand = new Random();
        int n = rand.nextInt(9999);
        editText11.setText(n);
    }
}
