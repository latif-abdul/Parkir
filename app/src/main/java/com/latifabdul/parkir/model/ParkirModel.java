package com.latifabdul.parkir.model;


public class ParkirModel{
    private String platNomor;
    private String tglMasuk;
    private String tglKeluar;
    private String jamMasuk;
    private String jamKeluar;
    private String jenisKendaraan;

    public ParkirModel() {
    }

    public ParkirModel(String platNomor, String tglMasuk, String tglKeluar, String jamMasuk, String jamKeluar, String jenisKendaraan) {
        this.platNomor = platNomor;
        this.tglMasuk = tglMasuk;
        this.tglKeluar = tglKeluar;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getTglKeluar() {
        return tglKeluar;
    }

    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
}