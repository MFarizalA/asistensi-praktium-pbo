package Modul2;

public class Mahasiswa {
    private String nama;
    private int nim;
    private String jurusan;
    public Dosen dosen;

    public Mahasiswa(String nama, int nim, String jurusan, Dosen dosen){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.dosen = dosen;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNama(){
        return this.nama;
    }

    public String getNamaDosen() {
        return dosen.getNama();
    }


}
