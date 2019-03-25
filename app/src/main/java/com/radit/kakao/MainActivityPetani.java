package com.radit.kakao;

import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivityPetani extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            switch (item.getItemId()) {
                case R.id.homebutton:
                    HomeFragmentPetani homeFragmentPetani = new HomeFragmentPetani();
                    fragmentTransaction.replace(R.id.main_frame, homeFragmentPetani, "Home Fragment Petani");
                    fragmentTransaction.commit();
                    setTitle("Home");
                    return true;
                case R.id.ordermasukbutton:
                    OrderListFragment orderListFragment = new OrderListFragment();
                    fragmentTransaction.replace(R.id.main_frame, orderListFragment, "Order List Fragment");
                    fragmentTransaction.commit();
                    setTitle("List Pesanan");
                    return true;
                case R.id.produkbutton:
                    ProductPetaniFragment productPetaniFragment = new ProductPetaniFragment();
                    fragmentTransaction.replace(R.id.main_frame, productPetaniFragment, "Product Petani Fragment");
                    fragmentTransaction.commit();
                    setTitle("Produk");
                    return true;
                case R.id.inboxbutton:
                    InboxPetaniFragment inboxPetaniFragment = new InboxPetaniFragment();
                    fragmentTransaction.replace(R.id.main_frame, inboxPetaniFragment, "Inbox Petani Fragment");
                    fragmentTransaction.commit();
                    setTitle("Pesan");
                    return true;
                case R.id.profilebutton:
                    ProfilePetaniFragment profilePetaniFragment = new ProfilePetaniFragment();
                    fragmentTransaction.replace(R.id.main_frame, profilePetaniFragment, "Profile Petani Fragment");
                    fragmentTransaction.commit();
                    setTitle("Profil");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_petani);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        HomeFragmentPetani homeFragmentPetani = new HomeFragmentPetani();
        fragmentTransaction.replace(R.id.main_frame, homeFragmentPetani, "Home Fragment Petani");
        fragmentTransaction.commit();
        setTitle("Home");

    }

}
