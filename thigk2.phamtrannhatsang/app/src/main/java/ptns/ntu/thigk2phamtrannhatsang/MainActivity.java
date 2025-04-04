package ptns.ntu.thigk2phamtrannhatsang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btnchucnang2 = findViewById(R.id.btn1);
        btnchucnang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencn2 = new Intent(MainActivity.this,ChucNang2Activity.class);
                startActivity(intencn2);
            }
        });

        Button btnchucnang3 = findViewById(R.id.btn2);
        btnchucnang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencn3 = new Intent(MainActivity.this,ChucNang3Activity.class);
                startActivity(intencn3);
            }
        });

        Button btnchucnangaboutme = findViewById(R.id.btn4);
        btnchucnangaboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencn4 = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intencn4);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}