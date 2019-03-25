package com.radit.kakao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class JualKokoa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual_kokoa);

        EditText namaprodukEDT = (EditText) findViewById(R.id.namaproduk);
        String namaproduk = namaprodukEDT.getText().toString();

        Button button = (Button) findViewById(R.id.buttonjualkokoa);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
