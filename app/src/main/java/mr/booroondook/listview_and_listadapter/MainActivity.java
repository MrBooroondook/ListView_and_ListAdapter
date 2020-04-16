package mr.booroondook.listview_and_listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] lastNames = getResources().getStringArray(R.array.last_names);
        ListView listView = findViewById(R.id.list_view);
        textView = findViewById(R.id.text_view);

        listView.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                lastNames));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(lastNames[position]);
            }
        });
    }
}
