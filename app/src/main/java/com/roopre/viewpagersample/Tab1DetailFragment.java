package com.roopre.viewpagersample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab1DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab1DetailFragment extends Fragment {


    public Tab1DetailFragment() {

    }

    public static Tab1DetailFragment newInstance(String param1, String param2) {
        Tab1DetailFragment fragment = new Tab1DetailFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // 부모뷰 생성
        View rootView = inflater.inflate(R.layout.fragment_tab1_detail, container, false);

        // 데이터를 보여줄 TextView
        TextView msg_tv = rootView.findViewById(R.id.msg_tv);

        String msg = getArguments().getString("msg");
        msg_tv.setText(msg);


        return rootView;
    }
}
