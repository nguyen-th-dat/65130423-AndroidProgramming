package nguyenthanhdat.androidprogramming.baith8_tuychinhlv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    // dữ liệu
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    // hàm khởi tạo
    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.context = _context;
        this.dsMonAn = dsMonAn;
        this.layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // item view hien hanh
        View viewHienHanh = convertView;

        //Kiem tra view hien chua
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan,null);
        // lay du lieu
        MonAn monAnHienTai = dsMonAn.get(position);
        //gan len dieu khien

        // tim dieu khien
        TextView TextView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tenMonAn);
        TextView TextView_DonGia= (TextView) viewHienHanh.findViewById(R.id.donGia);
        TextView TextView_MoTa = (TextView) viewHienHanh.findViewById(R.id.moTa);
        ImageView ImgView_Avatar = (ImageView) viewHienHanh.findViewById(R.id.imgMoTA);

        // set len

        TextView_TenMon.setText(monAnHienTai.getTenMonAn());
        TextView_DonGia.setText(String.valueOf(monAnHienTai.getTenMonAn()));
        TextView_MoTa.setText(monAnHienTai.getMoTa());
        ImgView_Avatar.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;

    }
}
