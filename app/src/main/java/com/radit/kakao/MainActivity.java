package com.radit.kakao;

import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            switch (item.getItemId()) {
                case R.id.homebutton:
                    HomeFragment homeFragment = new HomeFragment();
                    fragmentTransaction.replace(R.id.main_frame, homeFragment, "Home Fragment");
                    fragmentTransaction.commit();
                    setTitle("Home");
                    return true;
                case R.id.transaksibutton:
                    TransaksiFragment transaksiFragment = new TransaksiFragment();
                    fragmentTransaction.replace(R.id.main_frame, transaksiFragment, "Transaksi Fragment");
                    fragmentTransaction.commit();
                    setTitle("Transaksi");
                    return true;
                case R.id.inboxbutton:
                    InboxFragment inboxFragment = new InboxFragment();
                    fragmentTransaction.replace(R.id.main_frame, inboxFragment, "Inbox Fragment");
                    fragmentTransaction.commit();
                    setTitle("Inbox");
                    return true;
                case R.id.profilebutton:
                    ProfileFragment profileFragment = new ProfileFragment();
                    fragmentTransaction.replace(R.id.main_frame, profileFragment, "Profile Fragment");
                    fragmentTransaction.commit();
                    setTitle("Profile");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window w = getWindow();
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        fragmentTransaction.replace(R.id.main_frame, homeFragment, "Home Fragment");
        fragmentTransaction.commit();
        setTitle("Home");

    }

}
