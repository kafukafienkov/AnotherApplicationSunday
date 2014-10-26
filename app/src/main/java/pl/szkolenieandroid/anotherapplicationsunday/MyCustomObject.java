package pl.szkolenieandroid.anotherapplicationsunday;

import org.w3c.dom.ProcessingInstruction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bartek on 26.10.14.
 */
public class MyCustomObject {

    private String name;

    private boolean checked;

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {

        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public MyCustomObject(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<MyCustomObject> generateList() {
        List<MyCustomObject> result = new ArrayList<MyCustomObject>();

        for (int i = 0; i < 120 ; i++) {
            MyCustomObject myCustomObject = new MyCustomObject("Jan " + i);
            result.add(myCustomObject);
        }

        return result;

    }

}
