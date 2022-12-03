
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz");
        String userName = inp.nextLine();
        System.out.println("Şifre Giriniz");
        String password = inp.nextLine();
        if (userName.equals("ugurcankcbs") && password.equals("123456")) {
            System.out.println("Giriş Yaptınız");
        } else if (!userName.equals("ugurcankcbs")) {
            System.out.println("Kullanıcı Adınızı Kontrol Ediniz!");
        } else if (!password.equals("123456")) {
            System.out.println("Şifrenizi Kontrol Ediniz!");
            System.out.println("Şifrenizi sıfırlamak için 1'e basınız");
            String resetPassword = inp.nextLine();
            if (resetPassword.equals("1")) {
                System.out.println("Yeni Şifrenizi Giriniz");
                String newPassword = inp.nextLine();
                if (newPassword.equals(password) && !newPassword.equals("123456")) {
                    System.out.println("Şifre oluşturuldu");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }

    }
}
