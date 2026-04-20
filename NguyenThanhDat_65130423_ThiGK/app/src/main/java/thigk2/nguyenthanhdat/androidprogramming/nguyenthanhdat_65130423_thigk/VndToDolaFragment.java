package thigk2.nguyenthanhdat.androidprogramming.nguyenthanhdat_65130423_thigk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VndToDolaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VndToDolaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VndToDolaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VndToDolaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VndToDolaFragment newInstance(String param1, String param2) {
        VndToDolaFragment fragment = new VndToDolaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    EditText textVnd, textUSD;
    Button btnDoi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate layout
        View view = inflater.inflate(R.layout.fragment_vnd_to_dola, container, false);

        // Tham chieu cac EditText trong fragment_footer.xml
        textVnd = view.findViewById(R.id.editTextVnd);
        textUSD = view.findViewById(R.id.editTextUSD);

        // Tham chieu nut (phai co nut trong XML)
        btnDoi = view.findViewById(R.id.btnDoi);

        // Gan su kien click
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyDoi();
            }
        });

        return view;
    }

    // Ham xu ly doi tien
    public void XuLyDoi() {
        String strVND = textVnd.getText().toString().trim();

        if (strVND.isEmpty()) {
            textUSD.setText("");
            return;
        }

        // Chuyen chuoi sang so
        double vnd = Double.parseDouble(strVND);

        // Ti gia ngay 20/04/2026 luc 8h
        double usd = vnd / 26097;

        // Hien ket qua
        textUSD.setText(String.valueOf(usd));
    }
}