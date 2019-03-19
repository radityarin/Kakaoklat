package com.radit.kakao;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final ArrayList<Informasi> listinformasi = new ArrayList<>();
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        listinformasi.add(new Informasi("Coklat memperpanjang umur","Suatu studi epidemiologis telah dilakukan pada mahasiswa Universitas Harvard yang terdaftar antara tahun 1916-1950. Dengan menggunakan food frequency questionnaire berhasil dikumpulkan informasi tentang kebiasaan makan permen atau coklat pada mahasiswa Universitas Harvard."));
        listinformasi.add(new Informasi("Coklat berarti minuman pahit","Kata coklat berasal dari xocoatl (bahasa suku Aztec) yang berarti minuman pahit."));
        listinformasi.add(new Informasi("Rindu akan Coklat","rasa coklat yang enak mungkin menyebabkan kerinduan untuk mengkonsumsinya kembali."));
        listinformasi.add(new Informasi("Coklat bikin kurus","Berdasarkan ceritanya coklat itu bikin kurus loh"));

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new InformasiAdapter(listinformasi, getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageButton bubuk = (ImageButton) view.findViewById(R.id.buttonkategoribubuk);
        bubuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListProductPage.class);
                startActivity(intent);
            }
        });
        Button petani = (Button) view.findViewById(R.id.tombolpetani);
        petani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),RegistrasiPetani.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
