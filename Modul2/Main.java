package Modul2;

public class Main {

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Pak Astra");
        Mahasiswa mahasiswa = new Mahasiswa("Rizal", 123, "perminyakan", dosen);
        //mahasiswa.setDosen(dosen);
        //System.out.println(mahasiswa.dosen.getNama());

        System.out.println(mahasiswa.getNamaDosen());



        Mesin engine = new Mesin();
        engine.setKekuatan(1000);
        engine.setNamaMesin("Mercedes");

        Transmisi transmission = new Transmisi();
        transmission.setTipe("Matic");

        Mobil avanza = new Mobil();
        avanza.setMesin(engine);
        avanza.setTransmisi(transmission);

        System.out.println(avanza.getNamaTransmisi());
        System.out.println(avanza.getNamaMesin());

    }
}
//asosiasi
//agregasi (has a)
//komposisi (owns a)