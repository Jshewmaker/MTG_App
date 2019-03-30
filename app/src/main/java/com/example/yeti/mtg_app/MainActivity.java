package com.example.yeti.mtg_app;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.framelayout_c);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.player1, new Player_1_Fragment()).commit();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.player2, new Player_2_Fragment()).commit();
    }


  /*  private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new Player_1_Fragment(), "Player 1");

        viewPager.setAdapter(adapter);
    }
    */
}
