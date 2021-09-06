import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========Selamat Datang==========");
        System.out.println("------MENU UTAMA-----");


        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;

        System.out.println("====Silahkan Pilih Menu===");
        System.out.println("1. Kucing");
        System.out.println("2. Harimau");
        System.out.println("3. exit");

        System.out.print("Pilihan : ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                Kucing kucing = new Kucing();
                kucing.makan();
                kucing.minum();
                kucing.lari();
                kucing.melihat();
                kucing.alamat();
                break;

            case 2:
                Harimau harimau = new Harimau();
                harimau.makan();
                harimau.minum();
                harimau.lari();
                harimau.melihat();
                break;

            case 3:
                System.exit(0);
                break;
        }


    }
}
