package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int numb1,numb2,choice;
        Scanner inp =new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        numb1= inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        numb2= inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        choice=inp.nextInt();

        switch (choice){
            case 1:
                System.out.println("Toplam: "+(numb1+numb2));
            case 2:
                System.out.println("Çıkarma: " + (numb1-numb2));
                break;
            case 3:
                System.out.println("Çarpma: " + (numb1*numb2));
                break;
            case 4:
                if (numb2==0)
                    System.out.println("0'a bölemezsiniz");
                else
                    System.out.println("Bölme: " + (numb1/numb2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
        }



    }
}
