package allisonchow.greengreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterScreen extends Activity {
    private Button nextButton;
    private EditText firstName, lastName, email, number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_screen);
        nextButton = (Button) findViewById(R.id.nextButton);
        firstName = (EditText) findViewById(R.id.get_First_Name);
        lastName = (EditText) findViewById(R.id.get_Last_Name);
        email = (EditText) findViewById(R.id.get_Email);
        number = (EditText) findViewById(R.id.get_Number);

    }
    public void onNextButtonClick(View view){
        try {

            ((MyApplication) this.getApplication()).setFName(String.valueOf(firstName.getText()));
            ((MyApplication) this.getApplication()).setLName(String.valueOf(lastName.getText()));
            String emailStore = String.valueOf(email.getText());
            String numberStore = String.valueOf(number.getText());

        }catch (Exception e){
            Toast.makeText(this, "Please fill all boxes", Toast.LENGTH_SHORT).show();
        }

        goToRegister2(view);



    }

    public void goToRegister2 (View view){
        Intent getRegisterScreen2Intent = new Intent(this, RegisterScreen2.class);

        startActivity(getRegisterScreen2Intent);
    }

}
