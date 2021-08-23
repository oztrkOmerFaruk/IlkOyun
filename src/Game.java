package Oyun009.src;

import java.util.Scanner;

public class Game {

    Player player;

    static Lokasyon location =new Lokasyon() {
        @Override
        public boolean getLocation() {
            return false;
        }
    };

    Scanner scan =new Scanner(System.in);

    public void giris(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Şimdi Oyun zamanı...!");
        System.out.print("İsminizi giriniz : ");
        String playerIsim =scan.nextLine();
        player = new Player(playerIsim);
        player.karakterSec();
        start();

    }

    public void start(){
        while(true){
            System.out.println();
            System.out.println("1. Evim -->  Burda düşman yok, güvendesin !");
            System.out.println("2. Mağara --> Dikkat Ayı çıkabilir !");
            System.out.println("3. Orman --> Dikkat Wampir çıkıp sizi yiyebilir !");
            System.out.println("4. Nehir --> Dikkat Zombi gelebilir !");
            System.out.println("5. Mağaza --> Burdan gerekli levazmatı tedarik edebilirsin !");
            System.out.println("6. Çıkış --> Hayatta kaldığın için şanslısın !");
            System.out.println("Gitmek istediğin yer : ");
            int sec = scan.nextInt();

            while (sec <=0 || sec > 6){
                System.out.println("Geçerli bir sayı giriniz !");
                sec= scan.nextInt();
            }

            switch (sec){
                case 1 :location = new Evim(player);
                break;
                case 2 :location = new Magara(player);
                    break;
                case 3 :location = new Orman(player);
                    break;
                case 4 :location = new Nehir(player);
                    break;
                case 5 :location = new Magaza(player);
                    break;
                case 6 :
                    System.out.println("Tschüss... Seninle savaşmak bir keyifti..!");;
                    location = new Lokasyon() {
                        @Override
                        public boolean getLocation() {
                            return false;
                        }
                    };
                    break;

            }
            if (!location.getLocation() || sec ==6 ){
                System.out.println("Yeni maceralarda görüşmek üzere !!");
                break;
            }


        }

    }


}
