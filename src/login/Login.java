package login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String loginId = "patika";
        String rightPassword = "java1234";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String enteredUserName = scanner.nextLine();

        System.out.print("Şifre: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUserName.equals(loginId) && enteredPassword.equals(rightPassword)) {
            System.out.println("Giriş başarılı!");
        } else if (enteredUserName.equals(loginId)) {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String sifreSifirla = scanner.nextLine();

            if (sifreSifirla.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Şifre: ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals(enteredPassword) || newPassword.equals(rightPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }
}
