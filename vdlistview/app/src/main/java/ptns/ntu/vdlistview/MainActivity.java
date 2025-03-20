package ptns.ntu.vdlistview;

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
    ListView listViewBaitap;
    ArrayList<String> dsbaitap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listViewBaitap = findViewById(R.id.lvdsbt);
        dsbaitap = new ArrayList<String>();
        dsbaitap.add("bai1");
        dsbaitap.add("bai1");
        dsbaitap.add("bai1");
        dsbaitap.add("bai1");

        ArrayAdapter<String> adapterdsbaitap;
        adapterdsbaitap = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line,dsbaitap
        );
        listViewBaitap.setAdapter(adapterdsbaitap);
        listViewBaitap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatriduocchon = dsbaitap.get(position);
                Toast.makeText(MainActivity.this,giatriduocchon,Toast.LENGTH_LONG).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}