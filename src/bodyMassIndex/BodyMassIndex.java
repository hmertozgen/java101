package bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height,BMI;
        int weight;
        Scanner inp=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(m) : ");
        height=inp.nextDouble();

        System.out.println("Kilonuzu giriniz     : ");
        weight=inp.nextInt();

        BMI=weight/(height*height);

        System.out.println("BMI : " + BMI);

    }
}
