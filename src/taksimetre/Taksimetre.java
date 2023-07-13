package taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km,minPrice=20,starter=10;
        double totalPrice,perKmPrice=2.20;
        Scanner inp =new Scanner(System.in);
        System.out.println("Kaç km yol gidildi : ");
        km=inp.nextInt();

        totalPrice=starter+(km*perKmPrice);

        if(totalPrice<minPrice){
            totalPrice=minPrice;
        }

        System.out.println("Ödenecek tutar:" +totalPrice);



    }
}
