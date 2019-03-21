package com.radit.kakao;

public class Produk {

    private String namaProduk, urlProduk, kategori, idproduk, informasiproduk;
    private int hargaProduk;

    public Produk() {
    }

    public Produk(String idproduk, String namaProduk, String urlProduk, String kategori, int hargaProduk, String informasiproduk) {
        this.namaProduk = namaProduk;
        this.urlProduk = urlProduk;
        this.kategori = kategori;
        this.idproduk = idproduk;
        this.hargaProduk = hargaProduk;
        this.informasiproduk = informasiproduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getUrlProduk() {
        return urlProduk;
    }

    public String getKategori() {
        return kategori;
    }

    public String getIdproduk() {
        return idproduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public String getInformasiproduk() {
        return informasiproduk;
    }
}
