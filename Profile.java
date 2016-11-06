package allisonchow.greengreen;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.app.ActionBar;


public class Profile extends Activity {

    private TextView fnameProfile, lnameProfile, usernameProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        fnameProfile = (TextView) findViewById(R.id.fnameProfile);
        fnameProfile.setText(((MyApplication) this.getApplication()).getFName());
        lnameProfile = (TextView) findViewById(R.id.lnameProfile);
        lnameProfile.setText(((MyApplication) this.getApplication()).getLName());
        usernameProfile = (TextView) findViewById(R.id.usernameProfile);
        usernameProfile.setText(((MyApplication) this.getApplication()).getUName());

    }

}
