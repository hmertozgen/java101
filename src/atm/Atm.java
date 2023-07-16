package atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        while(right>0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName=inp.nextLine();
            System.out.println("Parolanızı giriniz: ");
            password=inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba Ozgen banka hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }


                }while(select !=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
