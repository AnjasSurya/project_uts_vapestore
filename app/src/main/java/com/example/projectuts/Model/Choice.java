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

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getRasistance() {
        return rasistance;
    }

    public void setRasistance(String rasistance) {
        this.rasistance = rasistance;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getFitur() {
        return fitur;
    }

    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    public Choice(String foto, String nama, String jenis, String harga, String ukuran, String output, String rasistance, String bahan, String fitur) {
        this.foto = foto;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.ukuran = ukuran;
        this.output = output;
        this.rasistance = rasistance;
        this.bahan = bahan;
        this.fitur = fitur;
    }

    public String foto;
    public String nama;
    public String jenis;
    public String harga;
    public String ukuran;
    public String output;
    public String rasistance;
    public String bahan;
    public String fitur;
}
