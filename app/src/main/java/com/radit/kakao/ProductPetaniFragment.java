package com.radit.kakao;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ProductPetaniFragment extends Fragment {

    public ProductPetaniFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_product_petani, container, false);


        RecyclerView recyclerViewpopuler = (RecyclerView) view.findViewById(R.id.recycler_view);
//        recyclerViewpopuler.setAdapter(new ProdukPetaniAdapter(listprodukpetani,getContext()));
        recyclerViewpopuler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false));

        return view;
    }

}
