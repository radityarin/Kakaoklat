package com.radit.kakao;

public class Profil {

    private String namaUser, emailUser, NoKTP, NomorHP,TanggalLahir;

    public Profil(String namaUser, String emailUser, String noKTP, String nomorHP, String tanggalLahir) {
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        NoKTP = noKTP;
        NomorHP = nomorHP;
        TanggalLahir = tanggalLahir;
    }

    public String getNamaUser() {
        return namaUser;

    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getNoKTP() {
        return NoKTP;
    }

    public String getNomorHP() {
        return NomorHP;
    }

    public String getTanggalLahir() {
        return TanggalLahir;
    }
}
