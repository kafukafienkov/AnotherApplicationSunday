package pl.szkolenieandroid.anotherapplicationsunday;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyCustomObject object = getObjects().get(position);
                Toast.makeText(MyListActivity.this, "Kliknąłem na " + object.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<MyCustomObject> getObjects() {
        return MyCustomObject.generateList();
    }
}
