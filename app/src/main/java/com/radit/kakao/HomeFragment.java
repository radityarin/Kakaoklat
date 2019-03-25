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
        listprodukpopuler.add(new Produk("001","Bubuk Cokelat Asli Kabupaten Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("002","Chocodot Berbagai Rasa","https://ecs7.tokopedia.net/img/cache/700/product-1/2018/11/9/203058895/203058895_b938108a-242a-4ca6-a477-e35956e6f720_1993_1993.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("003","Monggo Coklatnya","https://cdn.idntimes.com/content-images/post/20180406/3-a25bf2d2a108526cc6cfb1e968832311.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("004","Cokelat Kotak-kotak ","http://www.farmakoterapi.com/wp-content/uploads/2016/04/coklat.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("005","Topping Chocolate","https://ecs7.tokopedia.net/img/cache/700/product-1/2016/6/21/10236530/10236530_f3fe5c7c-6985-4997-a1e0-ec940b5c56af.jpeg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("006","Kue Cokelat Kering","https://selerasa.com/wp-content/uploads/2016/01/images_Kue_Kering_75.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("007","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("008","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("009","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("010","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("011","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listprodukpopuler.add(new Produk("012","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));

        RecyclerView recyclerViewpopuler = (RecyclerView) view.findViewById(R.id.produkterpopulerrecycler);
        recyclerViewpopuler.setAdapter(new ProdukAdapterV(listprodukpopuler,getContext()));
        recyclerViewpopuler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));

        listinformasi.add(new Informasi("Coklat memperpanjang umur","Artikel Pengetahuan Coklat Memperpanjang Umur :\n" +
                "\n" +
                "COKLAT siapa yang tidak suka. Sayangnya kerap kali diperdebatkan. Coklat disebut-sebut membuat tubuh kamu lebih gemuk. Namun di sisi lain ada yang mengatakan makanan nikmat yang bisa bikin panjang umur.\n" +
                "\n" +
                "Menurut sebuah penelitian baru, memakan cokelat dan minum kopi serta teh dapat membuat seseorang hidup lebih lama. Ini berhubungan dengan manfaat dari coklat yang mengandung zinc, merupakan senyawa yang bisa memperlambat penuaan.\n" +
                "\n" +
                "Seperti yang dilansir dari laman independent, para peneliti dari Universitas Erlangen di Nuremberg dan Universitas AuBurn di Alabama, mengungkap bahwa coklat melindungi terhadap stres oksidatif yang terjadi secara alami. Seperti yang diketahui sebelumnya jika stres oksidatif dapat menyebabkan penuaan, kanker, peradangan dan penyakit degeneratif.\n" +
                "\n" +
                "Sementara itu zinc memberikan manfaat sangat baik untuk membantu tubuh melawan bakteri dan virus. Selain itu adapula polifenol antioksidan yang juga ditemukan pada teh dan kopi memberikan dampak yang berbeda. \n" +
                "\n" +
                "Zinc efektif bukan karena minim kandungan racun ketimbang logam lain. Namun mengarahkan penelitian mengeluarkan hipotesesa, jika zinc mungkin dapat ditambahkan ke makanan masa depan untuk tingkatkan kesehatan konsumen.","https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));
        listinformasi.add(new Informasi("Rindu akan Coklat","rasa coklat yang enak mungkin menyebabkan kerinduan untuk mengkonsumsinya kembali.","https://shop.gallerys.id/wp-content/uploads/2018/01/jual-coklat-valentine-day.jpg"));
        listinformasi.add(new Informasi("Coklat berarti minuman pahit","Kata coklat berasal dari xocoatl (bahasa suku Aztec) yang berarti minuman pahit.","https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));
        listinformasi.add(new Informasi("Coklat bikin kurus","Berdasarkan ceritanya coklat itu bikin kurus loh","https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));

        RecyclerView recyclerViewpengetahuan = (RecyclerView) view.findViewById(R.id.recyclerpengetahuan);
        recyclerViewpengetahuan.setAdapter(new InformasiAdapter(listinformasi, getContext()));
        recyclerViewpengetahuan.setNestedScrollingEnabled(false);
        recyclerViewpengetahuan.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));

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
