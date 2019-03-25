package com.radit.kakao;

public class Edukasi {

    private String judul, urledukasi, isiedukasi;

    public Edukasi() {

    }

    public Edukasi(String judul, String urledukasi, String isiedukasi) {
        this.judul = judul;
        this.urledukasi = urledukasi;
        this.isiedukasi = isiedukasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getUrledukasi() {
        return urledukasi;
    }

    public String getIsiedukasi() {
        return isiedukasi;
    }
}
