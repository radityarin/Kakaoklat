package com.radit.kakao;

public class Informasi {
    private String judul, berita;

    public Informasi(){

    }

    public Informasi(String judul, String berita){
        this.judul=judul;
        this.berita=berita;
    }

    public String getJudul() {
        return judul;
    }

    public String getBerita() {
        return berita;
    }
}
