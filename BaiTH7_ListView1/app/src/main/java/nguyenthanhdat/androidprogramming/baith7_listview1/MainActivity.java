package nguyenthanhdat.androidprogramming.baith7_listview1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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

        // Hiển thì dữ liệu lên listview

        // B1. Cần có Dữ liệu (Dữ liệu tứ SQL, noSQL, XML
        // Ở đây, ta dùng dữ liệu trực tiếp
        ArrayList<String> dsMenu; // Khai báo
        dsMenu = new ArrayList<String>(); //tạo thế hiện cụ thể, xin mới

        // thêm dữ liệu
        dsMenu.add("Cơm");
        dsMenu.add("Cơm Tấm");
        dsMenu.add("Cơm Chiên Dương Châu");
        dsMenu.add("Cơm Chiên Trứng");
        dsMenu.add("Cơm Chiên Muối É");
        dsMenu.add("Cơm Chiên Dưa Bò");
        dsMenu.add("Bún Cá");
        dsMenu.add("Bún Riêu");
        dsMenu.add("Bún Riêu Cua");
        dsMenu.add("Phở Bò");
        dsMenu.add("Phở Tái");
        dsMenu.add("Hủ Tiếu");
        dsMenu.add("Bún Bò");
        dsMenu.add("Mì Quảng");
        dsMenu.add("Xôi Đậu");
        dsMenu.add("Xôi Xéo");
        dsMenu.add("Bánh Xèo");
        dsMenu.add("Mì Tôm");
        dsMenu.add("Cá Kho");
        dsMenu.add("Canh Chua");
        dsMenu.add("Mực Chiên Tỏi");



        // B2. Tạo Adapter
        ArrayAdapter<String> adapterMenu;
        adapterMenu = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsMenu);


        //B3. Gắn vào điều khiển hiển thị listview
        // 3.1 Tìm
        ListView lvDSMonAn = findViewById(R.id.lvMenu);
        // 3.2 Gắn
        lvDSMonAn.setAdapter(adapterMenu);
        // 3.3 Lắng nghe và xử lí sự kiện
        // ...

    }
}