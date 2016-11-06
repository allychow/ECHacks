package allisonchow.greengreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import java.io.InputStream;
import java.net.URL;
import java.util.*;
import android.graphics.drawable.Drawable;

public class RewardScreen extends AppCompatActivity {

    private TextView rewardTitle, congrats_1;
    private Button redeemButton;
    List<Object> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_screen);
        rewardTitle = (TextView) findViewById(R.id.rewardTitle);
        redeemButton = (Button) findViewById(R.id.redeemButton);
        congrats_1 = (TextView) findViewById(R.id.congrats_1);
        list = new ArrayList<Object>();
        Drawable a = LoadImageFromWebOperations(("https://developer.ibm.com/watson/wp-content/uploads/sites/19/2015/05/55914890.jpg"));
        list.add(a); //will fix later

    }

    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, "src name");
            return d;
        } catch (Exception e) {
            return null;
        }
    }



}
