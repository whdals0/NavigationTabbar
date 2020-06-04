package com.roopre.viewpagersample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import devlight.io.library.ntb.NavigationTabBar;

public class MainFragment extends Fragment implements View.OnClickListener, ViewPager.OnPageChangeListener {
    String TAG = getClass().getSimpleName();
    View rootView;

    ArrayList<Fragment> fragments = new ArrayList<>();
    MainAdapter mainAdapter;
    ViewPager viewPager;

    public MainFragment() {

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
        rootView = inflater.inflate(R.layout.content_main, container, false);

        viewPager = rootView.findViewById(R.id.viewPager);
        viewPager.addOnPageChangeListener(this);

        SetInit();
        return rootView;
    }

    private void SetInit() {

        Tab1Fragment tab1Fragment = new Tab1Fragment();
        Tab2Fragment tab2Fragment = new Tab2Fragment();
        Tab3Fragment tab3Fragment = new Tab3Fragment();
        Tab4Fragment tab4Fragment = new Tab4Fragment();
        fragments.clear();
        fragments.add(tab1Fragment);
        fragments.add(tab2Fragment);
        fragments.add(tab3Fragment);
        fragments.add(tab4Fragment);

        final NavigationTabBar navigationTabBar = (NavigationTabBar) rootView.findViewById(R.id.ntb);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_menu_camera),
                        Color.RED)
                        .title("Tab1")
                        .badgeTitle("NTB")
                        .build());
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_menu_gallery),
                        Color.RED)
                        .title("Tab2")
                        .badgeTitle("with")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_menu_camera),
                        Color.RED)
                        .title("Tab3")
                        .badgeTitle("state")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_menu_slideshow),
                        Color.RED)
                        .title("Tab4")
                        .badgeTitle("icon")
                        .build()
        );


        mainAdapter = new MainAdapter(getChildFragmentManager(), fragments);
        mainAdapter.notifyDataSetChanged();
        viewPager.setAdapter(mainAdapter);
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager);


        navigationTabBar.setModels(models);

        navigationTabBar.setTitleMode(NavigationTabBar.TitleMode.ACTIVE);
        navigationTabBar.setBadgeGravity(NavigationTabBar.BadgeGravity.BOTTOM);
        navigationTabBar.setBadgePosition(NavigationTabBar.BadgePosition.CENTER);
        navigationTabBar.setTypeface("fonts/custom_font.ttf");
        navigationTabBar.setIsBadged(true);
        navigationTabBar.setIsTitled(true);
        navigationTabBar.setIsTinted(true);
        navigationTabBar.setIsBadgeUseTypeface(true);
        navigationTabBar.setIsSwiped(true);

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

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
