package allisonchow.greengreen;

import android.app.Application;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Objects;

public class MyApplication extends Application {

    private String fName;
    private String lName;
    private String uName;
    private ArrayList<Object> list1 = new ArrayList<Object>();

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
        return list1;
    }

    public void setList(ArrayList list) {
        this.list1 = list1;
    }

    public void addTitle(Button b) {
        list1.add(b);
    }

    public void addTask(String t) {
        list1.add(t);
    }

    public void deleteTitle(int b) {
        list1.remove(b);
        int i = b;
        while (!(list1.get(i+1) instanceof Button)) {
            list1.remove(b);
        }
    }

    public void deleteTask(int t) {
        list1.remove(t);
    }

    public void setText(String a) {
        setText(a);
    }


    public Object getTask(int a) {
        return list1.get(a);
    }


}
