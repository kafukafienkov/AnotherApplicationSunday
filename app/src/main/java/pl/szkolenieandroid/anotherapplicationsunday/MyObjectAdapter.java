package pl.szkolenieandroid.anotherapplicationsunday;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bartek on 26.10.14.
 */
public class MyObjectAdapter extends ArrayAdapter<MyCustomObject> {

    Activity context;

    List<MyCustomObject> list;

    public MyObjectAdapter(Activity context, int resource, List<MyCustomObject> objects) {
        super(context, resource, objects);
        this.context = context;
        list = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.item_row, null);

        MyCustomObject myCustomObject = list.get(position);

        TextView nameText = (TextView) rowView.findViewById(R.id.item_name);
        nameText.setText(myCustomObject.getName());

        return rowView;
    }
}
