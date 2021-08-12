package com.polinema.aplikasisederhana_listview.models;

public class NegaraModel {

    //    inisiasi
    public String namaNegara,ibukota;

    //    konstruktor
    public NegaraModel(String nama, String ibukota){
        this.namaNegara = nama;
        this.ibukota = ibukota;
    }

    public String getNamaNegara() {
        return namaNegara;
    }

    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }
}
