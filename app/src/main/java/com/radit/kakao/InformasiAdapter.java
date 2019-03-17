package com.radit.kakao;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;

public class InformasiAdapter extends RecyclerView.Adapter<InformasiAdapter.ViewHolder> {

    private ArrayList<Informasi> listinformasi;
    private Context context;

    public InformasiAdapter(ArrayList<Informasi> listinformasi, Context context) {
        this.listinformasi = listinformasi;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_informasi, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tv_judul.setText(listinformasi.get(position).getJudul());
        holder.tv_berita.setText(listinformasi.get(position).getBerita());
    }

    @Override
    public int getItemCount() {
        return listinformasi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_judul,tv_berita;
        private CardView ll_cardrs;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_judul = (TextView) itemView.findViewById(R.id.judul);
            tv_berita = (TextView) itemView.findViewById(R.id.berita);
            ll_cardrs = (CardView) itemView.findViewById(R.id.linearlayoutcardrs);
        }
    }
}