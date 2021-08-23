package Oyun009.src;

import java.util.Random;

public class Canavar {
    private String isim;
    private int hasar,saglik,para;

    public Canavar(String isim, int hasar, int saglik, int odul) {
        this.isim = isim;
        this.hasar = hasar;
        this.saglik = saglik;
        this.para = odul;
    }

    public int sayac (){
        Random r=new Random();
        return r.nextInt(5)+1;
    }

    public String getIsim() {
        return isim;
    }

    public int getHasar() {
        return hasar;
    }

    public int getSaglik() {
        return saglik;
    }

    public int getPara() {
        return para;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }

    public void setPara(int para) {
        this.para = para;
    }
}
