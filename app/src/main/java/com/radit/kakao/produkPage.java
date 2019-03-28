package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class produkPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_page);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(produkPage.this,MainActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Produk> listsemuaproduk = new ArrayList<>();
        listsemuaproduk.add(new Produk("001","Bubuk Cokelat Asli Kabupaten Malang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("002","Chocodot Berbagai Rasa","https://ecs7.tokopedia.net/img/cache/700/product-1/2018/11/9/203058895/203058895_b938108a-242a-4ca6-a477-e35956e6f720_1993_1993.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("003","Monggo Coklatnya","https://cdn.idntimes.com/content-images/post/20180406/3-a25bf2d2a108526cc6cfb1e968832311.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("004","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("005","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("006","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("007","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("008","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("009","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("010","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("011","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listsemuaproduk.add(new Produk("012","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));

        String idproduk = getIntent().getStringExtra("idproduk");
        ImageView gambarproduk = (ImageView) findViewById(R.id.gambarproduk);
        Produk produknya = new Produk();
        for (Produk produk : listsemuaproduk){
            if(produk.getIdproduk().equalsIgnoreCase(idproduk)){
                produknya = produk;
            }
        }
        Picasso.get().load(produknya.getUrlProduk()).into(gambarproduk);

        TextView namaproduk = (TextView) findViewById(R.id.namaproduk);
        TextView hargaproduk = (TextView) findViewById(R.id.hargaproduk);
        TextView informasiproduk = (TextView) findViewById(R.id.informasiproduk);

        namaproduk.setText(produknya.getNamaProduk());
        hargaproduk.setText("Rp "+produknya.getHargaProduk());
        informasiproduk.setText(produknya.getInformasiproduk());

        final ArrayList<Produk> listproduklainnya = new ArrayList<>();
        listproduklainnya.add(new Produk("001","Cokelat Kotak-kotak ","http://www.farmakoterapi.com/wp-content/uploads/2016/04/coklat.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("002","Topping Chocolate","https://ecs7.tokopedia.net/img/cache/700/product-1/2016/6/21/10236530/10236530_f3fe5c7c-6985-4997-a1e0-ec940b5c56af.jpeg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("003","Kue Cokelat Kering","https://selerasa.com/wp-content/uploads/2016/01/images_Kue_Kering_75.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("004","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("005","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("006","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("007","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("008","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("009","Cokelat Bubuk ","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Bubuk",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("010","Cokelat Batang","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Batang",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("011","Cokelat Susu","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Cair",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));
        listproduklainnya.add(new Produk("012","Cokelat Biji","https://missjunecompany.com/wp-content/uploads/2016/05/Bubuk-Coklat-Murni-Miss-June-350x194.jpg","Biji",89000,"I want to know where i can go when youre not alone when i'm feeling down, cause girl why dont you worry bout me, it aint new to me, feeling this lonely"));

        RecyclerView recyclerViewpopuler = (RecyclerView) findViewById(R.id.produklainnyarecycler);
        recyclerViewpopuler.setAdapter(new ProdukAdapterV(listproduklainnya,getApplicationContext()));
        recyclerViewpopuler.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false));

        Button beli = (Button) findViewById(R.id.beli);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(produkPage.this,CheckoutPage.class);
                startActivity(intent);
            }
        });

    }
}
