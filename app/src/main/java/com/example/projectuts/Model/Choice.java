package com.example.projectuts.Model;

public class Choice {

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String nama) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Choice(String foto, String nama, String jenis, int harga) {
        this.foto = foto;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public String foto;
    public String nama;
    public String jenis;
    public int harga;
}
