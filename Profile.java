package allisonchow.greengreen;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.app.ActionBar;


public class Profile extends AppCompatActivity {

    private TextView fnameProfile, lnameProfile, usernameProfile;
    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        getSupportActionBar().hide();
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        fnameProfile = (TextView) findViewById(R.id.fnameProfile);
        fnameProfile.setText(((MyApplication) this.getApplication()).getFName());
        lnameProfile = (TextView) findViewById(R.id.lnameProfile);
        lnameProfile.setText(((MyApplication) this.getApplication()).getLName());
        usernameProfile = (TextView) findViewById(R.id.usernameProfile);
        usernameProfile.setText(((MyApplication) this.getApplication()).getUName());

    }

}
