package nguyenthanhdat.androidprogramming.baith4_linearlayout_tong2so;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyCong(View view){
        // Tìm, tham chiếu đến file xml
        EditText so1 = findViewById(R.id.edtSo1);
        EditText so2 = findViewById(R.id.edtSo2);
        EditText textKQ = findViewById(R.id.edtKetQua);

        // Láy dữ liệu số thứ nhất
        String strA = so1.getText().toString();
        // Lấy dữ liệu số thứ hai
        String strB = so2.getText().toString();

        // Chuyển dữ liệu đã lấy sang dạng số
        float a = Float.parseFloat(strA);
        float b = Float.parseFloat(strB);

        //Tinh toan Cong
        float tong = a + b;
        // chuyển sang tong sang dạng chuỗi
        String strTong = String.valueOf(tong);
        //Hiện ra kết quả
        textKQ.setText(strTong);
    }

    public void XuLyTru(View view){
        // Tìm, tham chiếu đến file xml
        EditText so1 = findViewById(R.id.edtSo1);
        EditText so2 = findViewById(R.id.edtSo2);
        EditText textKQ = findViewById(R.id.edtKetQua);

        // Láy dữ liệu số thứ nhất
        String strA = so1.getText().toString();
        // Lấy dữ liệu số thứ hai
        String strB = so2.getText().toString();

        // Chuyển dữ liệu đã lấy sang dạng số
        float a = Float.parseFloat(strA);
        float b = Float.parseFloat(strB);

        //Tinh toan Tru
        float tong = a - b;
        // chuyển sang tong sang dạng chuỗi
        String strTong = String.valueOf(tong);
        //Hiện ra kết quả
        textKQ.setText(strTong);
    }

    public void XuLyNhan(View view){
        // Tìm, tham chiếu đến file xml
        EditText so1 = findViewById(R.id.edtSo1);
        EditText so2 = findViewById(R.id.edtSo2);
        EditText textKQ = findViewById(R.id.edtKetQua);

        // Láy dữ liệu số thứ nhất
        String strA = so1.getText().toString();
        // Lấy dữ liệu số thứ hai
        String strB = so2.getText().toString();

        // Chuyển dữ liệu đã lấy sang dạng số
        float a = Float.parseFloat(strA);
        float b = Float.parseFloat(strB);

        //Tinh toan Nhan
        float tong = a * b;
        // chuyển sang tong sang dạng chuỗi
        String strTong = String.valueOf(tong);
        //Hiện ra kết quả
        textKQ.setText(strTong);
    }

    public void XuLyChia(View view){
        // Tìm, tham chiếu đến file xml
        EditText so1 = findViewById(R.id.edtSo1);
        EditText so2 = findViewById(R.id.edtSo2);
        EditText textKQ = findViewById(R.id.edtKetQua);

        // Láy dữ liệu số thứ nhất
        String strA = so1.getText().toString();
        // Lấy dữ liệu số thứ hai
        String strB = so2.getText().toString();

        // Chuyển dữ liệu đã lấy sang dạng số thực
        float a = Float.parseFloat(strA);
        float b = Float.parseFloat(strB);

        //Tinh toan Chia
        float tong = a / b;
        // chuyển sang tong sang dạng chuỗi
        String strTong = String.valueOf(tong);
        //Hiện ra kết quả
        textKQ.setText(strTong);
    }

}