public class Ikan extends Binatang{
    int jumlahKaki = 0;

    public Ikan() {
        super();
    }

    public void berenang(){
        System.out.println("Saya berenang dengan menggunakan kaki sebanyak" + super.jumlahKaki);
    }

    public void bernafas(){
        super.bernafas();
    }
}
