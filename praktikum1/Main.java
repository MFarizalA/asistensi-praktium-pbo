package com.praktikum1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 3;
        String Nama = "Rijal";
        System.out.println("Hello World! " + Nama);

        Ikan tongkol = new Ikan();
        Ikan tongkol1 = new Ikan(3);
        System.out.println(tongkol1.jumlahSirip);

        Ikan piranha = new Ikan(2, 2000, "male");
        System.out.println(piranha.jumlahSirip);
        System.out.println(piranha.hargaIkan);
        System.out.println(piranha.jenisKelamin);

        Scanner masuk = new Scanner(System.in);

        int paus = masuk.nextInt();
        String hiu = masuk.nextLine();

        System.out.println(paus);

        //ini komentar satu baris
        /*ini komentar
         * lebih dari satu baris*/

        int[] numbers = {2, 3, 4, 5, 6, 7, 8};
        System.out.println("ukuran array : " + numbers.length);

        int[] numbers2 = new int[5]; //array kedua
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;

        System.out.println(numbers2[0] + numbers2[1]);

        int[] numbers3 = new int[5]; //array ketiga

        for (int i=0; i<numbers.length; i++){
           System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = masuk.nextInt();
        }


        if (2 > 3){
            System.out.println("Pintar Sekali Kamu Nak");
        } else if (4 > 2){
            System.out.println("Doa Ibu");
        }

        Ikan [] fishes = new Ikan[3];
        fishes[0] = new Ikan(2, 40000, "male");
        fishes[1] = new Ikan(15, 100000, "female");
        fishes[2] = new Ikan(20, 1000000, "male");

        System.out.println("jenis kelamin ikan yang pertama : " + fishes[0].jenisKelamin);
        System.out.println("jenis kelamin ikan yang pertama : " + fishes[1].jenisKelamin);
        System.out.println("jenis kelamin ikan yang pertama : " + fishes[2].jenisKelamin);

        fishes[2].ngapsIkan();
        System.out.println(fishes[1].jumlahSirip);








    }
}
