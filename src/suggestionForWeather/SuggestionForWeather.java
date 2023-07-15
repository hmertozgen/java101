package suggestionForWeather;

import java.util.Scanner;

public class SuggestionForWeather {
    public static void main(String[] args) {
        int heat;
        Scanner inp =new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        heat = inp.nextInt();
        
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (5<=heat && heat<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (15<=heat && heat<25) {
            System.out.println("Pikniğe gidebilirsiniz");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
