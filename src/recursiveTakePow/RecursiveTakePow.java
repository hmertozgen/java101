package recursiveTakePow;

import java.util.Scanner;

public class RecursiveTakePow {

    static int pow(int num1, int num2){
        if (num2==0){
            return 1;
        }else{
            return num1*pow(num1,num2-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cont=true;

        while (cont) {
            System.out.print("Taban Değeri:");
            int abc = input.nextInt();
            System.out.print("Üs:");
            int cba = input.nextInt();
            System.out.println("SONUÇ => " + pow(abc, cba));

            System.out.println("Devam etmek istiyor musunuz? (E/H) ");
            String goOn = input.next();

            if (goOn.equalsIgnoreCase("H")) {
                cont = false;
            }
        }
    }
}
