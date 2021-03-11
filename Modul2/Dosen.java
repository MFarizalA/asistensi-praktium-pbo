package Modul2;

public class Dosen {
    private String nama;
    private int nip;
    private String jurusan;
    public Mahasiswa mahasiswa;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   public void setMahasiswa (Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
   }

}
