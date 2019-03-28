package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckoutPage extends AppCompatActivity {

    int jumlahproduk = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_page);

        Button plus = (Button) findViewById(R.id.tambahjumlah);
        Button minus = (Button) findViewById(R.id.kurangjumlah);
        final EditText jumlah = (EditText) findViewById(R.id.jumlahproduk);
        jumlah.setText(String.valueOf(jumlahproduk),TextView.BufferType.EDITABLE);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlahproduk++;
                jumlah.setText(String.valueOf(jumlahproduk),TextView.BufferType.EDITABLE);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jumlahproduk != 0) {
                    jumlahproduk--;
                    jumlah.setText(String.valueOf(jumlahproduk), TextView.BufferType.EDITABLE);
                }
            }
        });

        Button bayar = (Button) findViewById(R.id.bayar);
        bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckoutPage.this,DetailPesananPage.class);
                startActivity(intent);
            }
        });
    }
}
