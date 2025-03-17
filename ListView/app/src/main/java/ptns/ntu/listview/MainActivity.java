package ptns.ntu.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewNNLT;
    //khai bao du lieu
    ArrayList<String> dsNgonNguLT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewNNLT = findViewById(R.id.lvNNLT);
        //b1. chuan bi du lieu
        dsNgonNguLT = new ArrayList<String>();
        dsNgonNguLT.add("python");
        dsNgonNguLT.add("php");
        dsNgonNguLT.add("java");
        //b2
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,dsNgonNguLT
        );
        //b3 gan adapter
        listViewNNLT.setAdapter(adapterNNLT);

        //b4 gan bo lang nghe va xu ly su kien
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //xu ly
                String giaTriDuocChon = dsNgonNguLT.get(position);
                //
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });

    }
}