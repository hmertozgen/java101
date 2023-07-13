package kdvCalc;

import java.util.Scanner;

public class kdvCalc {
    public static void main(String[] args) {
        double price,priceKDV,kdvOran=0.18,priceWithKdv;
        Scanner inp = new Scanner(System.in);

        System.out.println("Fiyat giriniz :");
        price=inp.nextInt();

        priceKDV=price*kdvOran;
        priceWithKdv=price+priceKDV;

        System.out.println("KDV TUTARI: " + priceKDV);
        System.out.println("KDVLİ TUTAR: " + priceWithKdv);

    }
}
