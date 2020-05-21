package com.roopre.viewpagersample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Tab4Fragment extends Fragment implements View.OnClickListener {
    String TAG = getClass().getSimpleName();
    View rootView;

    public Tab4Fragment() {

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
        rootView = inflater.inflate(R.layout.fragment_sample, container, false);

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
            default:
                break;
        }

    }
}
