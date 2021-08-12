package com.polinema.aplikasisederhana_listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.polinema.aplikasisederhana_listview.adapters.NegaraAdapter;
import com.polinema.aplikasisederhana_listview.models.NegaraModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Instansiasi Recycle view
    RecyclerView rvNamaNegara;

    //    instasiasi model nya
    List<NegaraModel> listNegara = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        hubungkan ke layout
        rvNamaNegara = findViewById(R.id.rvNamaNegara);

//        coba buat object
        NegaraModel negara = new NegaraModel("Indonesia", "jakarta");

//        tambah ke list
        listNegara.add(negara);

        //        coba buat object
        negara = new NegaraModel("Malaysia", "kuala Lumpur");

//        tambah ke list
        listNegara.add(negara);

//        Instasiasi Adapter nya
        NegaraAdapter negaraAdapter = new NegaraAdapter(listNegara);
         // set adapter dan layoutmanager
        rvNamaNegara.setAdapter(negaraAdapter);
        rvNamaNegara.setLayoutManager(new LinearLayoutManager(this));
    }
}