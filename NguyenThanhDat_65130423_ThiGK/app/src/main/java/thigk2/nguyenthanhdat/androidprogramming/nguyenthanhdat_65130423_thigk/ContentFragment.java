package thigk2.nguyenthanhdat.androidprogramming.nguyenthanhdat_65130423_thigk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContentFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        // find view
        Button b1 = v.findViewById(R.id.button1);
        Button b2 = v.findViewById(R.id.button2);
        Button b3 = v.findViewById(R.id.button3);
        Button b4 = v.findViewById(R.id.button4);

        //
        FragmentManager fragmentManager = getParentFragmentManager();
        // even
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new VndToDolaFragment())
                        .commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new DsCaKhucCMVNFragment())
                        .commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new DsDanhNhanLsVnFragment())
                        .commit();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new DsDanhNhanLsVnFragment())
                        .commit();
            }
        });


        return v;
    }
}