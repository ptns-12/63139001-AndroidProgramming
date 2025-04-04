package ptns.ntu.thigk2phamtrannhatsang;

import android.content.Intent;
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

public class ChucNang3Activity extends AppCompatActivity {
    ListView listViewdsmonhoc;
    ArrayList<String> dsmonhoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dsmonhoc = new ArrayList<String>();
        dsmonhoc.add("toan");
        dsmonhoc.add("ly");
        dsmonhoc.add("hoa");
        dsmonhoc.add("van");

        ArrayAdapter<String> adapterMH;
        adapterMH = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,dsmonhoc
        );
        //b3 gan adapter
        listViewdsmonhoc = findViewById(R.id.listViewMH);
        listViewdsmonhoc.setAdapter(adapterMH);

        //b4 gan bo lang nghe xu ly su kien
        listViewdsmonhoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectitem = dsmonhoc.get(position); // vi tri chon
                Toast.makeText(ChucNang3Activity.this, "Ban da chon: " + selectitem, Toast.LENGTH_LONG).show();


                Intent intent = new Intent(ChucNang3Activity.this, ItemChucNang3Activity.class);
                //vi tri duoc chon
                intent.putExtra("selected_item", selectitem);
                startActivity(intent);
            }
        });
    }
}