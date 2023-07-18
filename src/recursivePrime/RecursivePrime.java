package recursivePrime;

import java.util.Scanner;

public class RecursivePrime {
    static int prime(int num,int i){
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return prime(num,i-1);
        }
    }

    public static void main(String[] args) {
        int num, primee ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        num= scanner.nextInt();

        primee=prime(num,num/2);

        if (primee==1){
            System.out.println(num+" sayisi asaldir");
        }else {
            System.out.println(num+" sayisi asal değildir");
        }
    }
}
