package com.radit.kakao;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class JualKokoa extends AppCompatActivity {
    private int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual_kokoa);

        String idproduk = getIntent().getStringExtra("idproduk");
        Boolean ubah = getIntent().getBooleanExtra("ubah", false);

        if (!ubah) {
            Button uploadfotoproduk = (Button) findViewById(R.id.uploadfotoproduk);
            uploadfotoproduk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setType("image/jpg");
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    startActivityForResult(Intent.createChooser(intent, "Select File"), REQUEST_CODE);
                }
            });
            EditText namaprodukEDT = (EditText) findViewById(R.id.namaproduk);
            String namaproduk = namaprodukEDT.getText().toString();

            Button button = (Button) findViewById(R.id.buttonjualkokoa);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    SweetAlertDialog pDialog = new SweetAlertDialog(JualKokoa.this, SweetAlertDialog.SUCCESS_TYPE);
                    pDialog.setTitleText("Selamat!");
                    pDialog.setCancelable(false);
                    pDialog.setContentText("Produk anda sudah terupload");
                    pDialog.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismissWithAnimation();
                            Intent intent = new Intent(JualKokoa.this, MainActivityPetani.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    pDialog.show();
                }
            });
        } else {

        }
    }
}
