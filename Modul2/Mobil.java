package Modul2;

public class Mobil {
    private Mesin mesin;
    private Transmisi transmisi;

    public void setMesin (Mesin me) {
        this.mesin = me;
    }

    public void setTransmisi (Transmisi trans) {
        this.transmisi = trans;
    }

    public String getNamaTransmisi (){
        return this.transmisi.getTipe();
    }

    public String getNamaMesin () {
        return this.mesin.getNamaMesin();
    }

}
