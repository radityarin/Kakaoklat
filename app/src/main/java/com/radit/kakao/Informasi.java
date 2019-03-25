package com.radit.kakao;

public class Informasi {
    private String judul, berita, urlgambarinformasi;

    public Informasi(){

    }

    public Informasi(String judul, String berita, String urlgambarinformasi) {
        this.judul = judul;
        this.berita = berita;
        this.urlgambarinformasi = urlgambarinformasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getBerita() {
        return berita;
    }

    public String getUrlgambarinformasi() {
        return urlgambarinformasi;
    }
}
