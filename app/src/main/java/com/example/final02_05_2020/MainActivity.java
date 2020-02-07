package com.example.final02_05_2020;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.final02_05_2020.Adapters.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.container);
        navView = findViewById(R.id.nav_buttom);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_shop:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.nav_map:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.nav_notification:
                        viewPager.setCurrentItem(2);
                        return true;
                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if(i == 0)
                    navView.setSelectedItemId(R.id.nav_shop);
                else if(i == 1)
                    navView.setSelectedItemId(R.id.nav_map);
                else
                    navView.setSelectedItemId(R.id.nav_notification);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
}
