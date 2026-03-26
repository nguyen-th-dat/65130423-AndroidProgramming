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
        dsMonAn.add(new MonAn("Cơm Tấm", 27000, "Com ngon", R.drawable.comtam));
        dsMonAn.add(new MonAn("Bánh Mì", 20000, "Mo ta Mo ta Mota", R.drawable.banhmi));
        dsMonAn.add(new MonAn("Phở", 30000, "Mo ta Mo ta Mota", R.drawable.pho));
        dsMonAn.add(new MonAn("Bún cá", 20000, "Mo ta Mo ta Mota", R.drawable.bunca));

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