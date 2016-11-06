package allisonchow.greengreen;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by allis on 11/6/2016.
 */
public class MainScreenIndex extends ListActivity {
    private TextView textView;
    private Button NewTaskButton;
    ArrayAdapter<Object> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen_index);
        ArrayList<Object> s = ((MyApplication) this.getApplication()).getList();
        adapter=new ArrayAdapter<Object>(this,
                android.R.layout.simple_list_item_1,s);
        setListAdapter(adapter);
        NewTaskButton = (Button) findViewById(R.id.NewTaskButton);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void goToNewTask(View view) {
        Intent getNewTaskIntent = new Intent(this, NewTask.class);
      //  adapter.notifyDataSetChanged();
        startActivity(getNewTaskIntent);
    }

}
