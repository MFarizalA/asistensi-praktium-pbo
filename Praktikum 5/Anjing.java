abstract public class Anjing {
    String breed;

    public Anjing(String breed) {
        this.breed = breed;
    }

    public void barking(){
        System.out.println("Woof woof woof");
    }

    abstract void anjingGendotBat();
    abstract void anjingBerenang();
}
