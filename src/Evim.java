package Oyun009.src;

public class Evim extends NormalLok {
    Evim(Player player){
        super(player, "Burası kurtarılmış bölge !");
    }


    public boolean getLocation() {
        player.setSaglik(player.can);
        System.out.println("İyileştiniz turp gibisiniz masallah !");
        System.out.println("Güvenli evinizde dinelenebilirsiniz ama maceraya devam etmenizi öneririz lakin yatmaya gelmediniz !...!!!!!");

        return true;
    }
}
