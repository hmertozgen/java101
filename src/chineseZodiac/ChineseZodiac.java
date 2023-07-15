package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int year,carry;
        System.out.print("Enter your birth year: ");
        year = inp.nextInt();
        carry = year%12;

        switch (carry){
            case 0:
                System.out.println("Your Chinese zodiac sign : Monkey");
                break;
            case 1:
                System.out.println("Your Chinese zodiac sign : Rooster");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign : Dog");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign : Pig");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign : Rat");
                break;
            case 5:
                System.out.println("Your Chinese zodiac sign : Ox");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign : Tiger");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign : Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign : Dragon");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign : Snake");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign : Horse");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign : Sheep");
                break;
        }
    }
}
