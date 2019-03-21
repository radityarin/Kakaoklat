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

        final ArrayList<Produk> listprodukpopuler = new ArrayList<>();
        listprodukpopuler.add(new Produk("001","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("002","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("003","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("004","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("005","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("006","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("007","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("008","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("009","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("010","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("011","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("012","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));

        RecyclerView recyclerViewpopuler = (RecyclerView) view.findViewById(R.id.produkterpopulerrecycler);
        recyclerViewpopuler.setAdapter(new ProdukAdapterV(listprodukpopuler,getContext()));
        recyclerViewpopuler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));

        listinformasi.add(new Informasi("Coklat memperpanjang umur","Suatu studi epidemiologis telah dilakukan pada mahasiswa Universitas Harvard yang terdaftar antara tahun 1916-1950. Dengan menggunakan food frequency questionnaire berhasil dikumpulkan informasi tentang kebiasaan makan permen atau coklat pada mahasiswa Universitas Harvard."));
        listinformasi.add(new Informasi("Coklat berarti minuman pahit","Kata coklat berasal dari xocoatl (bahasa suku Aztec) yang berarti minuman pahit."));
        listinformasi.add(new Informasi("Rindu akan Coklat","rasa coklat yang enak mungkin menyebabkan kerinduan untuk mengkonsumsinya kembali."));
        listinformasi.add(new Informasi("Coklat bikin kurus","Berdasarkan ceritanya coklat itu bikin kurus loh"));

        RecyclerView recyclerViewpengetahuan = (RecyclerView) view.findViewById(R.id.recyclerpengetahuan);
        recyclerViewpengetahuan.setAdapter(new InformasiAdapter(listinformasi, getContext()));
        recyclerViewpengetahuan.setNestedScrollingEnabled(false);
        recyclerViewpengetahuan.setLayoutManager(new LinearLayoutManager(getActivity()));

        ImageButton batang = (ImageButton) view.findViewById(R.id.buttonkategoribatang);
        ImageButton biji = (ImageButton) view.findViewById(R.id.buttonkategoribiji);
        ImageButton bubuk = (ImageButton) view.findViewById(R.id.buttonkategoribubuk);
        ImageButton cair = (ImageButton) view.findViewById(R.id.buttonkategorisusucair);

        batang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListProductPage.class);
                intent.putExtra("kategori","Batang");
                startActivity(intent);
            }
        });
        biji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListProductPage.class);
                intent.putExtra("kategori","Biji");
                startActivity(intent);
            }
        });
        bubuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListProductPage.class);
                intent.putExtra("kategori","Bubuk");
                startActivity(intent);
            }
        });
        cair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListProductPage.class);
                intent.putExtra("kategori","Cair");
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
