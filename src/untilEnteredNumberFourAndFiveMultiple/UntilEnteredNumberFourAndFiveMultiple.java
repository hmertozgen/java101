package untilEnteredNumberFourAndFiveMultiple;

import java.util.Scanner;

public class UntilEnteredNumberFourAndFiveMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,i=1;
        System.out.print("Sayı Giriniz: ");
        sayi=input.nextInt();
        boolean control4=true,control5=true;

        while(control4||control5) {
            if (Math.pow(4, i) < sayi && control4) {
                System.out.print("4'ün kuvveti: " + Math.pow(4, i));
            }else{
                control4=false;
            }
            if (Math.pow(5, i)<sayi && control5){
                System.out.print("     5'in Kuvveti: " + Math.pow(5, i));
            }else{
                control5=false;
            }
            i++;
            System.out.println();
        }
    }
}
