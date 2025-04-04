package ptns.ntu.thigk2phamtrannhatsang;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void TinhDiemTB(View view){
        EditText edta = findViewById(R.id.edtA);
        EditText edtb = findViewById(R.id.edtB);
        EditText edtkq = findViewById(R.id.edtkq);

        String stra = edta.getText().toString();
        String strb = edtb.getText().toString();

        int soA = Integer.parseInt(stra);
        int soB = Integer.parseInt(strb);

        int tong = (soA + soB) / 2;

        String strTong = String.valueOf(tong);
        edtkq.setText(strTong);
    }
}