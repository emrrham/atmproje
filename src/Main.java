 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bakiyenizi giriniz : ");
        int bakiye = s.nextInt();

        System.out.println("Hoşgeldiniz!");
        System.out.println("1- Bakiye görüntüleme : ");
        System.out.println("2- para çekme");
        System.out.println("3- para yatırma");
        System.out.println("4- çıkış");

        int secim = s.nextInt();

        switch (secim) {
            case 1:
                System.out.println("bakiyeniz :" +bakiye+ "TL");
                break;
            case 2:
                System.out.println("Çekmek istediğiniz miktar : ");
                int para = s.nextInt();
                if (para > bakiye) {
                    System.out.println("paran yok fackir.");
                } else {
                    bakiye -= para;
                    System.out.println("Bakiyeniz : "+ bakiye +"TL" );

                }
                break;
            case 3:
            System.out.println("Yatırmak istediğiniz tutar: ");
            int yatirma = s.nextInt();
            bakiye += yatirma;
            System.out.println("Yeni bakiyeniz : " +bakiye+ "TL");
                break;
            case 4:
                System.out.println("İyi Günler");
            default:
                System.out.println("Yanlış girdiniz");
                break;
        }



    }
}