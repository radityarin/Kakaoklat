package com.radit.kakao;

public class ProfilPetani {

    private String namaUser, emailUser, NoKTP, nomorHP, tanggalLahir, urlphoto, alamat;

    public ProfilPetani() {
    }

    public ProfilPetani(String namaUser, String emailUser, String noKTP, String nomorHP, String tanggalLahir) {
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        NoKTP = noKTP;
        this.nomorHP = nomorHP;
        this.tanggalLahir = tanggalLahir;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNoKTP() {
        return NoKTP;
    }

    public void setNoKTP(String noKTP) {
        NoKTP = noKTP;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }
}
