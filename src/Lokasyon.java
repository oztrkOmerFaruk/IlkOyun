package Oyun009.src;

import java.util.Scanner;

public abstract class Lokasyon {

    protected Player player;
    protected String name;
    Scanner scan =new Scanner(System.in);

    public Lokasyon (Player player){
        this.player=player;
    }

    public Lokasyon(){

    }



    public abstract boolean getLocation();


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


