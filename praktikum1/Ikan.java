package com.praktikum1;

public class Ikan {
    protected int jumlahSirip;
    private String jenisKelamin;
    public int hargaIkan;

    public Ikan (){
        System.out.println("Saya berenang");
    }

    public Ikan( int jumlahSirip){
        this.jumlahSirip = jumlahSirip;
    }

    public Ikan (int jumlahSirip, int hargaIkan, String jenisKelamin){
        this.jumlahSirip = jumlahSirip;
        this.hargaIkan = hargaIkan;
        this.jenisKelamin = jenisKelamin;
    }

    public void ngapsIkan(){
        System.out.println("Lagi Berenang");
    }

}
