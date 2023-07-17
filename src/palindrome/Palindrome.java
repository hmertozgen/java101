package palindrome;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int number){
        int temp =number , reverseNumber=0,lastNumber;
        while(temp !=0){
            //System.out.println("Sayı => " + temp);

            lastNumber=temp %10;
            //System.out.println("Son Basamak => " + lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            //System.out.println("Yeni Sayı => " + reverseNumber);

            temp /=10;
        }
        if (reverseNumber==number){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {
        int numb;
        Scanner input=new Scanner(System.in);
        System.out.println("Palindrom mu değil mi sorgula: ");
        numb =input.nextInt();
        System.out.println(isPalindrome(numb));
    }
}
