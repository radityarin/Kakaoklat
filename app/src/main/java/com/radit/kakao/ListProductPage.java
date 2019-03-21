package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ListProductPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product_page);

        String kategoriproduk = getIntent().getStringExtra("kategori");
        TextView titlekategori = (TextView) findViewById(R.id.kategoriproduk);
        titlekategori.setText(kategoriproduk);

        final ArrayList<Produk> listsemuaproduk = new ArrayList<>();
        listsemuaproduk.add(new Produk("001","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("002","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("003","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("004","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("005","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("006","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("007","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("008","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("009","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("010","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("011","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("012","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));

        final ArrayList<Produk> listproduktampil = new ArrayList<>();
        for(Produk produk : listsemuaproduk){
            if(produk.getKategori().equalsIgnoreCase(kategoriproduk)){
                listproduktampil.add(produk);
            }
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ProdukAdapter(listproduktampil, getApplicationContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Button backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListProductPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
