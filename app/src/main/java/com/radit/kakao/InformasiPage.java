package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class InformasiPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_page);

        Button back = (Button) findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InformasiPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        final ArrayList<Informasi> listinformasi = new ArrayList<>();

        listinformasi.add(new Informasi("Coklat memperpanjang umur", "Artikel Pengetahuan Coklat Memperpanjang Umur :\n" +
                "\n" +
                "COKLAT siapa yang tidak suka. Sayangnya kerap kali diperdebatkan. Coklat disebut-sebut membuat tubuh kamu lebih gemuk. Namun di sisi lain ada yang mengatakan makanan nikmat yang bisa bikin panjang umur.\n" +
                "\n" +
                "Menurut sebuah penelitian baru, memakan cokelat dan minum kopi serta teh dapat membuat seseorang hidup lebih lama. Ini berhubungan dengan manfaat dari coklat yang mengandung zinc, merupakan senyawa yang bisa memperlambat penuaan.\n" +
                "\n" +
                "Seperti yang dilansir dari laman independent, para peneliti dari Universitas Erlangen di Nuremberg dan Universitas AuBurn di Alabama, mengungkap bahwa coklat melindungi terhadap stres oksidatif yang terjadi secara alami. Seperti yang diketahui sebelumnya jika stres oksidatif dapat menyebabkan penuaan, kanker, peradangan dan penyakit degeneratif.\n" +
                "\n" +
                "Sementara itu zinc memberikan manfaat sangat baik untuk membantu tubuh melawan bakteri dan virus. Selain itu adapula polifenol antioksidan yang juga ditemukan pada teh dan kopi memberikan dampak yang berbeda. \n" +
                "\n" +
                "Zinc efektif bukan karena minim kandungan racun ketimbang logam lain. Namun mengarahkan penelitian mengeluarkan hipotesesa, jika zinc mungkin dapat ditambahkan ke makanan masa depan untuk tingkatkan kesehatan konsumen.\n" +
                "\nSumber : https://merahputih.com/post/read/mengonsumsi-cokelat-bisa-bikin-panjang-umur", "https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));
        listinformasi.add(new Informasi("Coklat berarti minuman pahit", "Kata coklat berasal dari xocoatl (bahasa suku Aztec) yang berarti minuman pahit.", "https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));
        listinformasi.add(new Informasi("Rindu akan Coklat", "rasa coklat yang enak mungkin menyebabkan kerinduan untuk mengkonsumsinya kembali.", "https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));
        listinformasi.add(new Informasi("Coklat bikin kurus", "Berdasarkan ceritanya coklat itu bikin kurus loh", "https://cdn-asset.hipwee.com/wp-content/uploads/2017/11/hipwee-kakao5.jpg"));

        String judul = getIntent().getStringExtra("judul");
        ImageView imginformasi = (ImageView) findViewById(R.id.urlgambarinformasi);
        TextView judulinformasi = (TextView) findViewById(R.id.judulinformasi);
        TextView konteninformasi = (TextView) findViewById(R.id.isiinformasi);
        Informasi informasi = new Informasi();
        for (Informasi info : listinformasi){
            if(info.getJudul().equalsIgnoreCase(judul)){
                informasi = info;
            }
        }
        Picasso.get().load(informasi.getUrlgambarinformasi()).into(imginformasi);
        judulinformasi.setText(informasi.getJudul());
        konteninformasi.setText(informasi.getBerita());

    }
}
