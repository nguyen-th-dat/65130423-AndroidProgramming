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
    //Khai bao
    EditText so1, so2, KQ;
    String strA, strB, strKQ;
    float a, b, kq;

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
        TimDieuKhien();
    }

    void TimDieuKhien(){
        so1 = findViewById(R.id.edtSo1);
        so2 = findViewById(R.id.edtSo2);
        KQ = findViewById(R.id.edtKetQua);
    }


    boolean XyLyDuLieu() {

        try {
            // Lấy chuỗi và xóa khoảng trắng thừa
            strA = so1.getText().toString().trim();
            strB = so2.getText().toString().trim();

            // Kiểm tra nếu ô nhập bị bỏ trống
            if (strA.isEmpty() || strB.isEmpty()) {
                KQ.setText("Lỗi: Vui lòng nhập đủ 2 số!");
                return false;
            }

            // Chuyển sang số
            a = Float.parseFloat(strA);
            b = Float.parseFloat(strB);
            return true;

        } catch (NumberFormatException e) {
            // Nếu nhập chữ hoặc ký tự đặc biệt
            KQ.setText("Lỗi: Nhập sai định dạng số!");
            return false;
        }
    }

    public void XuLyCong(View view){
        if (XyLyDuLieu()) {
            kq = a + b;
            InKQ(kq);
        }
    }
    public void XuLyTru(View view){
        if (XyLyDuLieu()) {
            kq = a - b;
            InKQ(kq);
        }
    }
    public void XuLyNhan(View view){
        if (XyLyDuLieu()) {
            kq = a * b;
            InKQ(kq);
        }
    }
    public void XuLyChia(View view){
        if (XyLyDuLieu()) {
            kq = a / b;
            InKQ(kq);
        }
    }

    public void InKQ(float kq) {
        strKQ = String.valueOf(kq);
        KQ.setText(String.valueOf(strKQ));
    }

}