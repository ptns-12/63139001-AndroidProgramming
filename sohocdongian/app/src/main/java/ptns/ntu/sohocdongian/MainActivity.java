package ptns.ntu.sohocdongian;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editA, editB;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Khởi tạo các thành phần giao diện
        editA = findViewById(R.id.edtA);
        editB = findViewById(R.id.edtB);
        tvResult = findViewById(R.id.tvResult);

        // Gán sự kiện cho các nút
        findViewById(R.id.btnCong).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Cong(v);
            }
        });

        findViewById(R.id.btnTru).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Tru(v);
            }
        });

        findViewById(R.id.btnNhan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Nhan(v);
            }
        });

        findViewById(R.id.btnChia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Chia(v);
            }
        });
    }

    // Hàm xử lý phép cộng
    public void XuLy_Cong(View view) {
        // Lấy số thứ nhất
        int soA = Integer.parseInt(editA.getText().toString());

        // Lấy số thứ hai
        int soB = Integer.parseInt(editB.getText().toString());

        // Xử lý
        int ketQua = soA + soB;

        // Hiển thị kết quả
        tvResult.setText(String.valueOf(ketQua));
    }

    // Hàm xử lý phép trừ
    public void XuLy_Tru(View view) {
        // Lấy số thứ nhất
        int soA = Integer.parseInt(editA.getText().toString());

        // Lấy số thứ hai
        int soB = Integer.parseInt(editB.getText().toString());

        // Xử lý
        int ketQua = soA - soB;

        // Hiển thị kết quả
        tvResult.setText(String.valueOf(ketQua));
    }

    // Hàm xử lý phép nhân
    public void XuLy_Nhan(View view) {
        // Lấy số thứ nhất
        int soA = Integer.parseInt(editA.getText().toString());

        // Lấy số thứ hai
        int soB = Integer.parseInt(editB.getText().toString());

        // Xử lý
        int ketQua = soA * soB;

        // Hiển thị kết quả
        tvResult.setText(String.valueOf(ketQua));
    }

    // Hàm xử lý phép chia
    public void XuLy_Chia(View view) {
        // Lấy số thứ nhất
        int soA = Integer.parseInt(editA.getText().toString());

        // Lấy số thứ hai
        int soB = Integer.parseInt(editB.getText().toString());

        // Kiểm tra chia cho 0
        if (soB != 0) {
            float ketQua = (float) soA / soB;
            tvResult.setText(String.valueOf(ketQua));
        } else {
            tvResult.setText("Không thể chia cho 0");
        }
    }
}