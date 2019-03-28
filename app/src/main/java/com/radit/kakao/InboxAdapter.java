package com.radit.kakao;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.ViewHolder> {

    private ArrayList<Inbox> listinbox;
    private Context context;

    public InboxAdapter(ArrayList<Inbox> listinbox, Context context) {
        this.listinbox = listinbox;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_inbox, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
    }

    @Override
    public int getItemCount() {
        return listinbox.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_urlgambarpengirim;
        private TextView tv_namapengirim,tv_pesanmasuk;
        private CardView cv_cardinbox;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_urlgambarpengirim = (ImageView) itemView.findViewById(R.id.urlgambarpengirim);
            tv_namapengirim = (TextView) itemView.findViewById(R.id.namapengirim);
            tv_pesanmasuk = (TextView) itemView.findViewById(R.id.pesanmasuk);
            cv_cardinbox = (CardView) itemView.findViewById(R.id.cardinbox);
        }
    }
}