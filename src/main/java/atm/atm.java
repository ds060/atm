package atm;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500, select, price;

        while (right > 0) {
            System.out.println("Kullanıcı Adınız");
            userName = input.nextLine();
            System.out.println("Parolanız:");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Sisteme giriş yaptınız");

                do {
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println("1- para yatırma/2-Para çekme/3-Bakiye sorgula/4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırılacak tutar:");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("bakiyeniz:" + balance);
                            break;
                        case 2:
                            System.out.println("Çekilecek tutar:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("bakiye yetersiz");
                            } else {
                                balance -= price;

                                System.out.println("bakiyeniz:" + balance);
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz:" + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere!");
                            break;
                        default:
                            System.out.println("geçersiz işlem!");
                            break;
                    }
                } while (select != 4);
                break;

            } else {
                right--;

                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Kartınız bloke olmuştur, lütfen banka ile iletişime geçiniz");
                } else
                    System.out.println("kalan hakkınız:" + right);
            }
        }
    }
    }




