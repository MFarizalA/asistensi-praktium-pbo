public class Main {

    public static void main(String[] args) {
        Cihuahua ci = new Cihuahua("Cihuahua");
        //ci.breed = "Cihuahua";
        ci.barking();

        System.out.println(ci.breed);
        ci.anjingGendotBat();
        ci.anjingBerenang();

        Malamute m = new Malamute("Malamute");
        m.anjingGendotBat();
        m.anjingBerenang();

        DogInterface dogInterface = new DogInterface() {
            @Override
            public void anjingMemanjat() {
                System.out.println("Aniing Memanjat");
            }

            @Override
            public void anjingMinum() {
                System.out.println("Anjing Minum");
            }
        };

        dogInterface.anjingMemanjat();
        dogInterface.anjingMinum();
    }
}
