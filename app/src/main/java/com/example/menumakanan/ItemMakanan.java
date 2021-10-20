package com.example.menumakanan;

public class ItemMakanan {

    private String namaMakanan, Deskripsi;
    private  Integer hargaMakanan, idGambar;

    public ItemMakanan(String makanan, int harga, String deskripsi, int gambar) {
        namaMakanan = makanan;
        hargaMakanan = harga;
        Deskripsi = deskripsi;
        idGambar = gambar;

    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getHargaMakanan() {
        return hargaMakanan.toString();
    }

    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    public Integer getIdGambar() {
        return idGambar;
    }

    public void setIdGambar(int idGambar) {
        this.idGambar = idGambar;
    }
}
