package nguyenthanhdat.androidprogramming.baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1, edtSo2, edtKQ;
    String strA, strB, strKQ;
    float a, b, kq;
    Button btnCong, btnTru, btnNhan, btnChia;
    void TimDieuKhien(){
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);
        edtKQ = findViewById(R.id.edtKetQua);
        btnCong= findViewById(R.id.btnCong);
        btnTru= findViewById(R.id.btnTru);
        btnNhan= findViewById(R.id.btnNhan);
        btnChia= findViewById(R.id.btnChia);
    }

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

        // Gắn bộ lăng nghe sự kiện và code xử lí cho từng nút
        View.OnClickListener  boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lí cộng
                XuLyCong();

            }
        };
        btnCong.setOnClickListener(boLangNgheCong);

        //Inline anonymous listener
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý Trừ
                XuLyTru();
            }
        });

        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý Nhân
                XuLyNhan();
            }
        });

        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lí chia
                XuLyChia();
            }
        });
    }




    boolean XyLyDuLieu() {

        try {
            // Lấy chuỗi và xóa khoảng trắng thừa
            strA = edtSo1.getText().toString().trim();
            strB = edtSo2.getText().toString().trim();

            // Kiểm tra nếu ô nhập bị bỏ trống
            if (strA.isEmpty() || strB.isEmpty()) {
                edtKQ.setText("Lỗi: Vui lòng nhập đủ 2 số!");
                return false;
            }

            // Chuyển sang số
            a = Float.parseFloat(strA);
            b = Float.parseFloat(strB);
            return true;

        } catch (NumberFormatException e) {
            // Nếu nhập chữ hoặc ký tự đặc biệt
            edtKQ.setText("Lỗi: Nhập sai định dạng số!");
            return false;
        }
    }

    public void XuLyCong(){
        if (XyLyDuLieu()) {
            kq = a + b;
            InKQ(kq);
        }
    }
    public void XuLyTru(){
        if (XyLyDuLieu()) {
            kq = a - b;
            InKQ(kq);
        }
    }
    public void XuLyNhan(){
        if (XyLyDuLieu()) {
            kq = a * b;
            InKQ(kq);
        }
    }
    public void XuLyChia(){
        if (XyLyDuLieu()) {
            kq = a / b;
            InKQ(kq);
        }
    }

    public void InKQ(float kq) {
        strKQ = String.valueOf(kq);
        edtKQ.setText(String.valueOf(strKQ));
    }




}