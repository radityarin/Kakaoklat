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

public class EdukasiPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi_page);

        Button back = (Button) findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EdukasiPage.this,MainActivityPetani.class);
                startActivity(intent);
            }
        });

        final ArrayList<Edukasi> listedukasi = new ArrayList<>();

        listedukasi.add(new Edukasi("Cara Tepat Pembudidayaan Tanaman Kakao","https://i.ytimg.com/vi/txOaY6LOSXU/maxresdefault.jpg","1.\tCara Tepat Pembudidayaan Tanaman Kakao\n" +
                "A.\tPersiapan Lahan\n" +
                "Persiapan lahan atau arela dimulai dari tahap survei/pengukuran sampai tahap pengendalian ilalang. Pada tahap ini, pelaksanaan pekerjaan meliputi pemetaan topografi, penyebaran jenis tanah, serta penetapan batas areal yang akan ditanami. Hasi survai akan sangat penting artinya untuk tahapan pekerjaan lain , bahkan dalam hal penanaman dan pemeliharaan kakao. Tahap selanjutnya dari  persiapan lahan adalah tebas/babat.\n" +
                "\n" +
                "B.\tPenanaman Pohon Pelindung\n" +
                "Untuk menetapkan pohon pelindung yang hendak ditanam maka hal-hal yang berkaitan dengan morfologi daun, letak kedududkan daun, ukuran tipe daun, tipe percabangan maupun ketahan akan hama penyakit, serta sifatnya didalam penyerapan air dan hara patut diperhatikan.\n" +
                "\n" +
                "C.\tPenentuan Jarak Tanaman Kakao\n" +
                "Setelah pohon pelindung berumur 12 atau 18 bulan, pekerjaan selanjutnya adalah pembuatan lubang tanam. Tahap ini diawali dengan pengaturan jarak tanam yang ditandai dengan pancang-pancang kayu pada titik yang akan dibuat lubang tanam.\n" +
                "\n" +
                "D.\tPenentuan Pola Tanam\n" +
                "Pola tanam adalah teknik mengatur jarak tanaman dan pengaturan tanaman / pohon pelindung. Penentuan pola tanam dianjurkan untuk mendapatkan areal penanaman kakao yang sebaik-baiknya.\n" +
                "\n" +
                "E.\tPenanaman Tanaman Penutup Tanah\n" +
                "Tanaman penutup tanah pada areal perkebunan kakao pada umumnya adalah tanaman jenis kacang-kacangan. Tanaman penutup tanah berfungsi untuk menambah kesuburan tanah, mempertahankan lapisan atas tanah serta mencegah pertumbuhan gulma pengganggu.\n" +
                "\n" +
                "F.\tPembuatan Lubang Tanam Kakao\n" +
                "Lubang tanam dibuat tepat pada titik jarak tanam yang telah dibuat sebelumnya dengan ukuran 40 x 40 x 40 cm, 50 x 50 x 50 cm atau 60 x 60 x 60 cm. Ukuran lubang tanam disesuaikan dengan ukuran polybag bibit.\n" +
                "\n" +
                "G.\tPemberian Pupuk Dasar Pada Tanaman Kakao\n" +
                "Beberapa hari setelah penaburan kapur dolomit, lubang tanam diberikan pupuk dasar berupa pupuk kandang atau kompos sebanyak 2 – 3 kg per lubang.\n" +
                "\nSumber : https://mitalom.com/panduan-umum-cara-budidaya-kakao/"));
        listedukasi.add(new Edukasi("Penentuan Pola Penanaman Kakao yang Tepat","http://2.bp.blogspot.com/-1WalA483IMQ/U4ynomOdDOI/AAAAAAAAAWI/daxROTFKmN8/s1600/s3.jpg","2.\tPenentuan Pola Penanaman Kakao yang Tepat\n" +
                "Pola tanam adalah teknik mengatur jarak tanaman dan pengaturan tanaman / pohon pelindung. Penentuan pola tanam dianjurkan untuk mendapatkan areal penanaman kakao yang sebaik-baiknya. Tujuan dari penentuan pola tanam antara lain untuk ;\n" +
                "\n" +
                "1).    mengoptimalkan jumlah tanaman per hektar\n" +
                "2).    mengoptimalkan fungsi pohon pelindung\n" +
                "3).    meminimalkan kerugian yang timbul pada nilai kesuburan tanah\n" +
                "\n" +
                "Pola tanam yang sering diaplikasikan pada perkebunan kakao antara lain ;\n" +
                "\n" +
                "1).    Pola tanam kakao segi empat, pohon pelindung segi empat\n" +
                "2).    Pola tanam kakao segi empat, pohon pelindung segi tiga\n" +
                "3).    Pola tanam kakao berpagar ganda, pohon pelindung segi empat\n" +
                "4).    Pola tanam kakao berpagar ganda, pohon pelindung segi tiga\n"));
        listedukasi.add(new Edukasi("Mengetahui Karakteristik Kualitas Kakao yang Baik","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif","blablablasdlasdkjajsdljasdlkjasdlkjaslkdjalksdjlkasjdlkajsdlk jasldj laksdjlaksdj laksdjl aksdj laksdjlka sdjlj lakjasldkj alsdj laksdjlk "));
        listedukasi.add(new Edukasi("Strategi Pemupukan Tanaman Kakao","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif","blablablasdlasdkjajsdljasdlkjasdlkjaslkdjalksdjlkasjdlkajsdlk jasldj laksdjlaksdj laksdjl aksdj laksdjlka sdjlj lakjasldkj alsdj laksdjlk "));
        listedukasi.add(new Edukasi("Perawatan dan Pemeliharaan Tanaman Kakao","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif","blablablasdlasdkjajsdljasdlkjasdlkjaslkdjalksdjlkasjdlkajsdlk jasldj laksdjlaksdj laksdjl aksdj laksdjlka sdjlj lakjasldkj alsdj laksdjlk "));
        listedukasi.add(new Edukasi("Strategi Pengendalian Hama dan Penyakit Tanaman Kakao","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif","blablablasdlasdkjajsdljasdlkjasdlkjaslkdjalksdjlkasjdlkajsdlk jasldj laksdjlaksdj laksdjl aksdj laksdjlka sdjlj lakjasldkj alsdj laksdjlk "));
        listedukasi.add(new Edukasi("Teknik Pengolahan Tanaman Kakao","http://www.medanbisnisdaily.com/imagesfile/201410/20141022074835_168.gif","blablablasdlasdkjajsdljasdlkjasdlkjaslkdjalksdjlkasjdlkajsdlk jasldj laksdjlaksdj laksdjl aksdj laksdjlka sdjlj lakjasldkj alsdj laksdjlk "));

        String judul = getIntent().getStringExtra("judul");
        ImageView imgedukasi = (ImageView) findViewById(R.id.urlgambaredukasi);
        TextView juduledukasi = (TextView) findViewById(R.id.juduledukasi);
        TextView kontenedukasi = (TextView) findViewById(R.id.isiedukasi);
        Edukasi edukasi = new Edukasi();
        for (Edukasi edu : listedukasi){
            if(edu.getJudul().equalsIgnoreCase(judul)){
                edukasi=edu;
            }
        }

        Picasso.get().load(edukasi.getUrledukasi()).into(imgedukasi);
        juduledukasi.setText(edukasi.getJudul());
        kontenedukasi.setText(edukasi.getIsiedukasi());




    }
}
