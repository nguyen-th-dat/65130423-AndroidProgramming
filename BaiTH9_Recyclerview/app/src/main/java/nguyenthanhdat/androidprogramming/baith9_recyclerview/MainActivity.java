package nguyenthanhdat.androidprogramming.baith9_recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewData;
    RecyclerView recyclerViewLandScape;

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

        recyclerViewData = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList dsDulieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("nhatrang","Nha Trang");
        dsDulieu.add(landScape1);
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        dsDulieu.add(new LandScape("nhatrang","Nha Trang"));
        return dsDulieu;
    }
}