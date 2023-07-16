package untilEnterOddNumber;

import java.util.Scanner;

public class UntilEnterOddNumber {
    public static void main(String[] args) {
        int i,counter=0;

        do {
            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();

            if (i % 4 == 0){
                counter += i;
            }

        } while (i % 2 == 0);
        System.out.println("Sonuc: " + counter);
    }
}
