package id.ac.poliban.mi.firah.listviewclubligaenglish;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Tim> tims = new ArrayList<>();
    private ListView lvTim;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTim = findViewById(R.id.listview);
        tims.addAll(TimData.getTimList());
        adapter =new TimAdapter(tims);
        lvTim.setAdapter(adapter);

        lvTim.setOnItemClickListener(((parent, view, position, id) -> {
            new  AlertDialog.Builder(this)
                    .setTitle("INFO")
                    .setMessage(tims.get(position).toString())
                    .setPositiveButton("OK", null).show();
        }));
    }
}
