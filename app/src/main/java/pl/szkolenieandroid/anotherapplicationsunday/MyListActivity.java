package pl.szkolenieandroid.anotherapplicationsunday;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;


public class MyListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        initListView();

    }

    private void initListView() {
        ListView listView = (ListView) findViewById(R.id.listView);
        MyObjectAdapter adapter = new MyObjectAdapter(this, R.layout.item_row, getObjects());
        listView.setAdapter(adapter);
    }

    private List<MyCustomObject> getObjects() {
        return MyCustomObject.generateList();
    }
}
