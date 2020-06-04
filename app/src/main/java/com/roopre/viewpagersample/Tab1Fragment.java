package com.roopre.viewpagersample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class Tab1Fragment extends Fragment implements View.OnClickListener {
    String TAG = getClass().getSimpleName();
    View rootView;

    EditText msg_et;
    Button send_btn;

    public Tab1Fragment() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tab1, container, false);

        msg_et = rootView.findViewById(R.id.msg_et);
        send_btn = rootView.findViewById(R.id.send_btn);

        send_btn.setOnClickListener(this);

        SetInit();


        return rootView;
    }

    private void SetInit() {

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.send_btn:

                // 원하는 데이터를 담을 객체
                Bundle argu = new Bundle();
                argu.putString("msg", msg_et.getText().toString());

                // 이동할 Fragment 선언
                Tab1DetailFragment tab1DetailFragment = new Tab1DetailFragment();

                // 이동할 Fragment 에 데이터 객체 담기
                tab1DetailFragment.setArguments(argu);

                getActivity().getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right)
                        .replace(R.id.mainFragment, tab1DetailFragment, "DETAIL")
                        .addToBackStack(null)
                        .commit();
                break;
            default:
                break;
        }

    }
}
