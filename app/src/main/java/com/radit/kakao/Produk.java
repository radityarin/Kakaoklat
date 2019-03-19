package com.radit.kakao;

public class Produk {

    String namaProduk, urlProduk, kategori;
    int hargaProduk;

    public Produk(String namaProduk, String urlProduk, String kategori, int hargaProduk) {
        this.namaProduk = namaProduk;
        this.urlProduk = urlProduk;
        this.kategori = kategori;
        this.hargaProduk = hargaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getUrlProduk() {
        return urlProduk;
    }

    public void setUrlProduk(String urlProduk) {
        this.urlProduk = urlProduk;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }
}
