package com.polinema.aplikasisederhana_listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.polinema.aplikasisederhana_listview.R;
import com.polinema.aplikasisederhana_listview.models.NegaraModel;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraAdapter.MyViewHolder> {

    //    membuat list
    List<NegaraModel> negaraList;

    public NegaraAdapter(List<NegaraModel> negaraList) {
        this.negaraList = negaraList;
    }

    @NonNull
    @Override
    public NegaraAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Object context di ambil dari parent
        Context context = parent.getContext();
        // object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View negaraView = layoutInflater.inflate(R.layout.item_negara, parent, false);
        //object negaraView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(negaraView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraAdapter.MyViewHolder holder, int position) {
// get salah satu item
        NegaraModel negara = negaraList.get(position);

        //set text namaNegara berdasarkan data dari model negara

        holder.namaNegara.setText(negara.getNamaNegara());
    }

    @Override
    public int getItemCount() {
        return negaraList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView namaNegara;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            namaNegara = itemView.findViewById(R.id.namaNegara);
        }
    }
}
