package com.radit.kakao;

import android.content.Context;
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

public class EdukasiAdapter extends RecyclerView.Adapter<EdukasiAdapter.ViewHolder> {

    private ArrayList<Edukasi> listedukasi;
    private Context context;

    public EdukasiAdapter(ArrayList<Edukasi> listedukasi, Context context) {
        this.listedukasi = listedukasi;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_edukasi, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.tv_judul.setText(listedukasi.get(position).getJudul());
        Picasso.get().load(listedukasi.get(position).getUrledukasi()).into(holder.iv_urledukasi);
    }

    @Override
    public int getItemCount() {
        return listedukasi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_judul;
        private ImageView iv_urledukasi;
        private CardView ll_cardrs;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_urledukasi = (ImageView) itemView.findViewById(R.id.urledukasi);
            tv_judul = (TextView) itemView.findViewById(R.id.judul);
            ll_cardrs = (CardView) itemView.findViewById(R.id.linearlayoutcardrs);
        }
    }
}