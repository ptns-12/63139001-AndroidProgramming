package ptns.ntu.vdtrenlop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    TextView edtkq;
    EditText tvA, tvB;
    void timdieukhien(){
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        edtkq = (TextView) findViewById(R.id.edtkq);
        tvA = (EditText) findViewById(R.id.tv1);
        tvB = (EditText) findViewById(R.id.tvB);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        timdieukhien();

        //edtkq = findViewById(R.id.edtkq);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void nutbam1(View v){
        edtkq.setText("1");
    }
    public void nutbam2(View v){
        edtkq.setText("2");
    }
    public void nutbam3(View v){
        edtkq.setText("3");
    }
    public void nutbam4(View v){
        edtkq.setText("4");
    }
    public void nutbam5(View v){
        edtkq.setText("5");
    }
    public void nutbam6(View v){
        edtkq.setText("6");
    }
    public void nutbam7(View v){
        edtkq.setText("7");
    }
    public void nutbam8(View v){
        edtkq.setText("8");
    }
    public void nutbam9(View v){
        edtkq.setText("9");
    }
    public void tinhKetQua(View v){
        int a = Integer.parseInt(tvA.getText().toString());
        int b = Integer.parseInt(tvB.getText().toString());
        int ketqua = a + b;
        edtkq.setText(String.valueOf(ketqua));
    }
}