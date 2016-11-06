package allisonchow.greengreen;

import android.app.Application;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Objects;

public class MyApplication extends Application {

    private String fName;
    private String lName;
    private String uName;
    private ArrayList<Object> list;

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public ArrayList<Object> getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public void addTitle(Button b) {
        list.add(b);
    }

    public void addTask(String t) {
        list.add(t);
    }

    public void deleteTitle(int b) {
        list.remove(b);
        int i = b;
        while (!(list.get(i+1) instanceof Button)) {
            list.remove(b);
        }
    }

    public void deleteTask(int t) {
        list.remove(t);
    }

    public void setText(String a) {
        setText(a);
    }


    public Object getTask(int a) {
        return list.get(a);
    }


}
