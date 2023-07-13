package hipotenus;

import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("a kenar uzunluğunu giriniz: ");
        a=inp.nextInt();
        System.out.println("b kenar uzunluğunu giriniz: ");
        b=inp.nextInt();



        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+c);
    }
}
