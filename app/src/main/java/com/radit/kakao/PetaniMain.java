package com.radit.kakao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PetaniMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petani_main);

        final ArrayList<Edukasi> listedukasi = new ArrayList<>();

        listedukasi.add(new Edukasi("Cara mencangkul kokoa yang benar","https://i.ytimg.com/vi/txOaY6LOSXU/maxresdefault.jpg"));
        listedukasi.add(new Edukasi("Cara menanam kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));
        listedukasi.add(new Edukasi("Cara mengolah kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));
        listedukasi.add(new Edukasi("Cara mengolah kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));
        listedukasi.add(new Edukasi("Cara mengolah kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));
        listedukasi.add(new Edukasi("Cara mengolah kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));
        listedukasi.add(new Edukasi("Cara mengolah kokoa yang benar","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new EdukasiAdapter(listedukasi, getApplicationContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}
