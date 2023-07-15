package airplaneTicketPriceCalculator;

import java.util.Scanner;

public class AirplaneTicketPriceCalculator {
    public static void main(String[] args) {
        // kullanicidan degiskenlerin degerini almak icin input nesnemizi kullanacagiz
        Scanner input = new Scanner(System.in);
        // degiskenlerimizi tanimliyoruz
        int distance,age,tripType;
        double total;
        // kullanicidan degiskenlere deger girmelerini istiyoruz
        System.out.print("Mesafeyi km türünden giriniz: ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType=input.nextInt();
        // girilen degerlerin dogru aralikta olup olmadigina bakiyoruz
        if ((distance>0) && (age>0) && (tripType==1 || tripType==2)){
            // uzaklik ile tutar hesaplandi
            total=distance*0.10;
            // yas indirimi kismi
            if(age<12){
                total-=total*0.5; // tutarin yarisini cikar ve degiskene ata
            }if (age>=12 && age<=24) {
                total-=total*0.1;
            }if (age>=65){
                total-=total*0.3;
            }
            // yolculuk tipine gore indirim kismi
            if(tripType==2){
                total -= total*0.2; // gidis-donus ise indirim yapılıyor
                total *=2; // iki yonlu oldugu icin gidis-gelis tutar hesaplandi
            }
            // sonuc kismi
            System.out.println("Toplam Tutar = "+total+" TL");
        }else{
            // verilere istenilmeyen aralikta deger verildiyse dondurelecek hata kismi
            System.out.println("Hatali veri tipi girdiniz!");
        }

    }
}
