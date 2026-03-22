package nguyenthanhdat.androidprogramming.baith6_xulysukien_tinhtong;

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

    // Bộ lắng nghe và xử lí lên nút tính tổng
    public void XuLyCong(View view){
        // Tìm, tham chiếu đến file xml
        EditText textA = findViewById(R.id.editTextA);
        EditText textB = findViewById(R.id.editTextB);
        EditText textKQ = findViewById(R.id.editTextKQ);

        // Láy dữ liệu a
        String strA = textA.getText().toString();
        // Lấy dữ liệu b
        String strB = textB.getText().toString();

        // Chuyển dữ liệu đã lấy sang dạng số
        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        //Tinh toan Cong
        int tong = a + b;
        // chuyển sang tong sang dạng chuỗi
        String strTong = String.valueOf(tong);
        //Hiện ra kết quả
        textKQ.setText(strTong);
    }
}