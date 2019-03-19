package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ListProductPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product_page);

        final ArrayList<Produk> listproduk = new ArrayList<>();

        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));
        listproduk.add(new Produk("Cokelat Bubuk Mentah 100% Murni Asli Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ProdukAdapter(listproduk, getApplicationContext()));
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
