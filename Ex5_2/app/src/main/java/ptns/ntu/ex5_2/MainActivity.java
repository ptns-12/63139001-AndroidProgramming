package ptns.ntu.ex5_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextSo1, editTextSo2, editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetQua);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);

        // Set sự kiện click cho các button
        nutCong.setOnClickListener(this);
        nutTru.setOnClickListener(this);
        nutNhan.setOnClickListener(this);
        nutChia.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onClick(View v) {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();

        if (so1.isEmpty() || so2.isEmpty()) {
            editTextKQ.setText("Vui lòng nhập số");
            return;
        }

        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float ketQua = 0;

        if (v.getId() == R.id.btnCong) {
            ketQua = num1 + num2;
        } else if (v.getId() == R.id.btnTru) {
            ketQua = num1 - num2;
        } else if (v.getId() == R.id.btnNhan) {
            ketQua = num1 * num2;
        } else if (v.getId() == R.id.btnChia) {
            if (num2 == 0) {
                editTextKQ.setText("Không thể chia cho 0");
                return;
            }
            ketQua = num1 / num2;
        }
        editTextKQ.setText(String.valueOf(ketQua));

    }
}