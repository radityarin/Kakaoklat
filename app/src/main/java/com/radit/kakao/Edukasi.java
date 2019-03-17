package com.radit.kakao;

public class Edukasi {

    private String judul, urledukasi;

    public Edukasi() {

    }

    public Edukasi(String judul, String urledukasi) {
        this.judul = judul;
        this.urledukasi = urledukasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getUrledukasi() {
        return urledukasi;
    }
}
