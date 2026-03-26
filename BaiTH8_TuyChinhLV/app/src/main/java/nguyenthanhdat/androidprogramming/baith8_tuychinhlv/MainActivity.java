package nguyenthanhdat.androidprogramming.baith8_tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        //Tim listview
        ListView lvdsMonAn = (ListView) findViewById(R.id.lvMonAn);

        // thêm dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm Tấm", 27000, "Cơm tấm nguyên liệu chính là cơm", R.drawable.comtam));
        dsMonAn.add(new MonAn("Cơm Chiên", 40000, "Cơm Chiên nguyên liệu chính là cơm", R.drawable.comchienduongchau));
        dsMonAn.add(new MonAn("Mì xào Hải sản", 40000, "Mì xào Hải sản có Hải sản", R.drawable.mixaohaisan));
        dsMonAn.add(new MonAn("Bánh Mì thập cẩm", 20000, "Bánh Mì ngon số 2 Nha Trang", R.drawable.banhmi));
        dsMonAn.add(new MonAn("Phở", 30000, "Phở ngon số 2 Nha Trang", R.drawable.pho));
        dsMonAn.add(new MonAn("Bún cá", 20000, "Bún cá đặc sản Nha Trang", R.drawable.bunca));
        dsMonAn.add(new MonAn("Bún riêu", 20000, "Đây là Bún riêu", R.drawable.bunca));


        // adapter
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvdsMonAn.setAdapter(adapter);

        // Xử lí sự kiện
        lvdsMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // lấy phần tử
                MonAn monAnChon = dsMonAn.get(position);
                // hiện ra màn hình
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(), Toast.LENGTH_SHORT ).show();
            }
        });
    }


}