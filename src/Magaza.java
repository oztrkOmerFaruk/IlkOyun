package Oyun009.src;

public class Magaza extends NormalLok {
    Magaza(Player player) {
        super(player,"Silah Mağazasındasınız..!");
    }



    public boolean getLocation() {
        System.out.println(player.getkIsim()+ " Karakterinin Parası :" + player.getPara());
        System.out.println("1. Silahlar ");
        System.out.println("2. Zırhlar ");
        System.out.println("3. Çıkış ");
        System.out.println("Seçiminiz :");
        int secim = scan.nextInt();
        int scmSilahID;
        int scmZirhAl;

        switch (secim){
            case 1 :
                scmSilahID =silahMenu();
                silahSatinAl(scmSilahID);
                break;
            case 2 :
                scmZirhAl =zirhMenu();
                zirhSatinAl(scmZirhAl);
                break;
            case 3 :
                System.out.println(" Demek gidiyorsun seni özlicz bye bye !");
                break;
        }
        return true;

    }

    public int silahMenu(){
        System.out.println("1. Uzun Namlulu Silah\t Para : 5 - Hasar : 8 ");
        System.out.println("2. Kılıç\t Para : 8 - Hasar : 3 ");
        System.out.println("3. Ok\t Para : 3 - Hasar : 5 ");
        System.out.println("4. Çıkış..");
        System.out.println("Silah seçiminiz : ");
        int slhNo =scan.nextInt();
        return  slhNo;
    }
    public int zirhMenu(){
        System.out.println("1. Hafif\t Para : 3 - Defans : 1 ");
        System.out.println("2. Orta\t Para : 4 - Defans : 2 ");
        System.out.println("3. Agir\t Para : 5 - Defans : 3 ");
        System.out.println("4. Çıkış..");
        System.out.println("Zirh seçiminiz : ");
        int zirhNo =scan.nextInt();
        return  zirhNo;
    }

    public void silahSatinAl(int malzNo){
        int hasar = 0, para =0;
        String silahAdi =null;

        switch (malzNo){
            case 1 :
                hasar =8;
                silahAdi ="Uzun Namlulu Silah";
                para =5;
                break;
            case 2 :
                hasar =3;
                silahAdi ="Kılıç";
                para =8;
                break;
            case 3 :
                hasar =5;
                silahAdi ="Ok";
                para =3;
                break;
            case 4 :
                System.out.println("Çıkış..");
                break;
            default:
                System.out.println("Geçersiz işlem !");
                break;

        }

        if (para>0){
            if (player.getPara()>para){
                player.getEnv().setHasar(hasar);
                player.getEnv().setSilahAdi(silahAdi);
                player.setPara(player.getPara()-para);
                System.out.println(silahAdi + " satın aldınız..");
                System.out.println("Kalan Paranız : "+ player.getPara());
            }else {
                System.out.println("Yetersiz Bakiye..!");
            }
        }

    }

    public void zirhSatinAl(int malzNo){
        int zirh = 0, para =0;
        String zirhAdi =null;

        switch (malzNo){
            case 1 :
                zirh =1;
                zirhAdi ="Hafif";
                para =3;
                break;
            case 2 :
                zirh =2;
                zirhAdi ="Orta";
                para =4;
                break;
            case 3 :
                zirh =3;
                zirhAdi ="Ağır";
                para =5;
                break;
            case 4 :
                System.out.println("Çıkış..");
                break;
            default:
                System.out.println("Geçersiz işlem !");
                break;

        }

        if (para>0){
            if (player.getPara()>para){
                player.getEnv().setHasar(zirh);
                player.getEnv().setSilahAdi(zirhAdi);
                player.setPara(player.getPara()-para);
                System.out.println(zirhAdi + " satın aldınız..");
                System.out.println("Kalan Paranız : "+ player.getPara());
            }else {
                System.out.println("Yetersiz Bakiye..!");
            }
        }

    }
}
