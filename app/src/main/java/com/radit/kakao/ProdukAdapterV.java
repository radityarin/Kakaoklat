package com.radit.kakao;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProdukAdapterV extends RecyclerView.Adapter<ProdukAdapterV.ViewHolder> {

    private ArrayList<Produk> listproduk;
    private Context context;

    public ProdukAdapterV(ArrayList<Produk> listproduk, Context context) {
        this.listproduk = listproduk;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_produk_vertical, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tv_judulproduk.setText(listproduk.get(position).getNamaProduk());
        String hargaproduk = "Rp " + listproduk.get(position).getHargaProduk();
        holder.tv_hargaproduk.setText(hargaproduk);
        Picasso.get().load(listproduk.get(position).getUrlProduk()).into(holder.iv_urlproduk);
        holder.cv_cardproduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,produkPage.class);
                intent.putExtra("idproduk",listproduk.get(position).getIdproduk());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listproduk.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_urlproduk;
        private TextView tv_judulproduk,tv_hargaproduk;
        private CardView cv_cardproduk;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_urlproduk = (ImageView) itemView.findViewById(R.id.urlgambarproduk);
            tv_judulproduk = (TextView) itemView.findViewById(R.id.judulproduk);
            tv_hargaproduk = (TextView) itemView.findViewById(R.id.hargaproduk);
            cv_cardproduk = (CardView) itemView.findViewById(R.id.cardprodukvertical);
        }
    }
}